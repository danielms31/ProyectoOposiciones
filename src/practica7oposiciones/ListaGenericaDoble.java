package practica7oposiciones;

public class ListaGenericaDoble {

    static class Nodo {

        int valor;
        Nodo sig;
        Nodo ant;
    }

    private Nodo raiz;

    public ListaGenericaDoble() {
        raiz = null;
    }

    public int contarNodos() {
        int numNodos = 0;

        if (raiz != null) {
            Nodo n = raiz;
            while (n != null) {
                numNodos++;
                n = n.sig;
            }
        }

        return numNodos;
    }

    public boolean vacia() {
        boolean vacia = true;
        if (raiz != null) {
            vacia = false;
        }
        return vacia;
    }

    public int maximo() {
        int max = Integer.MIN_VALUE;

        if (!vacia()) {
            Nodo n = raiz;
            while (n != null) {
                if (n.valor > max) {
                    max = n.valor;
                }
                n = n.sig;
            }
        }

        return max;
    }

    public void imprimir() {
        Nodo n = raiz;
        while (n != null) {
            System.out.print(n.valor + " ");
            n = n.sig;
        }
        System.out.println();

    }

    public Integer getInfo(int pos) {
        int p = 0;
        Integer info = null;
        if (pos <= contarNodos()) {
            Nodo n = raiz;
            while (n != null) {
                if (p == pos) {
                    info = n.valor;
                    break;
                }
                p++;
                n = n.sig;
            }
        }
        return info;
    }

    public void borrarUltimo() {
        if (raiz != null) {
            if (raiz.sig == null) {
                raiz = null;
            } else {
                Nodo n = raiz;
                while (n.sig != null) {
                    n = n.sig;
                }
                n.ant.sig = null;
            }
        }
    }

    public void borrarPrimero() {
        if (raiz != null) {
            raiz = raiz.sig;
        }
    }

    public void borrarNodo(int pos) {
        int p = 0;
        if (pos < contarNodos()) {
            if (pos == 0) {
                borrarPrimero();
            } else {
                if (pos == contarNodos() - 1) {
                    borrarUltimo();
                } else {
                    if (raiz != null) {
                        Nodo n = raiz;
                        while (n != null) {
                            if (p == pos) {
                                n.ant.sig = n.sig;
                                n.sig.ant = n.ant;
                                break;
                            }
                            n = n.sig;
                        }
                    }
                }
            }

        }
    }

    public void insertarPrimero(int n) {
        Nodo nodo = new Nodo();
        nodo.valor = n;
        nodo.sig = raiz;
        if (raiz != null) {
            raiz.ant = nodo;
        }
        raiz = nodo;
    }

    public void insertarUltimo(int n) {
        Nodo nodo = new Nodo();
        nodo.valor = n;
        if (raiz == null) {
            raiz = nodo;
        } else {
            Nodo n2 = raiz;
            while (n2.sig != null) {
                n2 = n2.sig;
            }
            n2.sig = nodo;
            nodo.ant = n2;
        }
    }

    public void insertarEnPos(int valor, int pos) {
        if (pos <= contarNodos()) {
            if (pos == 0) {
                insertarPrimero(valor);
            } else {
                if (pos == contarNodos()) {
                    insertarUltimo(valor);
                } else {
                    Nodo n = new Nodo();
                    n.valor = valor;
                    if (raiz == null) {
                        raiz = n;
                    }else{
                        Nodo n2 = raiz;
                        for (int i=0; i < pos; i++){
                            n2 = n2.sig;
                        }
                        n2.ant.sig = n;
                        n.ant = n2.ant;
                        n2.ant = n;
                        n.sig = n2;
                        
                    }
                }
            }
        }

    }

}
