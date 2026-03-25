package NodosListasMiercoles;

public class ListaSimplementeEnlazada {

    NodoEnteros head;

    public ListaSimplementeEnlazada() {
        this.head = null;
    }

    public boolean listaVacia() {
        return this.head == null;
    }

    public void mostrar() {
        if (listaVacia()) {
            System.out.println("--- Lista Vacia ---");
        } else {
            NodoEnteros aux = this.head;
            while (aux != null) {
                System.out.println(aux.toString(aux));
                aux = aux.siguiente;
            }
        }
        System.out.println("-------------------");
    }

    public void insertarAlPrincipio(int _dato){
        NodoEnteros nuevo = new NodoEnteros(_dato);
        nuevo.siguiente = head;
        head = nuevo;
    }

    public void insertarAlFinal(int _dato){
        NodoEnteros nuevo = new NodoEnteros(_dato);
        // recorrer
        NodoEnteros aux = this.head;
        while (aux.siguiente != null) {
            aux = aux.siguiente;
        }
        // estoy en el ultimo
        aux.siguiente = nuevo;
    }

    public void insertarDespuesDe(int _dato, int _buscado){
        NodoEnteros nuevo = new NodoEnteros(_dato);
        NodoEnteros aux = this.head;
        while (aux != null) {
            if (aux.dato == _buscado) {
                // que el nuevo apunte al mismo que apunta el buscado
                nuevo.siguiente = aux.siguiente;
                // el buscado ahora apunta al nuevo
                aux.siguiente = nuevo;
                // ya se hizo el cambio
                break;
            }
            aux = aux.siguiente;
        }
    }

    public static void main(String[] args) {
        ListaSimplementeEnlazada lse = new ListaSimplementeEnlazada();
        lse.mostrar();
        lse.insertarAlPrincipio(9);
        lse.mostrar();
        lse.insertarAlPrincipio(5);
        lse.mostrar();
        lse.insertarAlPrincipio(1);
        lse.mostrar();
        lse.insertarAlFinal(4);
        lse.mostrar();
        lse.insertarDespuesDe(2, 5);
        lse.mostrar();
    }

}
