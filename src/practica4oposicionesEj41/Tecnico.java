/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica4oposicionesEj41;

/**
 *
 * @author daniel
 */
public class Tecnico extends Operario{
    public Tecnico(String nombre) {
        super(nombre);
    }
    
    @Override
    public String toString(){
        return super.toString()+" -> Tecnico ";
    }
}
