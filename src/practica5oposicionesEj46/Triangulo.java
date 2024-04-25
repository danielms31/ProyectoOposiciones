package practica5oposicionesEj46;

public class Triangulo extends Figura{

    public Triangulo(int ancho, int alto){
        super(ancho,alto);
    }
    
    @Override
    public double area() {
        return (ancho*alto)/2;
    }
    
}
