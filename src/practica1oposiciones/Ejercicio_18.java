
package practica1oposiciones;

import java.util.Scanner;


public class Ejercicio_18 {
    
    public static double potencia(double a, int n){
        if (n == 0){
            return 1; 
        }else{
            return a * potencia(a,n-1);
        }
    }
    
    public static void main(String args[]){
        double base; 
        int exponente; 
        
        System.out.println("Introduce la base");
        base = CogerDatos.real();
        
        System.out.println("Introduce el exponente");
        exponente = CogerDatos.entero();
        
        System.out.printf("El resultado de elevar %.2f a %d es: %.2f\n",base,exponente,potencia(base,exponente));
    }
    
}
