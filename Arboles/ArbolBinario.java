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

    private NodoArbol insertarRecursivo(NodoArbol _actual, int _dato){

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

}
