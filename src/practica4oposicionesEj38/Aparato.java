package practica4oposicionesEj38;

public class Aparato {
    
    private static int consumoTotal = 0;
    
    public static double getConsumo(){
        return consumoTotal;
    }
    
    private int potencia; 
    private boolean encendido;
    
    public Aparato(int potencia){
        this.potencia = potencia;
        this.encendido = false;
    }
    
    public void encender(){
        if (!encendido){
            this.encendido = true;
            consumoTotal = consumoTotal + potencia;
        } 
    }
    
    public void apagar(){
        if (encendido){
            this.encendido = false;
            consumoTotal = consumoTotal - potencia;
        }
    }
   
}
