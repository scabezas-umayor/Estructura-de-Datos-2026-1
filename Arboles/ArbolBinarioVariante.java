package Arboles;

public class ArbolBinarioVariante {
    private NodoArbol raiz;

    public ArbolBinarioVariante() {
        this.raiz = null;
    }

    public NodoArbol getRaiz() {
        return this.raiz;
    }

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

    public void recorrido(NodoArbol _nodo, String _nombre) {
        switch (_nombre.toLowerCase()) {
            case "pre":
                if (_nodo != null) {
                    System.out.print(_nodo.dato + " ");
                    recorrido(_nodo.izquierdo, "pre");
                    recorrido(_nodo.derecho, "pre");
                }
                break;
            case "post":
                if (_nodo != null) {
                    recorrido(_nodo.izquierdo, "post");
                    recorrido(_nodo.derecho, "post");
                    System.out.print(_nodo.dato + " ");
                }
                break;
            case "in":
                if (_nodo != null) {
                    recorrido(_nodo.izquierdo, "in");
                    System.out.print(_nodo.dato + " ");
                    recorrido(_nodo.derecho, "in");
                }
                break;
            default:
                System.out.println("=== ERROR === No se ha definido el tipo de recorrido");
                break;
        }

    }
}
