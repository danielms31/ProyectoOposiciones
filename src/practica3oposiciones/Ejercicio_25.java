package practica3oposiciones;

import java.util.Scanner;

public class Ejercicio_25 {
    
    public static void main(String[] args){
        int n=-1;
        int resto; 
        int cifras = 0;
        Scanner s = new Scanner(System.in);
        
        while (n <= 0){
            System.out.println("Introduce un número positivo: ");
            n = s.nextInt();
        }
        
        do{
            resto = n % 10;
            cifras++;
            n = n / 10;
        }while (n != 0);
        
        System.out.printf("El número tiene %d cifras\n",cifras);
        
        
    }
    
}
