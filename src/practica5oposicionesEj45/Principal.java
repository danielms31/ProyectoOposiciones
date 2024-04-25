package practica5oposicionesEj45;

import java.util.ArrayList;
import java.util.Scanner;


public class Principal {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        ArrayList<Coche> coches = new ArrayList<>();
        System.out.println("¿Cuantos coches deseas lerr?");
        int num = s.nextInt(); 
        
        while (num > 0){
            Coche c = new Coche();
            s.nextLine();
            System.out.println("Introduce la matricula");
            c.setMatricula(s.nextLine());
            System.out.println("Introduce la marca");
            c.setMarca(s.nextLine());
            System.out.println("Introduce el modelo");
            c.setModelo(s.nextLine());
            System.out.println("Introduce los kilometros");
            c.setKm(s.nextInt());
            coches.add(c);
            num--;  
        }

        System.out.println("LOS COCHES INTRODUCIDOS SON: ");
        for (Coche c: coches){
            System.out.println(c.toString());
        }
        
        s.nextLine();
        System.out.println("Introduce una marca");
        String marca = s.nextLine();
        System.out.println("LOS COCHES INTRODUCIDOS DE LA MARCAR"+marca+"SON: ");
        for (Coche c: coches){
            if (c.getMarca().equals(marca)){
                System.out.println(c);
            }
        }
        
        System.out.println("Introduce un número de kilometros: ");
        int kilometros = s.nextInt();
        System.out.println("LOS COCHES INTRODUCIDOS CON MENOS DE "+kilometros+" KILOMETROS, SON: ");
        for (Coche c: coches){
            if (c.getKm()<kilometros){
                System.out.println(c);
            }
        }
        
        System.out.println("EL COCHE CON MAYOR NÚMERO DE KILOMETROS ES: ");
        Coche max = coches.get(0);
        for (Coche c: coches){
            if (c.getKm()>max.getKm()){
                max = c;
            }
        }
        System.out.println(max);
        
        //Los mostramos ordenados utilizando el algoritmo burbuja
        boolean intercambiado;
        for (int i = 0; i < coches.size()-1; i++){
            intercambiado = false;
            for (int j = 0; j < coches.size()-1; j++){
                if (coches.get(j).getKm() > coches.get(j+1).getKm()){
                    Coche tem = coches.get(j);
                    coches.set(j, coches.get(j+1));
                    coches.set(j+1,tem);
                    intercambiado = true;
                }
            }
            if (!intercambiado){
                break;
            }
        }
        
        System.out.println("LOS COCHES ORDENADOS POR NÚMERO DE KILOMETROS: ");
        for (Coche c: coches){
            System.out.println(c);
        }
        
        
    }
}
