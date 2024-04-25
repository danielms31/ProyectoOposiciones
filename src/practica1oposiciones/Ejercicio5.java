package practica1oposiciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio5 {

    public static void main(String args[]){
        double suma=0; 
        for (int i=0; i < 3; i++){
            System.out.println("Introduce un número: ");
            double n = Double.parseDouble(leer());
            suma = suma + n; 
        }
        
        System.out.println("Introduzca su nombre: "); 
        String nombre = leer();
        System.out.printf("%s, el promedio de tus tres valores es: %.2f\n",nombre,(suma/3));
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
