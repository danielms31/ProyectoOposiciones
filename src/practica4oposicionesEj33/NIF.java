package practica4oposicionesEj33;

import java.util.Scanner;

public class NIF {
    
    private int numero; 
    private char letra; 
    
    public NIF(){
        
    }
    
    public NIF(int numero){
        this.numero = numero;
        this.letra = calculaLetra();
    }
    
    public void leer(){
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce el número del dni: ");
        numero = s.nextInt();
        letra = calculaLetra();
    }
    
    @Override
    public String toString(){ 
        return Integer.toString(numero)+"-"+Character.toUpperCase(letra);
    }
    
    private char calculaLetra(){
        char[] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        char l = letras[numero%23];
        return l;
    }
}
