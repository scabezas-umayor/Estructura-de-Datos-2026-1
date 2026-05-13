package Arboles;

public class Ejercicio2App {

    public static void main(String[] args) {
        ArbolBinarioVariante abv = new ArbolBinarioVariante();
        Biblioteca lib = new Biblioteca();

        int[] valores = { 50, 30, 70, 20, 40, 60, 80 };
        // int[] valores = { 50, 30, 70, 20, 40 };

        // Mostrar el arbol con los datos
        lib.mostrarArreglo(valores, "Valores Iniciales");

        // Insertar los valores dentro del arbol binario
        abv = lib.poblarABVConArreglo(valores);

        System.out.println("Recorrido InOrden");
        abv.recorrido(abv.getRaiz(), "in");
        System.out.println("\nRecorrido PreOrden");
        abv.recorrido(abv.getRaiz(), "pre");
        System.out.println("\nRecorrido PostOrden");
        abv.recorrido(abv.getRaiz(), "post");

        System.out.println();
        int buscarNivel = 50;
        System.out.println("Nivel de [" + buscarNivel + "]: " + abv.obtenerNivel(buscarNivel));
        buscarNivel = 30;
        System.out.println("Nivel de [" + buscarNivel + "]: " + abv.obtenerNivel(buscarNivel));
        buscarNivel = 20;
        System.out.println("Nivel de [" + buscarNivel + "]: " + abv.obtenerNivel(buscarNivel));
        buscarNivel = 40;
        System.out.println("Nivel de [" + buscarNivel + "]: " + abv.obtenerNivel(buscarNivel));

        System.out.println("Altura del árbol: " + abv.obtenerAltura(abv.getRaiz()));
        System.out.println("Hojas del árbol: " + abv.contarHojas());
    }
}
