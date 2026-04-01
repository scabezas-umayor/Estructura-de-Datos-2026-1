package NodosListasMiercoles;

public class Cola {

    private NodoEnteros primero;

    public boolean colaVacia() {
        return this.primero == null;
    }

    public void enqueue(int _dato) { // add
        NodoEnteros nuevo = new NodoEnteros(_dato);
        if (this.colaVacia()) {
            this.primero = nuevo;
        } else {
            NodoEnteros aux = this.primero;
            while (aux.siguiente != null) {
                aux = aux.siguiente;
            }
            aux.siguiente = nuevo;
        }
    }

    public NodoEnteros dequeue() { // remove
        NodoEnteros aux = this.primero;
        this.primero = aux.siguiente;
        return aux;
    }

}
