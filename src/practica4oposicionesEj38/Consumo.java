package practica4oposicionesEj38;


public class Consumo {
    
    public static void main(String[] args){
        Aparato bombilla = new Aparato(150); 
        Aparato plancha = new Aparato(2000);
        System.out.println("Consumo inicial = "+Aparato.getConsumo());
        bombilla.encender();
        plancha.encender();
        System.out.println("Consumo tras encender dos aparatos = "+Aparato.getConsumo());
        bombilla.apagar();
        System.out.println("Consumo tras apagar bombilla = "+Aparato.getConsumo());
    }
    
}
