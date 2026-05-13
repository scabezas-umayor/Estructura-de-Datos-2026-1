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
        try {
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
        } catch (Exception e) {
            System.out.println("=== ERROR === Cayó en la exception: " + e.getMessage());
        }

    }

    // nivel: la distancia entre la raíz (la raíz está en nivel 0), de sus hijos en
    // el nivel 1, y
    // así sucesivamente.
    public int obtenerNivel(int _valor) {
        return calcularNivel(this.raiz, _valor, 0);
    }

    private int calcularNivel(NodoArbol _actual, int _valor, int _nivelActual) {
        if (_actual == null) {
            return -1;
        }

        if (_actual.dato == _valor) {
            return _nivelActual;
        }

        if (_valor < _actual.dato) {
            return calcularNivel(_actual.izquierdo, _valor, _nivelActual + 1);
        } else {
            return calcularNivel(_actual.derecho, _valor, _nivelActual + 1);
        }

    }

    // altura: es el nivel máximo de cualquier nodo en el árbol + 1.
}
