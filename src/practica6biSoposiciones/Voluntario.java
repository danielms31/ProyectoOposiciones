package practica6biSoposiciones;

public class Voluntario extends Trabajador{
    
    private String turno; 
    private String funcion;
    
    public Voluntario(){
        
    }
    
    public Voluntario(int id, String apellidos, String nombre, String telefono,String turno,String funcion){
        super(id,apellidos,nombre,telefono);
        this.turno = turno; 
        this.funcion = funcion;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }
    
    @Override
    public String toString(){
        return super.toString()+";"+getTurno()+";"+getFuncion();
    }
    
}
