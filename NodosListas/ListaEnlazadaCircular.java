package NodosListas;

public class ListaEnlazadaCircular {

    private NodoEnteros head;

    public ListaEnlazadaCircular() {
        this.head = null;
    }

    public void mostrar(int _cuantasVeces) {
        if (this.listaVacia()) {
            System.out.println("--- Lista Circular Vacia ---");
        } else {
            System.out.println("--- tiene cositas la lista circular: mostrando " + _cuantasVeces + " veces ---");

            while (_cuantasVeces > 0){
                System.out.println("vez: " + _cuantasVeces);
                
                NodoEnteros aux = this.head;
                System.out.println(aux.toString(aux));

                //while (aux != this.head) {
                //    aux = aux.siguiente;
                //}

                _cuantasVeces--;
            }


        }
        System.out.println("-------------------");
    }

    public boolean listaVacia() {
        return this.head == null;
    }

    public void insertarAlPrincipio(int _dato) {
        NodoEnteros nuevo = new NodoEnteros(_dato);
        nuevo.siguiente = head;
        head = nuevo;
    }

    public void insertarAlFinal(int _dato) {
        NodoEnteros nuevo = new NodoEnteros(_dato);
        NodoEnteros aux = head;
        while (aux.siguiente != null) {
            aux = aux.siguiente;
        }
        aux.siguiente = nuevo;
    }

    public void insertarDespuesDe(int _dato, int _buscado) {
        NodoEnteros nuevo = new NodoEnteros(_dato);
        NodoEnteros aux = head;
        while (aux != null) {
            if (aux.dato == _buscado) {
                nuevo.siguiente = aux.siguiente;
                aux.siguiente = nuevo;
                break;
            }
            aux = aux.siguiente;
        }
    }

    public void quitar(int _dato) {
        NodoEnteros aux = head;
        // int contador = 1;
        while (aux.siguiente != null) {
            if (aux.siguiente.dato == _dato) {
                // System.out.println("Encontrado " + _dato + " Contador: " + contador);
                // le voy a quitar el que apunta el siguiente de mi aux
                // se lo asigno al actual
                aux.siguiente = aux.siguiente.siguiente;
            }
            aux = aux.siguiente;
            // contador++;
        }
    }
}
