package NodosListas;

public class Pila {

    NodoEnteros cima;

    // pila vacia
    public boolean pilaVacia() {
        return this.cima == null;
    }

    // push (insertarAlPrincipio)
    public void push(int _dato) {
        NodoEnteros nuevo = new NodoEnteros(_dato);
        nuevo.siguiente = this.cima;
        this.cima = nuevo;
    }

    // pop (para aquitar)
    public NodoEnteros pop() {
        NodoEnteros aux = this.cima;
        this.cima = aux.siguiente;
        return aux;
    }

}
