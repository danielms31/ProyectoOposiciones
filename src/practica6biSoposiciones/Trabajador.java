package practica6biSoposiciones;


public class Trabajador {
    protected int id; 
    protected String apellidos;
    protected String nombre; 
    protected String telefono;    //String por si se utilizara prefijo internacional (ej +34)
    
    public Trabajador(){
    
    }
    
    public Trabajador(int id, String apellidos, String nombre, String telefono){
        this.id = id; 
        this.apellidos = apellidos; 
        this.nombre = nombre; 
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    @Override
    public String toString(){
        return getId()+";"+getApellidos()+";"+getNombre()+";"+getTelefono();
    }
}
