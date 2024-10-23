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
    
    
    
}
