package practica3oposiciones;

import java.util.Scanner;

public class Ejercicio_24 {
    
    public static int fibonacci(int n){
        if (n == 0){
            return 0;
        }else if (n == 1){
            return 1;
        }else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
    
    public static void main(String args[]){
        int num;
        Scanner s = new Scanner(System.in);
        
        System.out.println("Introduce un número: ");
        num = s.nextInt(); 
        
        System.out.printf("El termino %d de la serie de fibonacci es %d\n",num,fibonacci(num));
    }
    
}
