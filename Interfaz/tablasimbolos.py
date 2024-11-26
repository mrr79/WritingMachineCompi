from errorMnger import errorMnger
class tablasimbolos:
    _instance = None
    errorMngers = errorMnger()
    def __new__(cls, *args, **kwargs):
        if not cls._instance:
            cls._instance = super(tablasimbolos, cls).__new__(cls, *args, **kwargs)
        return cls._instance
        
    def __init__(self):
        if not hasattr(self, "table"):  # Evita reinicialización
            self.table = [{}]  # Lista de diccionarios para soportar alcances.

    def enter_scope(self):
        self.table.append({})  # Crear un nuevo alcance.

    def exit_scope(self):
        """Elimina el alcance actual."""
        if len(self.table) > 0:
            self.table.pop()
            print("se elimina el scope")
        else:
            raise ValueError("Error: Intento de salir del alcance global.")

    def add_symbol(self, name, symbol_info):
        print("tabla al insertar",self.table)
        if name in self.table[-1]:
            self.errorMngers.add_error(f"Error semántico: '{name}' ya fue declarado en este scope.")
        else:
            self.table[-1][name] = symbol_info
        print("tabla despues de insertar",self.table)

    def lookup(self, name):
        # Buscar en todos los alcances, empezando por el más cercano.
        
        for scope in reversed(self.table):
            print("el scope es:", scope)
            
            if name in scope:
                return scope[name]
        return None  # No encontrado.
    def get_type(self,value): #para buscar en la tabla de valores, use la funcion lookup
        # Si es un identificador, buscamos su tipo en la tabla de símbolos
        #value es el nombre de la
        if isinstance(value, str):
            symbol = self.lookup(value)
            if not symbol:
                self.errorMngers.add_error(f"Error semántico: '{value}' no está declarado.")
                return None
            return symbol['type']
    def get_valueInt(self,value): #para buscar en la tabla de valores, use la funcion lookup
        # Si es un identificador, buscamos su tipo en la tabla de símbolos
        #value es el nombre de la
        if isinstance(value, str):
            symbol = self.lookup(value)
            if not symbol:
                self.errorMngers.add_error(f"Error semántico: '{value}' no está declarado.")
                return None
            return symbol['intValue']
        # Determinamos el tipo de los valores literales
    def edit(self, name, new_value):#new value=simbol info
    # Buscar en todos los alcances, empezando por el más cercano.
        for scope in reversed(self.table):
            if name in scope:
                print(f"Actualizando el valor de {name}. Nuevo valor: {new_value}")
                scope[name] = new_value  # Actualiza el valor en el alcance actual
                return True  # Se actualizó exitosamente
        print(f"No se encontró el símbolo {name} para actualizar.")
        return False  # No se encontró el símbolo
    