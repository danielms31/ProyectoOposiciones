package practica4oposicionesEj41;

public class Principal {
    
    public static void main(String[] args){
        Empleado e = new Empleado("Daniel");
        Operario o = new Operario("Paco");
        Directivo d = new Directivo("Juan");
        Oficial of = new Oficial("Luis");
        Tecnico t = new Tecnico("Marta");
        
        System.out.println(e);
        System.out.println(o);
        System.out.println(d);
        System.out.println(of);
        System.out.println(t);
    }
    
}
