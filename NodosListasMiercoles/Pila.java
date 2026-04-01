package NodosListasMiercoles;

public class Pila {

    private NodoEnteros cima;

    // pilaVacia
    public boolean pilaVacia() {
        return this.cima == null;
    }

    // push
    public void push(int _dato) {
        NodoEnteros nuevo = new NodoEnteros(_dato);
        if (this.pilaVacia()) {
            this.cima = nuevo;
        } else {
            nuevo.siguiente = this.cima;
            this.cima = nuevo;
        }
    }

    // pop
    public NodoEnteros pop() {
        NodoEnteros aux = this.cima;
        this.cima = aux.siguiente;
        return aux;
    }
}
