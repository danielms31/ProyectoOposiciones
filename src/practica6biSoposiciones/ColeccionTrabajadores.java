package practica6biSoposiciones;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ColeccionTrabajadores implements InterfaceColeccionTrabajadores{
    
    private ArrayList<Trabajador> trabajadores;
    
    public ColeccionTrabajadores(){
        trabajadores = new ArrayList<Trabajador>();
    }
    
    public void addTrabajador(Trabajador t){
        trabajadores.add(t);
    }
    
    public ArrayList<Trabajador> obtenerLista(Class tipo){
        ArrayList<Trabajador> trab = new ArrayList<Trabajador>();
        for (Trabajador t: trabajadores){
            if (tipo.isInstance(t)){
                trab.add(t);
            }
        }        
        return trab; 
    }
    
    
    public ArrayList<Asalariado> getAsalariados(double salario){
        ArrayList<Asalariado> trab = new ArrayList<Asalariado>();
        for (Trabajador t: trabajadores){
            if (t instanceof Asalariado){
                Asalariado a = (Asalariado) t;
                if (a.getSalario() > salario){
                    trab.add(a);
                }
            }        
        
        }
        return trab; 
    }
    
    public double valorMedioSalario(){
        double media = 0; 
        double total = 0;
        int cont = 0;
        for (Trabajador t: trabajadores){
            if (t instanceof Asalariado){
                Asalariado a = (Asalariado) t;
                total = total + a.getSalario();
                cont++;
            }
        }
        if (total > 0)
            media = total/cont;
        return media; 
    }
    
    public void volcado(Class tipo){
        String nombreArchivo = "archivo_trabajadores_"+tipo.getSimpleName()+".txt";
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo));
            for (Trabajador t: trabajadores){
                if (tipo.isInstance(t)){
                    writer.write(t.toString());
                    writer.newLine();
                }
            }
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(ColeccionTrabajadores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
