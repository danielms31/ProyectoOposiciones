package practica4oposicionesEj35y36;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_35 {
    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        double altura;
        double media=0;
        ArrayList<Double> alturas = new ArrayList<>();
        
        System.out.println("Introduce alturas de los alumnos. "
                + "Introduce un número negativo para terminar de introducir alturas");
        
        do{
            System.out.print("Altura: ");
            altura = s.nextDouble();
            alturas.add(altura);
        }while (altura >=0);
        
        //Eliminamos el ultimo elemento introducido (es negativo)
        alturas.remove(alturas.size()-1);
        
        //Calculamos la media
        for (double alt : alturas){
            media += alt;
        }
        
        media = media / alturas.size();
        
        int masAltos=0;
        int masBajos=0;
        for (double alt : alturas){
            if (alt > media){
                masAltos++;
            }else if (alt < media){
                masBajos++;
            }
        }
        
        System.out.println("La media de las alturas es: "+media);
        System.out.println("El número de alumnos mas bajos que la media es: "+masBajos);
        System.out.println("El número de alumnos mas altos que la media es: "+masAltos);
        
        
    }
    
}
