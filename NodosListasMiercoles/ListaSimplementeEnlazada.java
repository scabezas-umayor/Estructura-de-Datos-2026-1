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
            NodoEnteros aux = head;
            while (aux != null) {
                System.out.println(aux.toString());
                aux = aux.siguiente;
            }
        }
        System.out.println("-------------------");
    }

    public static void main(String[] args) {
        ListaSimplementeEnlazada lse = new ListaSimplementeEnlazada();
        lse.mostrar();
    }

}
