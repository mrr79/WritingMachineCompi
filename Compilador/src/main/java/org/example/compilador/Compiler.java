package org.example.compilador;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.example.compilador.compilacion.gramaticaBaseVisitor;
import org.example.compilador.compilacion.gramaticaLexer;
import org.example.compilador.compilacion.gramaticaParser;

public class Compiler {
    //variables e instancias necesarias para el analisis lexico y sintactico
    private gramaticaLexer lexer;
    private CommonTokenStream tokens ;
    private gramaticaParser parser;
    private CharStream input ;
    String errorMessages; //
    private errorMngr error;
    //metodo que va analizar el texto, configura el texto a un char imput stream
    //ademas de crear los tokens y parsearlos
    //genera el arbol de parseo ast.
    public void analizarTexto(String texto){
        //para manejo de errores:
        errorMessages="";
        //para el analisis del compilador
        this.input= CharStreams.fromString(texto);
        this.lexer=new gramaticaLexer(this.input);
        this.tokens = new CommonTokenStream(this.lexer);/*ok*/
        this.parser = new gramaticaParser(this.tokens);/*ok*/
        parser.removeErrorListeners();
        this.error=new errorMngr();
        parser.addErrorListener(this.error); //optimizar esto
        gramaticaParser.ProgramContext tree = parser.program();
        gramaticaBaseVisitor visitor = new gramaticaBaseVisitor();
        visitor.visit(tree);
        errorMessages ="Error en linea:"+ String.valueOf(this.error.getLine()) + "razón:"+this.error.getMsg();
        ParseTree arbol = parser.program();
        // Imprimir el árbol de análisis
        System.out.println(arbol.toStringTree(parser));
    }
    public String geterrorMessage(){
        return this.errorMessages;
    }
}
