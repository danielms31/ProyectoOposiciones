package practica5oposicionesEj44;

public class Principal {
    
    public static void main(String[] args){
        Cuenta c = new Cuenta("Daniel","123123123123A",2.5,1000);
        System.out.println("El saldo de la cuenta es :"+c.getSaldo());
        c.ingreso(100);
        System.out.println("El saldo de la cuenta es :"+c.getSaldo());
        c.reintegro(500);
        System.out.println("El saldo de la cuenta es :"+c.getSaldo());
        c.reintegro(600);
        System.out.println("El saldo de la cuenta es :"+c.getSaldo());
    }
    
}
