package practica5oposicionesEj44;

public class Cuenta {
    
    private String cliente; 
    private String numero;
    private double tipoInteres;
    private double saldo; 
    
    public Cuenta(){
        
    }
    
    public Cuenta(String cliente, String numero, double tipoInteres, double saldo){
        this.cliente = cliente; 
        this.numero = numero; 
        this.tipoInteres = tipoInteres; 
        this.saldo = saldo; 
    }
    
    public Cuenta(Cuenta c){
        this.cliente = c.cliente; 
        this.numero = c.numero;
        this.tipoInteres = c.tipoInteres;
        this.saldo = c.saldo; 
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public boolean ingreso(double cantidad){
        boolean result = false;
        if (cantidad > 0){
            saldo += cantidad;
            result = true;
        }
        return result;
    }
    
    public boolean reintegro(double cantidad){
        boolean result = false; 
        if (saldo >= cantidad){
            saldo -= cantidad;
            result = true;
        }
        return result;
    }
    
    public boolean transferencia(Cuenta destino, double importe){
        boolean result = false;
        if (this.saldo >= importe && importe > 0){
            reintegro(importe);
            destino.ingreso(importe);
            result = true;
        }
        return result;
    }
    
}
