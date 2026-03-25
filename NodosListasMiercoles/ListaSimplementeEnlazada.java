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
    }

}
