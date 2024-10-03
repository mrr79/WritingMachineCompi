package org.example.compilador.compilacion;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class prueba {
    private static final String EXTENSION = "smp";
    private static final String DIRBASE = "src/test/resources/";

    public static void main(String[] args) throws IOException {
        String files[] = args.length==0? new String[]{ "test." + EXTENSION } : args;
        System.out.println("Dirbase: " + DIRBASE);
        for (String file : files){
            System.out.println("START: " + file);

            CharStream in = CharStreams.fromFileName(DIRBASE + file);/*ok*/
            gramaticaLexer lexer = new gramaticaLexer(in);/*ok*/
            CommonTokenStream tokens = new CommonTokenStream(lexer);/*ok*/
            gramaticaParser parser = new gramaticaParser(tokens);/*ok*/
            gramaticaParser.ProgramContext tree = parser.program();
            gramaticaBaseVisitor visitor = new gramaticaBaseVisitor();
            visitor.visit(tree);
            System.out.println("FINISH: " + file);
        }
    }
}
