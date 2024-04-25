package practica1oposiciones;

import java.util.Scanner;

/**
 *
 * @author daniel
 */
public class Ejercicio1 {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String nombre; 
        char categoria = 'A';
        int edad; 
        
        System.out.println("¿Cual es tu nombre?: ");
        nombre = sc.nextLine(); 
        
        System.out.println("¿Cual es tu edad?: ");
        edad = sc.nextInt(); 
        
        if (edad > 25 && edad <=50){
            categoria = 'B';
        }else if (edad > 50){
            categoria = 'C';
        }
               
        System.out.println(nombre+", en una decada tendras "+(edad+10)+" años, Ahora tu categoria es: "+categoria);
    }
    
}
