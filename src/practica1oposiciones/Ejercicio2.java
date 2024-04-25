package practica1oposiciones;

import java.util.Scanner;


public class Ejercicio2 {
    
    public static void main(String args[]){
        double a, b, c; 
        double discriminante;
        double sol1, sol2;
        Scanner s = new Scanner(System.in);
        
        System.out.println("Introduce los coeficientes de una ecuación de segundo grado. ax^2 + bx + c = 0");
        System.out.print("a = ");
        a = s.nextInt();
        
        System.out.print("b = ");
        b = s.nextInt();
        
        System.out.print("c = ");
        c = s.nextInt();
        
        discriminante = (Math.pow(b, 2) - (4*a*c));
        
        if (discriminante > 0){
            System.out.println("La ecuación tiene dos soluciones reales");
            sol1 = (-b + Math.sqrt(discriminante))/(2*a);
            sol2 = (-b - Math.sqrt(discriminante))/(2*a);
            System.out.println("x1: "+sol1);
            System.out.println("x2: "+sol2);
        }else if (discriminante == 0){
            System.out.println("La ecuación tiene una solución real");
            sol1 = (-b + Math.sqrt(discriminante))/(2*a);
            System.out.println("x: "+sol1);
        }else{
            System.out.println("La ecuación no tiene soluciones reales");
        }
        
        
    }
}
