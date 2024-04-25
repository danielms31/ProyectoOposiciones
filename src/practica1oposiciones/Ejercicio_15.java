package practica1oposiciones;

import java.util.Scanner;

public class Ejercicio_15 {
    
    public static void binario(int n){
        //Un num entre 0 y 255 tiene como mucho 8 bits 
        int binario[] = new int[8];
        
        if (n < 0 || n > 255){
            System.out.println("Numero fuera de rango");
        }else{
            //Convertimos el número a binario
            int cont = 0;
            while (n != 0){
                binario[cont] = n % 2;
                n = n / 2;
                cont++;
            }
            
            //Imprimimos el resultado
            for (int i=cont-1; i >= 0; i--){
                System.out.print(binario[i]);
            }
            System.out.println("");
        }
    }
    
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce un número del 0 al 255");
        int n = s.nextInt();
        System.out.print("El número en binario es: ");
        binario(n);
    }
    
}
