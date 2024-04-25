package practica4oposicionesEj33;

import java.util.Scanner;


public class PruebaDNI {
    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num;
        NIF nif = new NIF();
        nif.leer();
        System.out.println(nif);
        
        NIF nif2 = new NIF(70255911);
        System.out.println(nif2);
    }
    
    
}
