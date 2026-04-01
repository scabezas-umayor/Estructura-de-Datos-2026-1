package NodosListasMiercoles;

public class AppPilasColasListas {
    public static void main(String[] args) {
        Pila p1 = new Pila();
        System.out.println("¿Esta Vacia?: " + p1.pilaVacia());
        p1.push(9);
        p1.push(5);
        p1.push(1);
        p1.push(4);
        System.out.println("¿Esta Vacia?: " + p1.pilaVacia());
        NodoEnteros sale = p1.pop();
        System.out.println(sale.dato); // => 4
        sale = p1.pop();
        System.out.println(sale.dato); // => 1
        sale = p1.pop();
        System.out.println(sale.dato); // => 5
        sale = p1.pop();
        System.out.println(sale.dato); // => 9
        try {
            sale = p1.pop();
            System.out.println(sale.dato); // => vacia
        } catch (Exception e) {
            System.out.println("Error, pila vacia? " + p1.pilaVacia());
        }

    }
}
