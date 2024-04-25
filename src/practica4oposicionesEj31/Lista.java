package practica4oposicionesEj31;


public class Lista {
    private int MAX = 15;
    private String[] lista = new String[MAX];
    private int lista_elem = 0; 
    
    public void ingresa(String dato){
        lista[lista_elem] = dato;
        lista_elem++;
    }
    
    public void listar(){
        for (int i=0; i < lista_elem; i++){
            System.out.println("Item "+i+": "+lista[i]);
        }
    }
    
    public void borrar(int item){
        lista_elem--;
        for (int i=item; i<lista_elem;i++){
            lista[i] = lista[i+1];
        }
    }
}
