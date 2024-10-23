package org.example.compilador;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class errorMngr extends BaseErrorListener {
    private String msg;
    private int line;

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line, int charPositionInLine,
                            String msg,
                            RecognitionException e) {

        // Aquí obtienes la línea, la posición del carácter y el mensaje del error
        System.err.println("Error en la línea " + line + ":" + charPositionInLine + " - " + msg);
        this.line = line;
        this.msg=msg;

        // Si deseas, puedes lanzar una excepción o manejar el error de otra manera
        // throw new RuntimeException("Syntax Error");
    }
    int getLine(){
        return this.line;
    }
    String getMsg(){
        return this.msg;
    }
}