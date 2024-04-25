package practicaz10oposiciones;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args){
        int n=-1; 
        Scanner s = new Scanner(System.in);
        Pila p = new Pila();
        
        System.out.println("Introduce un número");
        n = s.nextInt();
        
        while(n != 0){
            p.apilar(n);
            System.out.println("Introduce un número");
            n = s.nextInt();
        }
        
        p.volcado();
	//esto lo añado desde windows.
    }
    
}
