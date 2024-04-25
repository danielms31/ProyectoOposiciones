package practica5oposicionesEj46;

public class Rectangulo extends Figura{
    
    public Rectangulo(int ancho, int alto){
        super(ancho,alto);
    }
    
    @Override
    public double area() {
        return ancho*alto;
    }
}
