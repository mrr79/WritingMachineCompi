/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lenguaje;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author andres
 */
public class Funciones {
    
    // Clase interna Variable
    class Variable {
        DataType tipo;
        String valor;
    }

    // Enumeración interna DataType
    enum DataType {
        Numero,
        Logico
    }

    // Mapa para almacenar las variables
    private final Map<String, Variable> variables = new HashMap<>();

    // Método Def que define y verifica variables
    public void Def(String nombreVariable, String valor) {
        Variable varExistente = variables.get(nombreVariable);

        if (varExistente != null) {
            // La variable ya existe, verificar si el tipo es consistente
            if ((valor.equals("TRUE") || valor.equals("FALSE")) && varExistente.tipo == DataType.Numero) {
                System.err.println("Error semántico: No se puede asignar un valor lógico a una variable de tipo Número.");
                return;
            }
            if (Character.isDigit(valor.charAt(0)) && varExistente.tipo == DataType.Logico) {
                System.err.println("Error semántico: No se puede asignar un valor numérico a una variable de tipo Lógico.");
                return;
            }
            System.out.println("Variable " + nombreVariable + " redefinida correctamente con valor " + valor + ".");
            return;
        }

        // Crear nueva variable
        Variable var = new Variable();

        // Verificar tipo de dato
        if (valor.equals("TRUE") || valor.equals("FALSE")) {
            var.tipo = DataType.Logico;
        } else if (Character.isDigit(valor.charAt(0))) {
            var.tipo = DataType.Numero;
        } else {
            System.err.println("Error: Valor no asignado correctamente.");
            return;
        }
        
        var.valor = valor;

        // Añadir la nueva variable al mapa
        variables.put(nombreVariable, var);
        System.out.println("Variable " + nombreVariable + " definida correctamente con valor " + valor + ".");
    }
    
    public void Serch(String nombreVariable){
        
        Variable varExistente = variables.get(nombreVariable);
        if (varExistente != null) {
            System.out.println("La variable si existe y este es su valor " + varExistente.valor);
           
        }
        else{
            System.err.println("La variable no existe");
        }
        
        
    }
    
    
    public void Put(String nombreVariable, String valor) {
        Variable var = variables.get(nombreVariable);
        if (var == null) {
            System.err.println("Error: La variable " + nombreVariable + " no existe.");
            return;
        }

        // Expresión regular para detectar la operación Substr
        Pattern operationPattern = Pattern.compile("Substr\\((\\d+),\\s*(\\d+)\\)");
        Matcher match = operationPattern.matcher(valor);

        if (match.matches()) {
            // Si coincide con la operación Substr, realiza la operación
            int op1 = Integer.parseInt(match.group(1));
            int op2 = Integer.parseInt(match.group(2));
            int resultado = op1 - op2;
            var.valor = String.valueOf(resultado);
            System.out.println("Variable " + nombreVariable + " actualizada con el resultado de la operación: " + var.valor + ".");
        } else {
            System.out.print("Este es el valor de la variable antes del put "+ var.valor);
            // Si el valor es un número directamente, se actualiza
            var.valor = valor;
            System.out.println("Variable " + nombreVariable + " actualizada correctamente con valor " + valor + ".");
        }
    }
    
    // Método para incrementar el valor de una variable
    public void Add(String nombreVariable, String incremento) {
        Variable var = variables.get(nombreVariable);
        if (var == null) {
            System.err.println("Error: La variable " + nombreVariable + " no existe.");
            return;
        }

        // Verificar si la variable es de tipo número
        if (var.tipo != DataType.Numero) {
            System.err.println("Error semántico: Solo se pueden incrementar variables numéricas.");
            return;
        }
        
        System.out.print("Este es el valor de " +nombreVariable + var.valor);

        // Obtener el valor actual de la variable
        int valorActual = Integer.parseInt(var.valor);
        int incrementoValor;

        // Verificar si el incremento es un número o una variable
        if (Character.isDigit(incremento.charAt(0))) {
            incrementoValor = Integer.parseInt(incremento);
        } else {
            Variable varIncremento = variables.get(incremento);
            if (varIncremento == null) {
                System.err.println("Error: La variable " + incremento + " no existe.");
                return;
            }
            if (varIncremento.tipo != DataType.Numero) {
                System.err.println("Error semántico: El incremento debe ser un número o una variable numérica.");
                return;
            }
            incrementoValor = Integer.parseInt(varIncremento.valor);
        }

        // Realizar el incremento
        valorActual += incrementoValor;
        var.valor = String.valueOf(valorActual);
        System.out.println("Variable " + nombreVariable + " incrementada correctamente. Nuevo valor: " + var.valor + ".");
    }

