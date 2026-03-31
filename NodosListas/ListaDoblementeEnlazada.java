package NodosListas;

public class ListaDoblementeEnlazada {
    private NodoEnteros first, last;

    public ListaDoblementeEnlazada() {
        this.first = this.last = null;
    }

    public boolean listaVacia() {
        return this.first == null && this.last == null;
    }

    public void agregarAlPrincipio(int _dato) {
        NodoEnteros nuevo = new NodoEnteros(_dato);
        if (this.listaVacia()) {
            this.first = this.last = nuevo;
        } else {
            first.anterior = nuevo;
            nuevo.siguiente = first;
            first = nuevo;
        }
    }

    public void agregarAlFinal(int _dato) {
        NodoEnteros nuevo = new NodoEnteros(_dato);
        if (this.listaVacia()) {
            this.first = this.last = nuevo;
        } else {
            this.last.siguiente = nuevo;
            nuevo.anterior = this.last;
            this.last = nuevo;
        }
    }

    public void mostrar(int _paDonde) {
        NodoEnteros aux;
        if (this.listaVacia()) {
            System.out.println("-- lista doble vacia --");
        } else {

            if (_paDonde == 1) {
                // adelante para atras
                aux = this.first;
                while (aux != null) {
                    System.out.println(aux.dato);
                    aux = aux.siguiente;
                }
            } else if (_paDonde == 2) {
                // atras para adelante
                aux = this.last;
                while (aux != null) {
                    System.out.println(aux.dato);
                    aux = aux.anterior;
                }
            } else {
                System.out.println("No selecciono de donde mostrar.");
            }
            System.out.println("-- fin --");
        }

    }
}
