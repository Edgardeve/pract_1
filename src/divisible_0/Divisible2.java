package divisible_0;

import java.util.Scanner;


public class Divisible2 {
    Scanner entrada = new Scanner(System.in);
    public int n, d;            
    public void ent()
    {
      System.out.print("Introduzca primer valor ");
      n = entrada.nextInt();
      System.out.print("Introduzca segundo valor ");
      d = entrada.nextInt();  
    }
    
    public void evalSal()
    {
        if (n%d == 0) {
            System.out.println(n + " es divisible entre " + d);
        } else {
            System.out.println(n + " no es divisible entre " + d);
        }
        
    }

    public static void main(String[] a) {
        Divisible2 div;
        div = new Divisible2();
        div.ent();
        div.evalSal();
        
    }
}
