package practica1oposiciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CogerDatos {
    
    static String inicializar(){
        String dato=""; 
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            dato = br.readLine();
        } catch (IOException ex) {
            System.out.println("DATOS ERRONEOS");
        }
        
        return dato;
        
    }
    
    static int entero(){
        return Integer.parseInt(inicializar());
    }
    
    static double real(){
        return Double.parseDouble(inicializar());
    }
    
    static String cadena(){
        return inicializar();
    }
    
    static char caracter(){
        return inicializar().charAt(0);
    }
    
    
}
