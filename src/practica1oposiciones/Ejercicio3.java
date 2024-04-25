package practica1oposiciones;

import java.util.Scanner;

public class Ejercicio3 {
    
    public static void main(String args[]){
        int nota; 
        Scanner s = new Scanner(System.in);
        
        System.out.println("Introduce una nota: ");
        nota = s.nextInt(); 
        
        //Utilizo el nuevo formato de switch introducido en la versión 14 de Java
        switch(nota){
            case 1,2,3,4 -> System.out.println("INSUFICIENTE");
            case 5,6 -> System.out.println("SUFICIENTE"); 
            case 7,8 -> System.out.println("NOTABLE");
            case 9,10 -> System.out.println("SOBRESALIENTE");
            default -> System.out.println("NOTA INTRODUCIDA INCORRECTA");
        }
    }
    
}
