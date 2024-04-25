package practica5oposicionesEj42;

public class Principal {
    
    public static void main(String[] args){
        Libro l = new Libro("El quijote de la mancha","Cervantes",1,0);
        System.out.println(l);
        if (l.prestamo()){
            System.out.println("Se ha podido prestar el libro");
        }else{
            System.out.println("No se ha podido prestar el libro");
        }
        System.out.println(l);
        
        
        if (l.prestamo()){
            System.out.println("Se ha podido prestar el libro");
        }else{
            System.out.println("No se ha podido prestar el libro");
        }
        System.out.println(l);
        
        
        if (l.devolucion()){
            System.out.println("Se ha podido devolver el libro");
        }else{
            System.out.println("No se ha podido devolver el libro");
        }
        System.out.println(l);
        
       
        if (l.devolucion()){
            System.out.println("Se ha podido devolver el libro");
        }else{
            System.out.println("No se ha podido devolver el libro");
        }
        
        System.out.println(l);
        
        
    }
}
