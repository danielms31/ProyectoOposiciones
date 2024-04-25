package practica9oposiciones;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    
    public static void main(String[] args){
        Combinaciones comb = new Combinaciones(); 
        List<Integer> valores = new ArrayList<>();
        valores.add(0);
        valores.add(1);
        valores.add(2);
        System.out.println("Combinaciones de longitud 3 con 0, 1 y 2: "); 
        comb.calculaCombinaciones(valores,new ArrayList<>(), 3);
    }
    
}
