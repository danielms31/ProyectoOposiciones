
package practica5oposicionesEj47;


public class Prueba {
    
    public static void main(String args[]){
        Persona p = new Persona("Pepe",19,'m');
        Empleado e = new Empleado("Ramon",40,'m',9876,"Ventas","Contable");
    
        p = e;
        System.out.println(p.getNombre());
        System.out.println(p.getEdad());
        System.out.println(p.getSexo());
        
    }
    
    
    
}
