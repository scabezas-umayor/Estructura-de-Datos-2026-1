package NodosListasMiercoles;

public class AppColas {
    public static void main(String[] args) {
        Cola c1 = new Cola();
        System.out.println("¿Cola Vacia?: " + c1.colaVacia());
        c1.enqueue(9);
        c1.enqueue(5);
        c1.enqueue(1);
        c1.enqueue(4);
        System.out.println("¿Cola Vacia?: " + c1.colaVacia());
        NodoEnteros sale = c1.dequeue();
        System.out.println(sale.dato); // => 9
        sale = c1.dequeue();
        System.out.println(sale.dato); // => 5
        sale = c1.dequeue();
        System.out.println(sale.dato); // => 1
        sale = c1.dequeue();
        System.out.println(sale.dato); // => 4
        try {
            sale = c1.dequeue();
            System.out.println(sale.dato); // => null
        } catch (Exception e) {
            System.out.println("Error, ¿parece que tiene la Cola Vacia?: " + c1.colaVacia());
        }
    }
}
