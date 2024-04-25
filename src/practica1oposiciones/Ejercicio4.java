
package practica1oposiciones;

import java.util.Scanner;


public class Ejercicio4 {
    
    public static void main(String args[]){
        int num1, num2, num3; 
        int menor; 
        Scanner s = new Scanner(System.in); 
        
        System.out.println("Introduce un numero");
        num1 = s.nextInt();
        
        System.out.println("Introduce otro numero");
        num2 = s.nextInt();
        
        System.out.println("Introduce otro numero");
        num3 = s.nextInt();
        
        if (num1 < num2){
            menor = num1;
        }else{
            menor = num2;
        }
        
        if (menor > num3){
            menor = num3;
        }
        
        System.out.println("El número menor es: "+menor);
        System.out.println("El cuadrado de "+menor+" es "+Math.pow(menor, 2));
        System.out.println("El cubo de "+menor+" es "+Math.pow(menor, 3));
        
        
    }
    
}
