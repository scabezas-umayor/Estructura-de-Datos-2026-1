package Arboles;

public class ArbolBinario {

    private NodoArbol raiz;

    public ArbolBinario() {
        this.raiz = null;
    }

    // 1. Inserción recursiva
    public void insertar(int _dato) {
        this.raiz = insertarRecursivo(this.raiz, _dato);
    }

    private NodoArbol insertarRecursivo(NodoArbol _actual, int _dato) {

        if (_actual == null) {
            return new NodoArbol(_dato);
        }

        if (_dato < _actual.dato) {
            _actual.izquierdo = insertarRecursivo(_actual.izquierdo, _dato);
        } else if (_dato > _actual.dato) {
            _actual.derecho = insertarRecursivo(_actual.derecho, _dato);
        }

        return _actual;

    }

    // 2. Recorridos
    // 2.1 Pre-Orden: Raiz -> Izquierda -> Derecha
    public void recorridoPreOrden(NodoArbol _nodo) {
        if (_nodo != null) {
            System.out.print(_nodo.dato + " ");
            recorridoPreOrden(_nodo.izquierdo);
            recorridoPreOrden(_nodo.derecho);
        } else {
            System.out.print("/");
        }
    }
    // 2.2 Post-Orden: Izquierda -> Derecha -> Raiz
    public void recorridoPostOrden(NodoArbol _nodo) {
        if (_nodo != null) {
            recorridoPostOrden(_nodo.izquierdo);
            recorridoPostOrden(_nodo.derecho);
            System.out.print(_nodo.dato + " ");
        }else{
            System.out.print("/");
        }
    }

}
