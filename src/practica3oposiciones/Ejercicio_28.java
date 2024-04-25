package practica3oposiciones;

import java.util.Scanner;

public class Ejercicio_28 {
    
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int numeros[] = new int[5]; 
        
        for (int i=0; i < numeros.length; i++){
            System.out.println("Introduce un número: ");
            numeros[i] = s.nextInt();
        }
        
        System.out.println("Los números introducidos son: ");
        for (int i=numeros.length-1; i>=0; i--){
            System.out.print(numeros[i]+" ");
        }
        System.out.println();
    }
    
}
