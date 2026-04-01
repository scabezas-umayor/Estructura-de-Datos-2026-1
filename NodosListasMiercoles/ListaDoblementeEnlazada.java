package NodosListasMiercoles;

public class ListaDoblementeEnlazada {

    private NodoEnteros first; // primero
    private NodoEnteros last; // ultimo

    public ListaDoblementeEnlazada() {
        this.first = this.last = null;
    }

    public boolean listaVacia() {
        return this.first == null && this.last == null;
    }

    public void insertarAlPrincipio(int _dato) {
        NodoEnteros nuevo = new NodoEnteros(_dato);
        if (this.listaVacia()) {
            this.first = this.last = nuevo;
        } else {
            this.first.anterior = nuevo;
            nuevo.siguiente = this.first;
            this.first = nuevo;
        }
    }

    public void insertarAlFinal(int _dato) {
        NodoEnteros nuevo = new NodoEnteros(_dato);
        if (this.listaVacia()) {
            this.first = this.last = nuevo;
        } else {
            this.last.siguiente = nuevo;
            nuevo.anterior = this.last;
            this.last = nuevo;
        }
    }

    public NodoEnteros quitar(int _buscado) {
        if (this.listaVacia()) {
            return null;
        } else if (this.first.dato == _buscado) {
            NodoEnteros aux = this.first;
            this.first = aux.siguiente;
            this.first.anterior = null;
            return aux;
        } else if (this.last.dato == _buscado) {
            NodoEnteros aux = this.last;
            this.last = aux.anterior;
            this.last.siguiente = null;
            return aux;
        } else {
            NodoEnteros aux = this.first;
            NodoEnteros retorno;
            while (aux.siguiente != null) {
                if (aux.siguiente.dato == _buscado) {
                    retorno = aux.siguiente;
                    aux.siguiente.siguiente.anterior = aux.siguiente.anterior;
                    aux.siguiente = aux.siguiente.siguiente;
                    return retorno;
                }
                aux = aux.siguiente;
            }
            return null;
        }
    }

    public void mostrar(int _comoVer) {
        if (this.listaVacia()) {
            System.out.println("--- lista doble vacia ---");
        } else {
            // System.out.println("tiene elementos");
            if (_comoVer == 1) { // de adelante para atras
                // System.out.println("F -> L");
                NodoEnteros aux = this.first;
                while (aux != null) {
                    System.out.println(aux.dato);
                    aux = aux.siguiente;
                }
            } else if (_comoVer == 2) {
                // System.out.println("L -> F");
                NodoEnteros aux = this.last;
                while (aux != null) {
                    System.out.println(aux.dato);
                    aux = aux.anterior;
                }
            } else {
                System.out.println("Sin Seleccion para mostrar");
            }
            System.out.println("--- ---");
        }
    }

}
