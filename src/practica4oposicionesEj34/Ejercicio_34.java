package practica4oposicionesEj34;

import java.util.Scanner;


public class Ejercicio_34 {
    
    public static int comparaciones = 0;
   
    public static void ordenaBurbujaMenorMayor(int[] valores){
        boolean intercambiado;
        int n = valores.length;
        int temp;
        for (int i=0; i < n -1; i++){
            intercambiado = false;
            
            for (int j = 0; j < n - i -1; j++){
                comparaciones++;
                if (valores[j] > valores[j+1]){
                    temp = valores[j];
                    valores[j] = valores[j+1];
                    valores[j+1] = temp; 
                    intercambiado = true;
                }
            }
            
            if (!intercambiado){
                break;
            }
        }
        
    }
    
    public static void ordenaBurbujaMayorMenor(int[] valores){
        boolean intercambiado;
        int n = valores.length;
        int temp;
        for (int i=0; i < n -1; i++){
            intercambiado = false;
            for (int j = 0; j < n - i -1; j++){
                comparaciones++;
                if (valores[j] < valores[j+1]){
                    temp = valores[j];
                    valores[j] = valores[j+1];
                    valores[j+1] = temp; 
                    intercambiado = true;
                }
            }
            
            if (!intercambiado){
                break;
            }
        }
        
    }
    
    public static void main(String[] args){
        int[] numeros = new int[10];
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce 10 valores numericos");
        for (int i=0; i < 10; i++){
            numeros[i] = s.nextInt();
        }
        
        System.out.println("El array introducido es: "); 
        System.out.printf("[%d, ",numeros[0]);
        for (int i=1; i < numeros.length-1; i++){
            System.out.printf("%d, ",numeros[i]);
        }
        System.out.printf("%d]\n",numeros[numeros.length-1]);
        
        ordenaBurbujaMenorMayor(numeros);
        System.out.println("El array ordenado de menor a mayor es: "); 
        System.out.printf("[%d, ",numeros[0]);
        for (int i=1; i < numeros.length-1; i++){
            System.out.printf("%d, ",numeros[i]);
        }
        System.out.printf("%d]\n",numeros[numeros.length-1]);
        System.out.println("Comparaciones realizadas: "+comparaciones);
        
        
        comparaciones = 0; 
        
        ordenaBurbujaMayorMenor(numeros);
        System.out.println("El array ordenado de mayor a menor es: "); 
        System.out.printf("[%d, ",numeros[0]);
        for (int i=1; i < numeros.length-1; i++){
            System.out.printf("%d, ",numeros[i]);
        }
        System.out.printf("%d]\n",numeros[numeros.length-1]);
        System.out.println("Comparaciones realizadas: "+comparaciones);
    }
    
}
