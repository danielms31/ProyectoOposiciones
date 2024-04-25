package practica1oposiciones;


public class Ejercicio_14 {
    
    public static void main(String args[]){
        int tabla[][] = new int[5][5]; 
        
        //Inicializamos los valores de cada una de las posiciones 
        for (int i=0; i < tabla.length; i++){
            for (int j = 0; j < tabla[0].length; j++){
                tabla[i][j] = i + j; 
            }
        }
        
        //Mostramos la matriz
        for (int i=0; i < tabla.length; i++){
            for (int j = 0; j < tabla[0].length; j++){
                System.out.printf("   "+tabla[i][j]+"   ");
            }
            System.out.println();
        }
        
        
    }
    
}
