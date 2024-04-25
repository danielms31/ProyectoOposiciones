package practica6oposicionesEj48;

import java.util.Scanner;

public class Ejercicio_48 {
    
    private static void Hanoi(int nDiscos,String origen,String auxiliar,String destino){
        if (nDiscos == 1){
            System.out.println("Desplaza el disco de "+origen+" a "+destino);
        }else{
            Hanoi(nDiscos-1,origen,destino,auxiliar);
            System.out.println("Desplaza el disco de "+origen+" a "+destino);
            Hanoi(nDiscos-1,auxiliar,origen,destino);
        }
    }
    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce el nombre del disco de origen: ");
        String origen = s.nextLine();
        
        System.out.println("Introduce el nombre del disco auxliar: ");
        String auxiliar = s.nextLine();
        
        System.out.println("Introduce el nombre del disco de destino: ");
        String destino = s.nextLine();
        
        System.out.println("Introduce el número de discos: ");
        int discos = s.nextInt(); 
        
        Hanoi(discos,origen,auxiliar,destino);
    }
    
}
