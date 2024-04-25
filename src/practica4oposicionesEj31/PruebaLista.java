package practica4oposicionesEj31;


public class PruebaLista {
    public static void main(String[] args){
        Lista l = new Lista();
        l.ingresa("Daniel");
        l.ingresa("Marta");
        l.ingresa("Pablo");
        l.listar();
        l.borrar(0);
        l.listar();
    }
}
