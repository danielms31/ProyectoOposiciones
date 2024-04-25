package practica5oposicionesEj43;

public class PartidoFutbol {
    private String local; 
    private String visitante;
    private int golesL;
    private int golesV;
    
    public PartidoFutbol(){
        
    }

    public PartidoFutbol(String local, String visitante, int golesL, int golesV) {
        this.local = local;
        this.visitante = visitante;
        this.golesL = golesL;
        this.golesV = golesV;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getVisitante() {
        return visitante;
    }

    public void setVisitante(String visitante) {
        this.visitante = visitante;
    }

    public int getGolesL() {
        return golesL;
    }

    public void setGolesL(int golesL) {
        this.golesL = golesL;
    }

    public int getGolesV() {
        return golesV;
    }

    public void setGolesV(int golesV) {
        this.golesV = golesV;
    }
    
    
    
    
}
