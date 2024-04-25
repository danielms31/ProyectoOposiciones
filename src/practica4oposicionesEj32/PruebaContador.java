package practica4oposicionesEj32;

public class PruebaContador {
    
    public static void main(String[] args){
        //Creamos un objeto contador con el contructor por defecto
        Contador c = new Contador();
        
        //Creamos un objeto contador con el constructor con parametros
        Contador c2 = new Contador(3); 
        
        //Creamos un objeto contador con el constructor copia
        Contador c3 = new Contador(c2); 
        
        //Mostramos el valor de los contadores
        System.out.println("Valor del contador c2 "+c2.getCont());
        System.out.println("Valor del contador c3 "+c3.getCont());
        
        //Cambiamos el valor de los contadores 
        c.setCont(1);
        c2.setCont(2);
        c3.setCont(3);
        
        //Mostramos el valor de los contadores
        System.out.println("Valor del contador c "+c.getCont());
        System.out.println("Valor del contador c2 "+c2.getCont());
        System.out.println("Valor del contador c3 "+c3.getCont());
        
        //Decrementamos el contador c tres veces
        c.decrementa();
        c.decrementa();
        c.decrementa();
        
        //Comprobamos el valor de c1
        System.out.println("Valor del contador c "+c.getCont());
        
        //Incrementamos el contador c3 
        c3.incrementa();
        
        //Comprobamos el valor de c3
        System.out.println("Valor del contador c3 "+c3.getCont());
    }
}
