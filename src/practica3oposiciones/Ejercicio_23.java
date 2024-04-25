package practica3oposiciones;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ejercicio_23 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String frase;

        if (args.length == 1) {
            try {
                BufferedWriter b = new BufferedWriter(new FileWriter(args[0]));
                System.out.println("Introduce una frase: ");
                frase = s.nextLine();
                b.write(frase);
                b.close();
            } catch (IOException ex) {
                System.out.println("Se ha producido un error: " + ex.getMessage());
            }
        } else {
            System.out.println("Archivo no encontrado");
        }

    }

}
