package practica4oposicionesEj35y36;

import java.io.File;
import java.util.Arrays;

public class Ejercicio_36 {
    
    public static void main(String[] args){
        File directorio = new File("/Users/daniel/Desktop");
        
        String lista[] = directorio.list();
        
        Arrays.sort(lista);
        
        for (int i=0; i < lista.length; i++){
            System.out.println(lista[i]);
        }
    }
    
}
