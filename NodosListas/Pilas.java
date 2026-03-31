package NodosListas;

public class Pilas {

    NodoEnteros cima;

    // pila vacia
    public boolean pilaVacia() {
        return this.cima == null;
    }

    // push (insertarAlPrincipio)
    public void push(int _dato) {
        NodoEnteros nuevo = new NodoEnteros(_dato);
        nuevo.siguiente = this.cima;
        this.cima = nuevo;
    }

    // pop (para aquitar)

    // mostrar
    public void mostrar() {
        if (this.pilaVacia()) {
            System.out.println("--- Pila Vacia ---");
        } else {
            NodoEnteros aux = this.cima;
            while (aux != null) {
                System.out.println(aux.toString(aux));
                aux = aux.siguiente;
            }
        }
        System.out.println("-------------------");
    }

}
