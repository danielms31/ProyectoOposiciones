package practicaz10oposiciones;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Pila {

    static class Nodo {

        int valor;
        Nodo sig;

        public Nodo(int v) {
            this.valor = v;
        }
    }

    private Nodo cima;

    public void apilar(int x) {
        Nodo n = new Nodo(x);
        n.sig = cima;
        cima = n;
    }

    public Integer cima() {
        Integer r = null;
        if (cima != null) {
            return cima.valor;
        }
        return r;
    }

    public boolean isPilaVacia() {
        return cima == null;
    }

    public void desApilar() {
        if (cima != null) {
            cima = cima.sig;
        }
    }

    private void escribeNumero(int num, String nombreFich) {
        try {
            BufferedWriter b = new BufferedWriter(new FileWriter(nombreFich, true));
            b.write(Integer.toString(num) + " ");
            b.close();
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo");
        }

    }

    public void volcado() {
        Nodo n = cima;
        if (cima != null) {
            if (n.valor % 2 == 0) {
                escribeNumero(n.valor, "pares.txt");
            } else {
                escribeNumero(n.valor, "impares.txt");
            }
            volcado()
        }

        n = n.sig;
    }
}

}
