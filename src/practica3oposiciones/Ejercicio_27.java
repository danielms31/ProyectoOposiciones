package practica3oposiciones;

import java.util.Scanner;

public class Ejercicio_27 {
    
    public static void main(String args[]){
        final int N_ALUMNOS = 5;
        Scanner s = new Scanner(System.in);
        int edad,mayorEdad=0,masEstatura=0;
        float estatura, estaturaMedia=0,edadMedia=0;
        
        for (int i=1; i <= N_ALUMNOS; i++){
            System.out.print("Alumno "+i+". Introduce edad: ");
            edad = s.nextInt();
            edadMedia += edad;
            if (edad >= 18){
                mayorEdad++;
            }
            System.out.print("Alumno "+i+". Introduce estatura: ");
            estatura = s.nextFloat();
            estaturaMedia += estatura;
            if (estatura > 1.75){
                masEstatura++;
            }
        }
        
        edadMedia = edadMedia / N_ALUMNOS;
        estaturaMedia = estaturaMedia / N_ALUMNOS;
        
        System.out.println("Edad Media: "+edadMedia);
        System.out.println("Estatura Media: "+estaturaMedia);
        
        System.out.println("Numero de alumnos mayores de edad: "+mayorEdad);
        System.out.println("Número de alumnos mayores de 1.75: "+masEstatura);
        
        
    }
    
}
