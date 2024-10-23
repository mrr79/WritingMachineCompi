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
        manager.Serch("miVar"); // Definir una variable lógica
        
        //manager.Put("miVar", "100"); // miVar tendrá el valor 100
        
        // Usar el método Add para incrementar por un valor específico
        manager.Add("miVar", "10"); // miVar será 20
        manager.Add("miVar"); // miVar será 20

        // Definir otra variable para el incremento
        manager.Def("otraVar", "5");

        // Usar el método Add para incrementar con otra variable
        manager.Add("miVar", "otraVar"); // miVar será 66 (61 + 5)
        
    }
    
}
