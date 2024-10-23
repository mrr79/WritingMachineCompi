/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lenguaje;

/**
 *
 * @author andres
 */
public class Lenguaje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Funciones manager = new Funciones();
        
        // Definir una variable con nombre y valor
        manager.Def("miVar", "10"); // Definir una variable numérica
        manager.Def("variable2", "TRUE"); // Definir una variable lógica
        manager.Serch("miVar"); // Verificar si la variable existe
        
        // Incrementar el valor de una variable
        manager.Add("miVar", "10"); // miVar será 20
        manager.Add("miVar"); // miVar será 21
        
        // Definir otra variable para el incremento
        manager.Def("otraVar", "5");
        manager.Add("miVar", "otraVar"); // miVar será 26 (21 + 5)

        // Ejemplos de uso de Equal
        System.out.println("Comparación con Equal:");
        boolean resultadoEqual1 = manager.Equal("10", "2*5"); // TRUE (10 == 10)
        System.out.println("Equal(10, 2*5) = " + resultadoEqual1);

        boolean resultadoEqual2 = manager.Equal("miVar", "26"); // TRUE (miVar == 26)
        System.out.println("Equal(miVar, 26) = " + resultadoEqual2);

        boolean resultadoEqual3 = manager.Equal("miVar", "otraVar"); // FALSE (miVar != otraVar, 26 != 5)
        System.out.println("Equal(miVar, otraVar) = " + resultadoEqual3);

        // Ejemplos de uso de And
        System.out.println("Evaluación con And:");
        boolean resultadoAnd1 = manager.And("10 > 2", "5 < 7"); // TRUE (10 > 2 y 5 < 7)
        System.out.println("And(10 > 2, 5 < 7) = " + resultadoAnd1);

        boolean resultadoAnd2 = manager.And("miVar == 26", "otraVar == 5"); // TRUE (miVar == 26 y otraVar == 5)
        System.out.println("And(miVar == 26, otraVar == 5) = " + resultadoAnd2);

        boolean resultadoAnd3 = manager.And("miVar == 26", "otraVar == 10"); // FALSE (miVar == 26 pero otraVar != 10)
        System.out.println("And(miVar == 26, otraVar == 10) = " + resultadoAnd3);
    }
    
}
