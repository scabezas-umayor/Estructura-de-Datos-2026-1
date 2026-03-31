package NodosListas;

public class Cola {

    NodoEnteros primero;

    public boolean colaVacia() {
        return this.primero == null;
    }

    public void enqueue(int _dato) {
        NodoEnteros nuevo = new NodoEnteros(_dato);

        if (colaVacia()) {
            this.primero = nuevo;
        } else {
            NodoEnteros aux = this.primero;
            while (aux.siguiente != null) {
                aux = aux.siguiente;
            }
            aux.siguiente = nuevo;
        }

    }

    public NodoEnteros pop() {
        NodoEnteros aux = this.primero;
        this.primero = aux.siguiente;
        return aux;
    }

}
