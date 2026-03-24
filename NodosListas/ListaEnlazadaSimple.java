package NodosListas;

public class ListaEnlazadaSimple {
    
    private NodoEnteros head;

    public ListaEnlazadaSimple(){
        this.head = null;
    }

    public void mostrar(){
        NodoEnteros aux = head;
        while (aux != null) {
            aux.toString();
        }
    }

}
