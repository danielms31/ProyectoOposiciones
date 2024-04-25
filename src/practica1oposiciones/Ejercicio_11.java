/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1oposiciones;

import java.util.Scanner;

/**
 *
 * @author daniel
 */
public class Ejercicio_11 {
    
    public static void main(String args[]){
        int max, min, ale, aux;
        Scanner s = new Scanner(System.in);
        
        System.out.println("Introduce un número: "); 
        max = s.nextInt();
        
        System.out.println("Introduce otro número: "); 
        min = s.nextInt();
        
        if (min > max){
            aux = min; 
            min = max; 
            max = aux;
        }
        
        System.out.println("Numeros aleatorios: ");
        for (int i=0; i < 10; i++){
            ale = (int) (Math.random() * (max - min +1) + min);
            System.out.println(ale);
        }
    }
    
}
