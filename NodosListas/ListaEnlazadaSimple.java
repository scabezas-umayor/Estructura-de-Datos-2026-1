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
        System.out.println("-------------------");
    }

    public boolean listaVacia(){
        return head == null;
    }

    public void insertarAlPrincipio(int _dato){
        NodoEnteros nuevo = new NodoEnteros(_dato);
        nuevo.siguiente = head;
        head = nuevo;
    }

    public void insertarAlFinal(int _dato){
        NodoEnteros nuevo = new NodoEnteros(_dato);
        NodoEnteros aux = head;
        while(aux.siguiente != null){
            aux = aux.siguiente;
        }
        aux.siguiente = nuevo;
    }

    public void insertarDespuesDe(int _dato, int _buscado){
        NodoEnteros nuevo = new NodoEnteros(_dato);
        NodoEnteros aux = head;
        while(aux != null){
            if (aux.dato == _buscado){
                nuevo.siguiente = aux.siguiente;
                aux.siguiente = nuevo;
                break;
            }
            aux = aux.siguiente;
        }
    }

    public void quitar(int _dato){
        NodoEnteros aux = head;
        int contador = 1;
        while(aux.siguiente != null){
            if (aux.siguiente.dato == _dato){
                System.out.println("Encontrado " + _dato + " Contador: " + contador);
                // le voy a quitar el que apunta el siguiente de mi aux
                // se lo asigno al actual
                aux.siguiente = aux.siguiente.siguiente;
            }
            aux = aux.siguiente;
            contador++;
        }
    }

    public static void main(String[] args) {
        ListaEnlazadaSimple les = new ListaEnlazadaSimple();
        // Comenzamos con una lista vacia
        les.mostrar();
        // Insertamos el 9 al principio
        les.insertarAlPrincipio(9);
        // Una lista con el valor 9 ->
        les.mostrar();
        les.insertarAlPrincipio(5);
        les.mostrar();
        les.insertarAlPrincipio(1);
        les.mostrar();
        les.insertarAlFinal(4);
        les.mostrar();
        les.insertarAlFinal(6);
        les.mostrar();
        les.insertarDespuesDe(8, 5);
        les.mostrar();
        les.quitar(8);
        les.mostrar();

    }

}
