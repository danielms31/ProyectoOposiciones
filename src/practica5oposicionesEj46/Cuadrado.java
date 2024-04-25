package practica5oposicionesEj46;

public class Cuadrado extends Figura{
    
    public Cuadrado(int lado){
        super(lado,lado);
    }
    
    @Override
    public double area() {
        return ancho*alto;
    }
}
