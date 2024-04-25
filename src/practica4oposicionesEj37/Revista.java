package practica4oposicionesEj37;

public class Revista extends Publicacion{
    
    private int numero;
    
    public Revista(String codigo, String titulo, int anPub, int numero){
        super(codigo,titulo,anPub);
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    @Override
    public String toString(){
        return super.toString()+" - numero: "+numero+"\n";
    }
    
}
