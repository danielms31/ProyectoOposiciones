
package practica1oposiciones;

import java.util.Scanner;

public class Ejercicio_10 {
    
    public static void main(String args[]){
        String pass = "hola"; 
        String texto="";
        int cont = 0; 
        Scanner s = new Scanner(System.in);
        
        while (cont < 3 && !texto.equals(pass)){
            System.out.println("Introduce la contraseña: ");
            texto = s.nextLine();
            cont++;
        }
        
        if (texto.equals(pass)){
            System.out.println("Enhorabuena");
        }else{
            System.out.println("EXIT");
        }
        
    }
    
}
