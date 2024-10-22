/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lenguaje;

import java.util.HashMap;
import java.util.Map;
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

        // Añadir la nueva variable al mapa
        variables.put(nombreVariable, var);
        System.out.println("Variable " + nombreVariable + " definida correctamente con valor " + valor + ".");
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
            // Si el valor es un número directamente, se actualiza
            var.valor = valor;
            System.out.println("Variable " + nombreVariable + " actualizada correctamente con valor " + valor + ".");
        }
    }
    
    
}
