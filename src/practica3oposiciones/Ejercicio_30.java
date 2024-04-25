package practica3oposiciones;

import java.util.Scanner;

public class Ejercicio_30 {
    
    public static void main(String args[]){
        Scanner s = new Scanner(System.in); 
        int tabla[][] = new int[4][4];
        
        for (int i=0; i < tabla.length; i++){
            for (int j=0; j<tabla[0].length; j++){
                System.out.println("Introduce el elemento. Fila: "+i+" Columna: "+j);
                tabla[i][j] = s.nextInt();
            }
        }
        
        boolean sim = true;
        for (int i=0; i < tabla.length && sim; i++){
            for (int j=0; j<tabla[0].length && sim; j++){
                if (tabla[i][j] != tabla[j][i]){
                    sim = false;
                }
            }
        }
        
        if (sim){
            System.out.println("La tabla es simetrica");
        }else{
            System.out.println("La tabla no es simetrica");
        }
        
    }
    
}
