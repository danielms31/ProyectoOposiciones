package practica5oposicionesEj42;

public class Libro {
    private String titulo; 
    private String autor;
    private int numEjemplares;
    private int numPrestados;
    
    public Libro(){
        
    }
    
    public Libro(String titulo, String autor, int numEjemplares, int numPrestados){
        this.titulo = titulo;
        this.autor = autor; 
        this.numEjemplares = numEjemplares;
        this.numPrestados = numPrestados;
    }
    
    public boolean prestamo(){
        if ((numEjemplares - numPrestados)>=1){
            numPrestados++;
            return true;
        }
        return false;
    }
    
    public boolean devolucion(){
        if (numPrestados != 0){
            numPrestados--;
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    public String toString(){
        return "Titulo: "+titulo+" - Autor: "+autor+" - Numero de ejemplares: "
                +numEjemplares+" - Prestados: "+numPrestados;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumEjemplares() {
        return numEjemplares;
    }

    public void setNumEjemplares(int numEjemplares) {
        this.numEjemplares = numEjemplares;
    }

    public int getNumPrestados() {
        return numPrestados;
    }

    public void setNumPrestados(int numPrestados) {
        this.numPrestados = numPrestados;
    }
    
    
}