    // Sobrecarga del método Add para el valor por defecto de 1
    public void Add(String nombreVariable) {
        Add(nombreVariable, "1");
    }

    public void Equal(String N1, String N2) {
        // Evaluar las dos expresiones
        int valor1 = evaluarExpresion(N1);
        int valor2 = evaluarExpresion(N2);
        
        // Comparar los valores
        if (valor1 == valor2) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
    
    public void And(String N1, String N2) {
        // Expresión regular que captura las comparaciones con <, >, ==, !=
        Pattern comparacionRegex = Pattern.compile("\\s*([a-zA-Z_][a-zA-Z0-9_]*)\\s*(==|!=|>|<)\\s*(\\d+|\\s*[a-zA-Z_][a-zA-Z0-9_]*)\\s*");
        Matcher matchN1 = comparacionRegex.matcher(N1);
        Matcher matchN2 = comparacionRegex.matcher(N2);

        boolean resultadoN1 = false;
        boolean resultadoN2 = false;

        if (matchN1.matches()) {
            // Para N1
            String v1N1 = matchN1.group(1);  // Parte izquierda (variable o expresión)
            String operadorN1 = matchN1.group(2);  // Operador de comparación (>, <, ==, !=)
            String v2N1 = matchN1.group(3);  // Parte derecha (número o variable)

            int valor1N1 = evaluarExpresion(v1N1);
            int valor2N1 = evaluarExpresion(v2N1);

            // Aquí evaluamos la operación de comparación entre los valores de N1
            resultadoN1 = evaluarComparacion(valor1N1, operadorN1, valor2N1);
        } else {
            resultadoN1 = (evaluarExpresion(N1) == 1);
        }

        if (matchN2.matches()) {
            // Para N2
            String v1N2 = matchN2.group(1);  // Parte izquierda (variable o expresión)
            String operadorN2 = matchN2.group(2);  // Operador de comparación (>, <, ==, !=)
            String v2N2 = matchN2.group(3);  // Parte derecha (número o variable)

            int valor1N2 = evaluarExpresion(v1N2);
            int valor2N2 = evaluarExpresion(v2N2);

            // Aquí evaluamos la operación de comparación entre los valores de N2
            resultadoN2 = evaluarComparacion(valor1N2, operadorN2, valor2N2);
        } else {
            resultadoN2 = (evaluarExpresion(N2) == 1);
        }

        // Resultado final de la operación AND
        if (resultadoN1 && resultadoN2) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }

    public void Or(String N1, String N2) {
        // Expresión regular que captura comparaciones con <, >, ==, !=
        Pattern comparacionRegex = Pattern.compile("\\s*([a-zA-Z_][a-zA-Z0-9_]*)\\s*(==|!=|>|<)\\s*(\\d+|\\s*[a-zA-Z_][a-zA-Z0-9_]*)\\s*");
        Matcher matchN1 = comparacionRegex.matcher(N1);
        Matcher matchN2 = comparacionRegex.matcher(N2);
    
        boolean resultadoN1 = false;
        boolean resultadoN2 = false;
    
        // Si N1 es una comparación
        if (matchN1.matches()) {
            String v1N1 = matchN1.group(1);  // Parte izquierda (variable o expresión)
            String operadorN1 = matchN1.group(2);  // Operador de comparación
            String v2N1 = matchN1.group(3);  // Parte derecha (número o variable)
    
            int valor1N1 = evaluarExpresion(v1N1);
            int valor2N1 = evaluarExpresion(v2N1);
    
            // Evaluar la comparación
            resultadoN1 = evaluarComparacion(valor1N1, operadorN1, valor2N1);
        } else {
            // Si no es comparación, evaluar la expresión directamente
            resultadoN1 = evaluarExpresion(N1) == 1;
        }
    
        // Si N2 es una comparación
        if (matchN2.matches()) {
            String v1N2 = matchN2.group(1);  // Parte izquierda (variable o expresión)
            String operadorN2 = matchN2.group(2);  // Operador de comparación
            String v2N2 = matchN2.group(3);  // Parte derecha (número o variable)
    
            int valor1N2 = evaluarExpresion(v1N2);
            int valor2N2 = evaluarExpresion(v2N2);
    
            // Evaluar la comparación
            resultadoN2 = evaluarComparacion(valor1N2, operadorN2, valor2N2);
        } else {
            // Si no es comparación, evaluar la expresión directamente
            resultadoN2 = evaluarExpresion(N2) == 1;
        }
    
        // Evaluar OR lógico
        if (resultadoN1 || resultadoN2) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }

    public void Greater(String N1, String N2) {
        // Evaluar las dos expresiones
        int valor1 = evaluarExpresion(N1);
        int valor2 = evaluarExpresion(N2);
        
        // Comparar si N1 es mayor que N2
        if (valor1 > valor2) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
    
    public void Smaller(String N1, String N2) {
        // Evaluar las dos expresiones
        int valor1 = evaluarExpresion(N1);
        int valor2 = evaluarExpresion(N2);
        
        // Comparar si N1 es menor que N2
        if (valor1 < valor2) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
    













    // Método para evaluar comparaciones entre dos valores
    private boolean evaluarComparacion(int valor1, String operador, int valor2) {
        switch (operador) {
            case "==":
                return valor1 == valor2;
            case "!=":
                return valor1 != valor2;
            case ">":
                return valor1 > valor2;
            case "<":
                return valor1 < valor2;
            default:
                System.err.println("Operador desconocido: " + operador);
                return false;
        }
    }
    

    private int evaluarExpresion(String expresion) {
        // Expresiones regulares para números, variables y comparaciones
        Pattern numberRegex = Pattern.compile("\\d+"); // Para números
        Pattern variableRegex = Pattern.compile("[a-zA-Z_][a-zA-Z0-9_]*"); // Para variables
        Pattern comparisonRegex = Pattern.compile("(\\d+|[a-zA-Z_][a-zA-Z0-9_]*)\\s*(==|!=|>|<)\\s*(\\d+|[a-zA-Z_][a-zA-Z0-9_]*)"); // Para comparaciones
    
        // Si la expresión es un número
        if (numberRegex.matcher(expresion).matches()) {
            return Integer.parseInt(expresion);
        }
    
        // Si la expresión es un valor booleano
        if (expresion.equals("TRUE")) {
            return 1;
        }
        if (expresion.equals("FALSE")) {
            return 0;
        }
    
        // Si la expresión es una comparación
        Matcher comparisonMatcher = comparisonRegex.matcher(expresion);
        if (comparisonMatcher.matches()) {
            // Obtener los dos lados de la comparación y el operador
            String left = comparisonMatcher.group(1);
            String operator = comparisonMatcher.group(2);
            String right = comparisonMatcher.group(3);
    
            // Evaluar las dos partes (pueden ser números o variables)
            int leftValue = evaluarExpresion(left);
            int rightValue = evaluarExpresion(right);
    
            // Realizar la comparación
            switch (operator) {
                case "==":
                    return leftValue == rightValue ? 1 : 0;
                case "!=":
                    return leftValue != rightValue ? 1 : 0;
                case ">":
                    return leftValue > rightValue ? 1 : 0;
                case "<":
                    return leftValue < rightValue ? 1 : 0;
                default:
                    System.err.println("Operador desconocido: " + operator);
                    return 0;
            }
        }
    
        // Si la expresión es una variable
        Matcher variableMatcher = variableRegex.matcher(expresion);
        if (variableMatcher.matches()) {
            Variable var = variables.get(expresion);
            if (var != null) {
                if (var.tipo == DataType.Numero) {
                    return Integer.parseInt(var.valor);
                } else if (var.tipo == DataType.Logico) {
                    return var.valor.equals("TRUE") ? 1 : 0;
                } else {
                    System.err.println("Error: La variable " + expresion + " no es de tipo numérico ni lógico.");
                    return 0;
                }
            } else {
                System.err.println("Error: Variable no encontrada: " + expresion);
                return 0;
            }
        }
    
        // Si la expresión no es válida
        System.err.println("Error: Expresión inválida: " + expresion);
        return 0;
    }

    
}
    
