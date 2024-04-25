package practica3oposiciones;

import java.util.Scanner;

public class Ejercicio_29 {
    
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n,numPares=0, numImpares=0;
        int numeros[] = new int[10];
        int pares[];
        int impares[];
        
        for (int i=0; i < 10; i++){
            System.out.println("Introduzca un número: "); 
            n = s.nextInt();
            numeros[i] = n;
            if (n % 2 == 0){
                numPares++;
            }else{
                numImpares++;
            }
        }
        
        pares = new int[numPares];
        impares = new int[numImpares];
        
        numPares = 0; 
        numImpares = 0;
        
        for (int i=0; i < numeros.length; i++){
            if (numeros[i] % 2 == 0){
                pares[numPares] = numeros[i];
                numPares++;
            }else{
                impares[numImpares] = numeros[i];
                numImpares++;
            }
        }
        
        System.out.println("PARES: "); 
        for (int i=0; i < pares.length; i++){
            System.out.print(pares[i]+" ");
        }
        System.out.println();
        
        System.out.println("IMPARES: "); 
        for (int i=0; i < impares.length; i++){
            System.out.print(impares[i]+" ");
        }
        System.out.println();
        
    }
    
}
