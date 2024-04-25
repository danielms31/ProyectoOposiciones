/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica7oposiciones;

/**
 *
 * @author daniel
 */
public class Prueba {
    
    public static void main(String[] args){
        ListaGenericaDoble l = new ListaGenericaDoble();
        l.insertarPrimero(0);
        l.insertarUltimo(1);
        l.insertarUltimo(2);
        l.insertarUltimo(3);
        l.insertarUltimo(4);
        l.insertarEnPos(11, 5);

        
        l.imprimir();
    }
   
    
}
