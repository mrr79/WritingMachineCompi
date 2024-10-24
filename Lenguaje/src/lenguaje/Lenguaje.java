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
        //manager.Def("miVar", "10"); // Definir una variable numérica
        //manager.Def("variable2", "TRUE"); // Definir una variable lógica
        //manager.Serch("miVar"); // Buscar una variable lógica
        
        // Incrementar variables con Add
        //manager.Add("miVar", "10"); // miVar será 20
        //manager.Add("miVar"); // miVar será 21

        // Definir otra variable para el incremento
        //manager.Def("otraVar", "5");

        // Usar el método Add para incrementar con otra variable
        //manager.Add("miVar", "otraVar"); // miVar será 26 (21 + 5)
        
        
        //manager.ContinueDown("10");  // Ejemplo de uso
        //manager.ContinueUp("3");
        
        //manager.ContinueRight("7");  // Ejemplo de uso
        //manager.ContinueLeft("4");   // Ejemplo de uso
        
        
        // Ejemplo de uso
        //manager.Pos("50", "60");   // Colocar lápiz en X=50, Y=60
        //manager.PosX("30");           // Colocar lápiz en X=30
        //manager.PosY("40");           // Colocar lápiz en Y=40
        
        //manager.Down();       // Pegar el lápiz a la superficie
        //manager.Up();         // Despegar el lápiz de la superficie
        //manager.Beginning(); // Colocar el lápiz en la posición inicial (1,1)
        
        /////////////////////////////////////////////////////////////////////////////
        //Prueba para el repeat
        manager.Def("bucle", "0");
        
        // Definir la instrucción que quieres repetir (en este caso ContinueDown con un valor de 5)
        Runnable instruccion = () -> manager.ContinueDown("5");

        // Llamar a Repeat con la instrucción y la condición
        manager.Repeat(instruccion, "bucle==4");
        
        
        
        /*
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

        System.out.println("Caso 1: Or(10 > 2, 2 > 5)");
        manager.Or("10 > 2", "2 > 5"); // TRUE

        System.out.println("Caso 2: Or(10 > 2, 5 > 1)");
        manager.Or("10 > 2", "5 > 1"); // TRUE

        System.out.println("Caso 3: Or(2 > 10, 1 > 5)");
        manager.Or("2 > 10", "1 > 5"); // FALSE

        System.out.println("Caso 4: Or(miVar > 5, TRUE)");
        manager.Or("miVar > 5", "TRUE"); // TRUE (si miVar es 10, como está definido)

        System.out.println("Caso 5: Or(miVar > 5, otraVar == 5)");
        manager.Or("miVar > 5", "otraVar == 5"); 

        System.out.println("Caso 1: Greater(10, 2 * 5)");
        manager.Greater("10", "2 * 5"); // FALSE (10 no es mayor que 10)
        
        System.out.println("Caso 2: Greater(var1, 2 * 5)");
        manager.Def("var1", "15");
        manager.Greater("var1", "2 * 5"); // TRUE (15 es mayor que 10)

        System.out.println("Caso 3: Greater(3 * 5, 4 * 2)");
        manager.Greater("3 * 5", "4 * 2"); // TRUE (15 es mayor que 8)

        System.out.println("Caso 1: Smaller(10, 2 * 5)");
        manager.Smaller("10", "2 * 5"); // FALSE (10 no es menor que 10)

        System.out.println("Caso 2: Smaller(var1, 2 * 5)");
        manager.Def("var1", "5");
        manager.Smaller("var1", "2 * 5"); // TRUE (5 es menor que 10)

        System.out.println("Caso 3: Smaller(3 + 2, 2 * 5)");
        manager.Smaller("3 + 2", "2 * 5"); // TRUE (5 es menor que 10)
        */
        // Ejemplos de Substr
        System.out.println("Ejemplo Substr:");
        System.out.println("Caso 1: Substr(10, 2)");
        manager.Substr("10", "2"); // Resultado: 8

        System.out.println("Caso 2: Substr(5, 10)");
        manager.Substr("5", "10"); // Error: N1 debe ser mayor o igual a N2

        // Ejemplos de Sum
        System.out.println("\nEjemplo Sum:");
        System.out.println("Caso 1: Sum(1, 2)");
        manager.Sum("1", "2"); // Resultado: 3

        System.out.println("Caso 2: Sum(5, 10)");
        manager.Sum("5", "10"); // Resultado: 15

        // Ejemplos de Random
        System.out.println("\nEjemplo Random:");
        System.out.println("Caso 1: Random(360)");
        manager.Random("360"); // Número aleatorio entre 0 y 360

        System.out.println("Caso 2: Random(100)");
        manager.Random("100"); // Número aleatorio entre 0 y 100

        // Ejemplos de Mult
        System.out.println("\nEjemplo Mult:");
        System.out.println("Caso 1: Mult(2, 5)");
        manager.Mult("2", "5"); // Resultado: 10

        System.out.println("Caso 2: Mult(3, Mult(5, 3))");
        manager.Mult("3", "Mult(5, 3)"); // Resultado: 45 (3 * 15)

        // Ejemplos de Div
        System.out.println("\nEjemplo Div:");
        System.out.println("Caso 1: Div(12, 4)");
        manager.Div("12", "4"); // Resultado: 3

        System.out.println("Caso 2: Div(12, 0)");
        manager.Div("12", "0"); // Error: División por cero
    }
}