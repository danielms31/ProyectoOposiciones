package practica4oposicionesEj39;

public class Pila {
    
    static class Nodo{
        int valor; 
        Nodo sig; 
        
        public Nodo(int valor){
            this.valor = valor;
        }
    }
    
    private Nodo primero = null;
    
    public void push(Nodo nodo){
        nodo.sig = primero;
        primero = nodo;
    }
    
    public int pop(){
        int valor = primero.valor;
        primero = primero.sig;
        return valor;
    }
    
    public void mostrarPila(){
        Nodo n = primero; 
        while (n != null){
            System.out.println(n.valor+" ");
            n = n.sig;
        }
    }
    
    public int getNodos(){
        int cont = 0;
        Nodo n = primero;
        while (n != null){
            cont++;
            n = n.sig;
        }
        return cont;
    }
    
    public boolean isEmpty(){
        boolean vacia = false; 
        if (primero == null){
            vacia = true;
        }
        return vacia;
    }
    
}
    

