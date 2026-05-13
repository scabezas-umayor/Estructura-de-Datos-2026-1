package Arboles;

public class Ejercicio1AppVariante1 {
    public static void main(String[] args) {
        // se crea la instancia del objeto arbol binario: ab
        ArbolBinario ab = new ArbolBinario();
        // se crea la instancia del objeto biblioteca: lib
        Biblioteca lib = new Biblioteca();

        // insertar los siguientes valores:
        int[] valores = { 50, 30, 70, 20, 40, 60, 80 };

        // Mostrar el arbol con los datos
        lib.mostrarArreglo(valores, "Valores Iniciales");

        // Insertar los valores dentro del arbol binario
        ab = lib.poblarABConArreglo(valores);

        System.out.println("Recorrido InOrden");
        ab.recorridoInOrden(ab.getRaiz());
        System.out.println("\nRecorrido PreOrden");
        ab.recorridoPreOrden(ab.getRaiz());
        System.out.println("\nRecorrido PostOrden");
        ab.recorridoPostOrden(ab.getRaiz());

    }
}