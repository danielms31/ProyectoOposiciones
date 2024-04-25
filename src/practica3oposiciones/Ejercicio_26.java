package practica3oposiciones;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Ejercicio_26 {

    public static void main(String[] args) {
        int hora = 23;
        int min = 59;
        int seg = 40;

        while (true) {
            String reloj = "";
            if (hora < 10) {
                reloj = reloj + "0";
            }
            reloj = reloj + hora + ":";

            if (min < 10) {
                reloj = reloj + "0";
            }
            reloj = reloj + min + ":";
            
            if (seg < 10) {
                reloj = reloj + "0";
            }
            reloj = reloj+seg;
            
            System.out.println(reloj);
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("ERROR EN LA ESPERA: "+ex.getMessage());
            }

            seg++;
            if (seg == 60) {
                seg = 0;
                min++;
                if (min == 60) {
                    min = 0;
                    hora++;
                    if (hora == 24) {
                        hora = 0;
                    }
                }
            }
        }//fin while

    }

}
