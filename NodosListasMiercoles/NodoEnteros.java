package NodosListasMiercoles;

public class NodoEnteros {

    int dato;
    NodoEnteros siguiente;

    public NodoEnteros(int _dato) {
        this.dato = _dato;
        this.siguiente = null;
    }

    public String toString(NodoEnteros _nodo) {
        return "[" + _nodo.dato + "] --> " + _nodo.siguiente;
    }

}
