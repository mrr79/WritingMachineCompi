package org.example.compilador;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import javafx.stage.Window;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import java.util.Objects;

public class HelloController {
    private Compiler compiler;
    private String error;
    public HelloController() { //constructor de la clase , acá se instalarán los modelos
        this.compiler = new Compiler();
    }
    /*
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }*/
    @FXML
    private Button btnFIle;
    @FXML
    private TextArea codeArea;
    @FXML
    private TextArea consoleArea;
    //metodo de compilador que toma el texto del
    //textArea y se lo pasa a mi clase compiler.
    @FXML
    protected void compilarTexto(){
        // Definir el evento del botón
            try {
                // Obtener el texto desde el TextArea
                String inputText = codeArea.getText();

                // Crear un CharStream desde el texto del TextArea

                this.compiler.analizarTexto(inputText);

                // Pasar el CharStream al lexer

                // Continuar con el procesamiento del lexer...
                // Aquí puedes aplicar tus reglas, tokens, etc.
                this.error = compiler.geterrorMessage();
                if(Objects.equals(this.error, "Error en linea:0razón:null")){
                    System.out.println("Texto procesado por el lexer.");
                    consoleArea.setText("Se ha compilado el codigo.");
                }
                else{
                    consoleArea.setText(compiler.geterrorMessage());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
    }
    @FXML
    protected void choseFile() throws IOException {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Seleccionar archivo de texto");

        // Configurar filtro para mostrar solo archivos de texto
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Archivos de Texto", "*.txt"));
        Window stage = btnFIle.getScene().getWindow();
        // Mostrar el FileChooser y obtener el archivo seleccionado
        File selectedFile = fileChooser.showOpenDialog(stage);

        if (selectedFile != null) {
            // Leer y mostrar el contenido en el TextArea
            String content = new String(Files.readAllBytes(Paths.get(selectedFile.toURI())));
            codeArea.setText(content);
        }

    }



}