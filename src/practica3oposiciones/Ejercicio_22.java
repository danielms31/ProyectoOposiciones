package practica3oposiciones;

import java.util.Scanner;

public class Ejercicio_22 {

    public static void main(String args[]) {
        int edad = -1;
        int datosOK = 0;
        String nombre;
        char categoria = 'A';
        Scanner s = new Scanner(System.in);

        while (datosOK == 0) {
            try {
                System.out.println("¿Como te llamas?");
                nombre = s.nextLine();

                while (edad < 0) {
                    System.out.println("¿Cuantos años tienes?");
                    edad = s.nextInt();
                }
                

                datosOK = 1;
                
                if (edad > 25 && edad <= 50) {
                    categoria = 'B';
                } else if (edad > 50) {
                    categoria = 'C';
                }

                System.out.printf("Dentro de 10 años tendras %d años.\n", edad + 10);
                System.out.println("Categoria: " + categoria);
                
            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
                datosOK = 0;
                s.nextLine();
            }
        }

    }

}
