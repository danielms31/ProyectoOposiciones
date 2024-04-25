
package practica4oposicionesEj40;


public class ProgramaPrincipal {
    
    public static void main(String[] args){
        ListaDoblementeEnlazada l = new ListaDoblementeEnlazada();
        l.insertarFinal(0);
        l.insertarFinal(1);
        l.insertarFinal(2);
        l.insertarFinal(3);
        l.insertarFinal(4);
        l.imprimir();
        
        l.insertarPrincipio(5);
        l.imprimir();
        
        l.insertarSegundaPos(14);
        l.imprimir();
        
        l.insertarPenultima(54);
        l.imprimir();
        
        l.borrarInfoMayor();
        l.imprimir();
        
        l.borrarNodo1();
        l.imprimir();
        
        l.borrarSegundoNodo();
        l.imprimir();
        
        l.borrarSegundoNodo();
        l.borrarSegundoNodo();
        l.borrarSegundoNodo();
        l.borrarSegundoNodo();
        l.borrarSegundoNodo();
        l.borrarSegundoNodo();
        l.borrarSegundoNodo();
        l.borrarSegundoNodo();
        l.imprimir();
        
        l.borrarNodo1();
        l.imprimir();
    }    
    
}
