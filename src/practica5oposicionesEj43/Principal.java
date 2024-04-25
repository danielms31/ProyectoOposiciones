package practica5oposicionesEj43;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Principal {
    
    public static void main(String[] args){
        ArrayList<PartidoFutbol> partidos = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("partidos.txt"));
            String linea,local,visitante;
            int golesLocal,golesVisitante;        
            while ((linea = reader.readLine()) != null){
                String[] datosPartido = linea.split("-");
                local = datosPartido[0];
                visitante = datosPartido[3];
                golesLocal = Integer.parseInt(datosPartido[1]);
                golesVisitante = Integer.parseInt(datosPartido[2]);
                PartidoFutbol p = new PartidoFutbol(local,visitante,golesLocal,golesVisitante);
                partidos.add(p);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        for (PartidoFutbol part: partidos){
            System.out.println(part.getLocal()+"-"+part.getGolesL()+"-"+part.getGolesV()+"-"+part.getVisitante());
        }
    }
    
}
