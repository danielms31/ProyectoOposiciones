package practica5oposicionesEj45;

public class Coche {
    private String matricula; 
    private String marca; 
    private String modelo; 
    private int km;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }
    
    @Override
    public String toString(){
        return "Matricula: "+matricula+"\nMarca: "+marca+"\nModelo: "+modelo+"\nKilometros: "+km;
    }
}
