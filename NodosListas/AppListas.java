package NodosListas;

public class AppListas {
    public static void main(String[] args) {
        
        ListaDoblementeEnlazada lde = new ListaDoblementeEnlazada();
        lde.mostrar(1);
        lde.agregarAlPrincipio(9);
        lde.agregarAlPrincipio(5);
        lde.mostrar(1); // 5 - 9 
        lde.mostrar(2); // 9 - 5
        lde.agregarAlFinal(1);
        lde.mostrar(1); // 5 - 9 - 1
        lde.mostrar(2); // 1 - 9 - 5
        lde.quitar(5);
        lde.mostrar(1); // 9 - 1
        lde.quitar(1);
        lde.mostrar(1); // 9
        lde.agregarAlPrincipio(4);
        lde.agregarAlFinal(2);
        lde.mostrar(1); // 4 - 9 - 2
        lde.quitar(9);
        lde.mostrar(1); // 4 - 2

    }
}
