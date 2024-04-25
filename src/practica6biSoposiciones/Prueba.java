
package practica6biSoposiciones;

import java.util.ArrayList;


public class Prueba {

    public static void main(String[] args){
        
        Asalariado a1 = new Asalariado(1,"Merino Sanz","Daniel","987654123",1002.2,"Desarrollo");
        Asalariado a2 = new Asalariado(2,"Merino Sanz","Ana","66666666",1302.2,"Administrador");
        Asalariado a3 = new Asalariado(3,"Santana Merino","Guillermo","123456789",2002.2,"Desarrollo");
        
        Voluntario v1 = new Voluntario(1,"Perico Palotes","Manolo","987654123","Tarde","Gestion");
        Voluntario v2 = new Voluntario(2,"Marta Ramos","Marta","66666666","Mañana","Almacen");
        Voluntario v3 = new Voluntario(3,"Santana Merino","Sebastian","123456789","Noche","Seguridad");
        
        ColeccionTrabajadores c = new ColeccionTrabajadores();
        c.addTrabajador(a1);
        c.addTrabajador(a2);
        c.addTrabajador(a3);
        c.addTrabajador(v1);
        c.addTrabajador(v2);
        c.addTrabajador(v3);
        
        ArrayList<Trabajador> asalariados = c.obtenerLista(Asalariado.class);
        System.out.println("Lista de asalariados"); 
        for (Trabajador a: asalariados){
            System.out.println(a.toString());
        }
        
        ArrayList<Trabajador> voluntarios = c.obtenerLista(Voluntario.class);
        System.out.println("Lista de voluntarios"); 
        for (Trabajador a: voluntarios){
            System.out.println(a.toString());
        }
        
        c.volcado(Asalariado.class);
        c.volcado(Voluntario.class);
    }
    
}
