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
        
        manager.Put("miVar", "100"); // miVar tendrá el valor 100
        
    }
    
}
