package practica4oposicionesEj37;

public class Libro extends Publicacion implements Prestable{
    
    private boolean prestado;
    
    public Libro(String codigo, String titulo, int anPub){
        super(codigo,titulo,anPub);
        this.prestado = false;
    }
    
    @Override
    public String toString(){
        return super.toString()+" - prestado: "+prestado+"\n";
    }

    @Override
    public void prestar(){
        if (!prestado()){
            this.prestado = true;
        }
    }
    
    
    @Override
    public void devolver(){
        this.prestado = false;
    }

    @Override
    public boolean prestado() {
        return this.prestado;
    }
}
