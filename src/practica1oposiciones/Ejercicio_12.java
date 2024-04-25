package practica1oposiciones;

import java.util.Scanner;

public class Ejercicio_12 {
    
    public static void main(String args[]){
        Scanner s = new Scanner(System.in); 
        String frase; 
        int cont=0;
        
        System.out.println("Introduce una frase: "); 
        frase = s.nextLine(); 
        
        //Convierto la cadena a Minusculas
        frase = frase.toLowerCase();
        
        for (int i = 0; i < frase.length(); i++){
            char c = frase.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c== 'u'){
                cont++;
            }
        }
        
        System.out.printf("La frase introducida tenia %d vocales\n",cont);
    }
    
}
