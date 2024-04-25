package practica6biSoposiciones;

import java.util.ArrayList;


public interface InterfaceColeccionTrabajadores {
    public void addTrabajador(Trabajador t);
    public ArrayList<Trabajador> obtenerLista(Class tipo);
    public ArrayList<Asalariado> getAsalariados(double salario);
    public double valorMedioSalario();
    public void volcado(Class tipo);
}
