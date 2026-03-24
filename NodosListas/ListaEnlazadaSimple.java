package NodosListas;

public class ListaEnlazadaSimple {
    
    private NodoEnteros head;

    // Constructor por defecto
    public ListaEnlazadaSimple(){
        this.head = null;
    }

    public void mostrar(){
        if (this.listaVacia()) {
            System.out.println("--- Lista Vacia ---");
        }else{
            NodoEnteros aux = head;
            while (aux != null) {
                System.out.println(aux.toString(aux));
                aux = aux.siguiente;
            }
        }
    }

    public boolean listaVacia(){
        return head == null;
    }

    public void insertarAlPrincipio(int _dato){
        NodoEnteros nuevo = new NodoEnteros(_dato);
        nuevo.siguiente = head;
        head = nuevo;
    }

    public static void main(String[] args) {
        ListaEnlazadaSimple les = new ListaEnlazadaSimple();
        // Comenzamos con una lista vacia
        les.mostrar();
        // Insertamos el 9 al principio
        les.insertarAlPrincipio(9);
        // Una lista con el valor 9 ->
        les.mostrar();

    }

}
