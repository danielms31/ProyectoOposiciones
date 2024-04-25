package practica6biSoposiciones;


public class Asalariado extends Trabajador{
    private double salario; 
    private String puesto; 
    
    public Asalariado(){
        
    }
    
    public Asalariado(int id, String apellidos, String nombre, String telefono,double salario,String puesto){
        super(id,apellidos,nombre,telefono);
        this.salario = salario; 
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    @Override
    public String toString(){
        return super.toString()+";"+getSalario()+";"+getPuesto();
    }
}
