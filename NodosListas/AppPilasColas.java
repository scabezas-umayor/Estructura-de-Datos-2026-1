package NodosListas;

public class AppPilasColas {

    public static void main(String[] args) {
        Pila p1 = new Pila();
        p1.push(9);
        p1.push(5);
        p1.push(1);

        if (p1.pilaVacia()) {
            System.out.println("Pila Vacia");
        } else {
            NodoEnteros aux = p1.pop();
            while (aux!=null) {
                System.out.println(aux.dato);
                aux = aux.siguiente;
            }
        }
    }

}
