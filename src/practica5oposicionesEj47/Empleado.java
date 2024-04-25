package practica5oposicionesEj47;

public class Empleado extends Persona{
    private int numEmpleado;
    private String departamento; 
    private String puesto;

    public Empleado(){
        
    }
    
    public Empleado(String nombre, int edad, char sexo, int numEmpleado,String departamento, String puesto){
        super(nombre,edad,sexo);
        this.numEmpleado = numEmpleado; 
        this.departamento = departamento; 
        this.puesto = puesto;
    }

    public int getNumEmpleado() {
        return numEmpleado;
    }

    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
}
