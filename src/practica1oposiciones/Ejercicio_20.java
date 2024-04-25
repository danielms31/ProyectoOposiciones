package practica1oposiciones;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Ejercicio_20 {
    
    public static void main(String args[]){
        BufferedReader b;
        try {
            b = new BufferedReader(new FileReader("enteros.txt"));
            String linea;
            StringTokenizer st;
            int cantidad = 0; 
            int suma = 0;
            while ((linea = b.readLine())!=null){
                st = new StringTokenizer(linea," ,;");
                while (st.hasMoreElements()){
                    int  numero = Integer.parseInt(st.nextToken());
                    System.out.println(numero);
                    suma = suma + numero; 
                    cantidad++;
                }
            }
            System.out.println("Números leidos: "+cantidad);
            System.out.println("Suma: "+suma);
            
        } catch (Exception e) {
            Logger.getLogger(Ejercicio_20.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
}
