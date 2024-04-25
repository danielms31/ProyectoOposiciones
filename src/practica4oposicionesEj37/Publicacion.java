package practica4oposicionesEj37;


public class Publicacion {
    String codigo; 
    String titulo; 
    int anPublicacion;

    public Publicacion(String codigo, String titulo, int anPub){
        this.codigo = codigo; 
        this.titulo = titulo; 
        this.anPublicacion = anPub;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnPublicacion() {
        return anPublicacion;
    }

    public void setAnPublicacion(int anPublicacion) {
        this.anPublicacion = anPublicacion;
    }
    
    @Override
    public String toString(){
        return "Codigo: "+codigo+" - Titulo: "+titulo+" - Año de publicación: "+anPublicacion;
    }
}
