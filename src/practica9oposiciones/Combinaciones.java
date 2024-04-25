/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica9oposiciones;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author daniel
 */
class Combinaciones {

    public void calculaCombinaciones(List<Integer> valores, List<Integer> combinacionActual, int longitud) {
        // Si la combinación actual tiene la longitud deseada, la imprime.
        if (combinacionActual.size() == longitud) {
            System.out.println(combinacionActual);
            return;
        }

        // Recorre todos los valores disponibles.
        for (Integer valor : valores) {
            // Añade el valor actual a la combinación parcial.
            combinacionActual.add(valor);
            // Genera las combinaciones recursivamente con el resto de valores.
            calculaCombinaciones(valores, combinacionActual, longitud);
            // Elimina el último valor añadido para probar con el siguiente.
            combinacionActual.remove(combinacionActual.size() - 1);
        }
    }
    
}
