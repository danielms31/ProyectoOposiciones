package practica1oposiciones;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Ejercicio9 {
    
    public static void main(String args[]) throws FileNotFoundException{
        String nombreFich = args[0];
        BufferedReader reader = new BufferedReader(new FileReader("salida.txt"));
        
        try {
            String linea; 
            while ((linea = reader.readLine()) != null){
                System.out.println(linea);
            }
        } catch (IOException ex) {
            System.out.println("Error al leer el archivo");
        }
        
    }
}
