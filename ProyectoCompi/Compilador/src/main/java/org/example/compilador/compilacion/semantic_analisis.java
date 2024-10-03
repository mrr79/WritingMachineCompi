package org.example.compilador.compilacion;
import java.util.HashMap;
import java.util.Map;
public class semantic_analisis extends gramaticaBaseVisitor<Void>{
    private Map<String, String> symbols = new HashMap<>();

    // Insertar símbolo en la tabla
    public void addSymbol(String name, String type) {
        symbols.put(name, type);
    }

    // Verificar si un símbolo está definido
    public boolean isDefined(String name) {
        return symbols.containsKey(name);
    }

    // Obtener el tipo de un símbolo
    public String getType(String name) {
        return symbols.get(name);
    }
    //metodos para el semantico
    // Visitar la declaración de variables
    /*
    @Override
    public Void visitVarDecl(gramaticaParser.VarDeclContext ctx) {
        String varName = ctx.IDENTIFIER().getText();
        String varType = ctx.TYPE().getText();

        // Insertar la variable en la tabla de símbolos
        if (!symbolTable.isDefined(varName)) {
            symbolTable.addSymbol(varName, varType);
        } else {
            System.out.println("Error: Variable '" + varName + "' ya está definida.");
        }

        return null;
    }*/
}
