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
        manager.Serch("miVar"); // Buscar una variable lógica
        
        // Incrementar variables con Add
        manager.Add("miVar", "10"); // miVar será 20
        manager.Add("miVar"); // miVar será 21

        // Definir otra variable para el incremento
        manager.Def("otraVar", "5");

        // Usar el método Add para incrementar con otra variable
        manager.Add("miVar", "otraVar"); // miVar será 26 (21 + 5)
        
        // Casos de uso de la función And
        System.out.println("Caso 1: And(true, true)");
        manager.And("TRUE", "TRUE"); // Debe imprimir "TRUE"
        
        System.out.println("Caso 2: And(10>2, 2>5)");
        manager.And("10 > 2", "2 > 5"); // Debe imprimir "FALSE"
        
        System.out.println("Caso 3: And(var1 > 2, 2 < 5)");
        manager.Def("var1", "4"); // Definir var1 como 4
        manager.And("var1 > 2", "2 < 5"); // Debe imprimir "TRUE"

        // Caso adicional: And con lógica combinada
        System.out.println("Caso 4: And(otraVar == 5, miVar > 20)");
        manager.And("otraVar == 5", "miVar > 20"); // Debe imprimir "TRUE"
        
        System.out.println("Caso 5: And(miVar < 30, variable2 == TRUE)");
        manager.And("miVar < 30", "variable2 == TRUE"); // Debe imprimir "TRUE"
        
        System.out.println("Caso 1: Equal(10, 2 * 5)");
        manager.Equal("10", "2 * 5"); // TRUE

        System.out.println("Caso 2: Equal(10, 5)");
        manager.Equal("10", "5"); // FALSE

        System.out.println("Caso 3: Equal(var1, 2 * 5)");
        manager.Equal("var1", "2 * 5"); //
    }
}