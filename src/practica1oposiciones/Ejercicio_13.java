package practica1oposiciones;

import java.util.Scanner;

public class Ejercicio_13 {
    
    public static void main(String args[]){
        int num; 
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int suma = 0; 
        int sumaPos = 0;
        int sumaNeg = 0;
        int media = 0;
        int cont=0;
        Scanner s = new Scanner(System.in);
        
        System.out.println("Introduce un número: "); 
        num = s.nextInt();
            
        while (num != -1){
            cont++;
            suma = suma + num;
            if (num < 0){
                sumaNeg = sumaNeg + num;
            }else{
                sumaPos = sumaPos + num;
            }
            
            if (num > max){
                max = num;
            }
            
            if (num < min){
                min = num;
            }
            System.out.println("Introduce otro número: "); 
            num = s.nextInt();
        }
        
        if (cont == 0){
            max = 0; 
            min = 0;
        }
        
        System.out.printf("El mayor número introducido es: %d\n",max);
        System.out.printf("El menor número introducido es: %d\n",min);
        System.out.printf("La suma de todos los números es: %d\n",suma);
        System.out.printf("La suma de todos los números positivos es: %d\n",sumaPos);
        System.out.printf("La suma de todos los números negativos es: %d\n",sumaNeg);
        
        if (cont != 0){
            System.out.printf("La media es: %.2f\n",(double)suma/cont);
        }else{
            System.out.println("La media es 0");
        }
        
        
    }
    
}
