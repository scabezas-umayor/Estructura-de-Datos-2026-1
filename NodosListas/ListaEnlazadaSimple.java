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
                System.out.println(aux.toString());
            }
        }
    }

    public boolean listaVacia(){
        return head == null;
    }

    public static void main(String[] args) {
        ListaEnlazadaSimple les = new ListaEnlazadaSimple();
        les.mostrar();
        
    }

}
