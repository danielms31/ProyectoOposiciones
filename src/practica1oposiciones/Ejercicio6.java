package practica1oposiciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio6 {

    public static void main(String args[]){
        double suma=0; 
        int numeros; 
        double notas[]; 
        
        System.out.println("¿De cuantos notas quieres hacer el promedio?");
        numeros = Integer.parseInt(leer());
        
        notas = new double[numeros];
        
        for (int i=0; i < numeros; i++){
            System.out.println("Introduce un número: ");
            notas[i] = Double.parseDouble(leer());
            suma = suma + notas[i]; 
        }
        
        System.out.println("Introduzca su nombre: "); 
        String nombre = leer();
        System.out.printf("%s, el promedio de tus tres valores es: %.2f\n",nombre,(suma/notas.length));
    }
    
    public static String leer(){
        String s="";
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        try{
            s = b.readLine();
            return s;
        }catch(IOException e){
            e.printStackTrace();
        }
        return s;
    }
    
}
