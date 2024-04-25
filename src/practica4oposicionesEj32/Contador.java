package practica4oposicionesEj32;


public class Contador {
    private int cont; 
    
    public Contador(){
        
    }
    
    public Contador(int cont){
        if (cont >= 0){
            this.cont = cont;
        }else{
            this.cont = 0;
        }
    }
    
    public Contador(Contador c){
        this.cont = c.cont;
    }
    
    public int getCont(){
        return cont;
    }
    
    public void setCont(int n){
        if (n < 0){
            cont = 0;
        }else{
            cont = n;
        }
    }
    
    public void incrementa(){
        cont++;
    }
    
    public void decrementa(){
        cont--;
        if (cont < 0){
            cont = 0;
        }
    }
}
