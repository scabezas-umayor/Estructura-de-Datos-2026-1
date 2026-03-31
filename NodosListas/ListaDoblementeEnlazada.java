package NodosListas;

public class ListaDoblementeEnlazada {
    private NodoEnteros first, last;

    public ListaDoblementeEnlazada() {
        this.first = this.last = null;
    }

    public boolean listaVacia() {
        return this.first == null && this.last == null;
    }

    public void agregarAlPrincipio(int _dato) {
        NodoEnteros nuevo = new NodoEnteros(_dato);
        if (this.listaVacia()) {
            this.first = this.last = nuevo;
        } else {
            first.anterior = nuevo;
            nuevo.siguiente = first;
            first = nuevo;
        }
    }

    public void agregarAlFinal(int _dato) {
        NodoEnteros nuevo = new NodoEnteros(_dato);
        if (this.listaVacia()) {
            this.first = this.last = nuevo;
        } else {
            this.last.siguiente = nuevo;
            nuevo.anterior = this.last;
            this.last = nuevo;
        }
    }

    public void quitar(int _buscado) {
        // antes de quitar, preguntamos si es
        // el primero o el ultimo
        if (this.first.dato == _buscado) {
            this.first.siguiente.anterior = null;
            this.first = this.first.siguiente;
        } else if (this.last.dato == _buscado) {
            this.last.anterior.siguiente = null;
            this.last = this.last.anterior;
        } else {
            // recorremos
            NodoEnteros aux = this.first;
            while (aux != null) {
                if (aux.dato == _buscado) {
                    aux.anterior.siguiente = aux.siguiente;
                    aux.siguiente.anterior = aux.anterior;
                    //System.out.println("quitar: " + aux.dato);
                }
                aux = aux.siguiente;
            }
        }

        /*
         * // int contador = 1;
         * if (aux.siguiente.dato == _dato) {
         * // System.out.println("Encontrado " + _dato + " Contador: " + contador);
         * // le voy a quitar el que apunta el siguiente de mi aux
         * // se lo asigno al actual
         * aux.siguiente = aux.siguiente.siguiente;
         * }
         * aux = aux.siguiente;
         * // contador++;
         * }
         */
    }

    public void mostrar(int _paDonde) {
        NodoEnteros aux;
        if (this.listaVacia()) {
            System.out.println("-- lista doble vacia --");
        } else {

            if (_paDonde == 1) {
                // adelante para atras
                aux = this.first;
                while (aux != null) {
                    System.out.println(aux.dato);
                    aux = aux.siguiente;
                }
            } else if (_paDonde == 2) {
                // atras para adelante
                aux = this.last;
                while (aux != null) {
                    System.out.println(aux.dato);
                    aux = aux.anterior;
                }
            } else {
                System.out.println("No selecciono de donde mostrar.");
            }
            System.out.println("-- fin --");
        }

    }
}
