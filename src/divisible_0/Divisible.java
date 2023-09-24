package divisible_0;

import java.util.Scanner;

/**
 *
 * @author maryse
 *
 * Prueba de divisibilidad. Éste es un programa en el que se introducen dos
 * números enteros y mediante una sentencia de selección se determina si son
 * divisibles.
 *
 */
public class Divisible {
    
    Scanner entrada = new Scanner(System.in);    
    int n, d;
    public void ent()
    {
        System.out.println("Introduzca dos enteros:");
        n = entrada.nextInt();
        d = entrada.nextInt(); 
    }
    
    public void evalSal()
    {
        if (n%d == 0) {
            System.out.println(n + " es divisible por " + d);
        }
        
    }

    
    public static void main(String[] args) {
        Divisible div;
        div = new Divisible();
        div.ent();
        div.evalSal();
    }

}
