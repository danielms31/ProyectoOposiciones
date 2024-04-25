package practica1oposiciones;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;



public class Ejercicio8 {
    
    public static void main(String args[]) throws IOException {
        int max = Integer.parseInt(args[0]);
        BufferedWriter writer = new BufferedWriter(new FileWriter("salida.txt"));
        
        for (int i=0; i < max; i++){
            writer.write(Integer.toString(i));
            writer.newLine();
        }
        
        writer.close();
        
        System.out.printf("Se han escrito los números del 0 al %d\n",max);
    }
    
}
