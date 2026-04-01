package NodosListasMiercoles;

public class AppDobles {
    public static void main(String[] args) {
        ListaDoblementeEnlazada lde = new ListaDoblementeEnlazada();
        System.out.println("¿Esta vacia? " + lde.listaVacia()); // true
        lde.mostrar(1); // Lista Vacia
        lde.insertarAlPrincipio(9);
        lde.insertarAlPrincipio(5);
        lde.mostrar(1); // 5 - 9
        lde.insertarAlFinal(1);
        lde.insertarAlFinal(4);
        lde.insertarAlFinal(2);
        lde.mostrar(1); // 5 - 9 - 1 - 4 - 2
        lde.mostrar(2); // 2 - 4 - 1 - 9 - 5
        lde.quitar(5); // es el primero
        lde.mostrar(1); // 9 - 1 - 4 - 2
        lde.quitar(2); // es el ultimo
        lde.mostrar(1); // 9 - 1 - 4
        lde.quitar(1);
        lde.mostrar(1); // 9 - 4
    }
}
