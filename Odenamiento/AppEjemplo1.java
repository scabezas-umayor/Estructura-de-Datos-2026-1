package Odenamiento;

import java.util.Arrays;

public class AppEjemplo1 {
    // psvm
    public static void main(String[] args) {
        Biblioteca lib = new Biblioteca();
        // arreglo de 5 numeros enteros
        int [] numeros = {50, 10, 35, 80, 5};
        // System.out.println("Arreglo: " + Arrays.toString(numeros));
        lib.printArregloEntero(numeros, "Original");

        // Paso 1: Ordenar el arreglo
        Arrays.sort(numeros);
        lib.printArregloEntero(numeros, "Ordenado");
    }
}
