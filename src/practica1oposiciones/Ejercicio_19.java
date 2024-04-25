package practica1oposiciones;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ejercicio_19 {

    public static void main(String args[]){
        String frase;
        Scanner s = new Scanner(System.in);
        
        System.out.println("Introduce una frase: ");
        frase = s.nextLine();
        
        StringTokenizer st = new StringTokenizer(frase);
        System.out.println("Número de palabras: "+st.countTokens());
    }
    
}
