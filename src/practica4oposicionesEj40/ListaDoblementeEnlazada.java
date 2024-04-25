package practica4oposicionesEj40;

public class ListaDoblementeEnlazada {

    class Nodo {

        int valor;
        Nodo sig, ant;

        public Nodo(int valor) {
            this.valor = valor;
        }
    }

    private Nodo raiz;

    public ListaDoblementeEnlazada() {
        raiz = null;
    }

    public void insertarPrincipio(int x) {
        Nodo nuevo = new Nodo(x);
        nuevo.sig = raiz;
        if (raiz != null) {
            raiz.ant = nuevo;
        }
        raiz = nuevo;
    }

    public void insertarFinal(int x) {
        Nodo nuevo = new Nodo(x);
        if (raiz == null) {
            raiz = nuevo;
        } else {
            Nodo fin = raiz;
            while (fin.sig != null) {
                fin = fin.sig;
            }
            fin.sig = nuevo;
            nuevo.ant = fin;
        }

    }

    public void insertarSegundaPos(int x) {
        if (raiz != null) {
            Nodo nuevo = new Nodo(x);
            if (raiz.sig == null) {  //Solo hay 1 nodo
                raiz.sig = nuevo;
                nuevo.ant = raiz;
            } else {  //2 o mas nodos
                Nodo aux = raiz.sig;
                nuevo.ant = raiz;
                nuevo.sig = aux;
                aux.ant = nuevo;
                raiz.sig = nuevo;
            }
        }
    }

    public void insertarPenultima(int x) {
        if (raiz != null) {
            Nodo nuevo = new Nodo(x);
            if (raiz.sig == null) {
                nuevo.sig = raiz;
                raiz = nuevo;
            } else {
                Nodo fin = raiz;
                while (fin.sig != null) {
                    fin = fin.sig;
                }
                Nodo penultimo = fin.ant;
                penultimo.sig = nuevo;
                nuevo.sig = fin;
                fin.ant = nuevo;
                nuevo.ant = penultimo;
            }
        }
    }

    public void borrarNodo1() {
        if (raiz != null) {
            raiz = raiz.sig;
        }
    }

    public void borrarSegundoNodo() {
        if (raiz.sig != null) {
            raiz.sig = raiz.sig.sig;
            if (raiz.sig != null) {
                raiz.sig.ant = raiz;
            }
        }
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
                n = n.ant;
                n.sig = null;
            }
        }
    }

    public void borrarInfoMayor() {
        Nodo n = raiz;
        int max = n.valor;
        while (n != null) {   //Primer bucle para encontrar el maximo valor
            if (n.valor > max) {
                max = n.valor;
            }
            n = n.sig;
        }

        //Volvemos a recorrer la lista y cuando encontremos el maximo valor lo borramos
        n = raiz;
        while (n != null) {
            if (n.valor == max) {
                if (n != raiz) {
                    Nodo anterior = n.ant;
                    Nodo siguiente = n.sig;
                    if (anterior != null) {
                        anterior.sig = siguiente;
                    }
                    if (siguiente != null) {
                        siguiente.ant = anterior;
                    }
                } else {
                    raiz = null;
                }
                break;
            } else {
                n = n.sig;
            }
        }
    }

    public void imprimir() {
        Nodo n = raiz;
        System.out.print("[ ");
        while (n != null) {
            System.out.print(n.valor + " ");
            n = n.sig;
        }
        System.out.println("]");
    }

}
