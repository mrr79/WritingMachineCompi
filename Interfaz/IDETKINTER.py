import tkinter as tk
from tkinter import filedialog
from lexer import lexer, tokens  # Importa el lexer y los tokens
from parser import parser  # Importa el parser
import subprocess


class IDE:
    def __init__(self, root):
        self.root = root
        self.root.title("WritingMachine IDE")
        self.root.geometry("800x600")

        # Crear el marco principal para el editor
        self.main_frame = tk.Frame(root, bg="#5d6d7e")
        self.main_frame.pack(fill="both", expand=True)

        # Barra de desplazamiento compartida
        self.scrollbar = tk.Scrollbar(self.main_frame)
        self.scrollbar.pack(side="right", fill="y")

        # Crear el área de números de línea
        self.line_numbers = tk.Text(self.main_frame, width=4, padx=5, takefocus=0, border=0,
                                    bg="#5d6d7e",  state="disabled", yscrollcommand=self.scrollbar.set, font=("Liberation Serif", 12))
        self.line_numbers.pack(side="left", fill="y")

        # Crear el área de texto principal
        self.text_area = tk.Text(self.main_frame, wrap="word", yscrollcommand=self.scrollbar.set, bg="#5d6d7e", font=("Liberation Serif", 12))
        self.text_area.pack(side="right", fill="both", expand=True)

        # Configurar el scroll para ambos widgets
        self.scrollbar.config(command=self.sync_scroll)

        # Actualizar números de línea al iniciar y cada vez que se modifique el texto
        self.text_area.bind("<MouseWheel>", self.update_line_numbers)


        # Consola de salida
        self.console = tk.Text(root, height=10, bg="gray", fg="black", state="disabled", font=("Liberation Serif", 12))
        self.console.pack(fill="x")

        # Menú para abrir y guardar archivos
        self.create_menu()

        # Asociar el evento de escritura
        self.text_area.bind("<KeyRelease>", self.on_key_release)

        # Definir palabras clave y colores
        self.keywords = {"procedimiento": "blue"}

    def highlight_syntax(self, event=None):
        """Resalta las palabras clave en el área de texto."""
        # Eliminar todos los tags actuales
        for tag in self.text_area.tag_names():
            self.text_area.tag_delete(tag)

        # Obtener todo el texto
        text_content = self.text_area.get("1.0", "end-1c")

        # Resaltar cada palabra clave
        for word, color in self.keywords.items():
            start_idx = "1.0"  # Comienza desde el principio
            while True:
                # Buscar la palabra clave
                start_idx = self.text_area.search(word, start_idx, stopindex="end", nocase=False)
                if not start_idx:
                    break  # Si no encuentra más coincidencias, salir del bucle

                # Calcular la posición final
                end_idx = f"{start_idx}+{len(word)}c"

                # Aplicar un tag con el color
                self.text_area.tag_add(word, start_idx, end_idx)
                self.text_area.tag_config(word, foreground=color)

                # Mover el índice de inicio para continuar buscando
                start_idx = end_idx



    def create_menu(self):
        menu_bar = tk.Menu(self.root, bg="#5d6d7e", fg="black", font=("Liberation Serif", 12))
        file_menu = tk.Menu(menu_bar, tearoff=0)
        file_menu.add_command(label="Abrir", command=self.open_file)
        file_menu.add_command(label="Guardar", command=self.save_file)
        menu_bar.add_cascade(label="Archivo", menu=file_menu)


        menu_bar.add_command(label="Ejecutar", command=self.run_code)
        self.root.config(menu=menu_bar)

    def open_file(self):
        file_path = filedialog.askopenfilename(
            defaultextension=".txt",
            filetypes=[("Archivos de texto", "*.txt"), ("Todos los archivos", "*.*")]
        )
        if file_path:
            try:
                # Intentar abrir el archivo como UTF-8
                with open(file_path, "r", encoding="utf-8") as file:
                    content = file.read()
            except UnicodeDecodeError:
                # Si falla, intentar con ISO-8859-1
                with open(file_path, "r", encoding="ISO-8859-1") as file:
                    content = file.read()

            # Limpiar el área de texto y cargar el contenido
            self.text_area.delete(1.0, tk.END)
            self.text_area.insert(tk.END, content)

    def save_file(self):
        file_path = filedialog.asksaveasfilename(defaultextension=".txt")
        if file_path:
            with open(file_path, "w") as file:
                file.write(self.text_area.get(1.0, tk.END))

    def update_line_numbers(self, event=None):
        """Actualiza los números de línea para el texto en el editor."""
        self.line_numbers.config(state="normal")
        self.line_numbers.delete(1.0, tk.END)

        # Obtener el número de líneas visibles en el área de texto
        line_count = int(self.text_area.index('end-1c').split('.')[0])

        # Escribir números de línea
        line_numbers_string = "\n".join(str(i) for i in range(1, line_count + 1))
        self.line_numbers.insert("1.0", line_numbers_string)

        self.line_numbers.config(state="disabled")  # Evitar que se editen

    def sync_scroll(self, *args):
        """Sincroniza el desplazamiento entre el área de texto y los números de línea."""
        self.text_area.yview(*args)
        self.line_numbers.yview(*args)

    def run_code(self):
        """Ejecuta el código en el editor y muestra la salida en la consola."""
        code = self.text_area.get("1.0", tk.END).strip()  # Obtener el texto y eliminar espacios en blanco

        # Limpiar la consola antes de mostrar la salida
        self.console.config(state="normal")
        self.console.delete(1.0, tk.END)

        # Verificar si el código está vacío
        if not code:
            self.console.insert(tk.END, "No hay código para ejecutar.\n")
            self.console.config(state="disabled")
            return

        # Ejecutar el código en un proceso separado
        try:
            output = parser.parse(code, lexer=lexer)


            # Mostrar la salida o los errores en la consola
            self.console.insert(tk.END, output)

        except Exception as e:
            # Mostrar cualquier excepción en la consola
            self.console.insert(tk.END, f"Error al ejecutar el código: {e}\n")

        # Desactivar la consola
        self.console.config(state="disabled")

    def on_key_release(self, event=None):
        """Combina la actualización de números de línea y resaltado de sintaxis."""
        self.update_line_numbers()
        self.highlight_syntax()





if __name__ == "__main__":
    root = tk.Tk()
    ide = IDE(root)
    root.mainloop()
