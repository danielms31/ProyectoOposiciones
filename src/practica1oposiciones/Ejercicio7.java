
package practica1oposiciones;

import java.util.Scanner;


public class Ejercicio7 {
    
    public static void main(String args[]){
        int n,num;
        Scanner s = new Scanner(System.in);
        
        System.out.println("Introduce un número: ");
        n = s.nextInt();
        
        num = n+1;  //Sumo 1 a num para que entre la primera vez en el bucle
        System.out.println("Intenta adivinar el numero.");
        while (num != n){
            System.out.println("Introduce un número: ");
            num = s.nextInt();
            if (num < n){
                System.out.println("EL NUMERO QUE INTENTAS ADIVINAR ES MAYOR");
            }else if (num > n){
                System.out.println("EL NUMERO QUE INTENTAS ADIVINAR ES MENOR");
            }
        }
        System.out.println("ACERTASTE!");
    }
    
}
