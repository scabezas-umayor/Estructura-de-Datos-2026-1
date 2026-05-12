package Arboles;

public class Ejercicio1App {

    public static void main(String[] args) {
        // insertar los siguientes valores:
        // 50, 30, 70, 20, 40, 60 y 80
        ArbolBinario ab = new ArbolBinario();
        ab.insertar(50);
        ab.insertar(30);
        ab.insertar(70);
        ab.insertar(20);
        ab.insertar(40);
        ab.insertar(60);
        ab.insertar(80);
        System.out.println("Recorrido InOrden");
        ab.recorridoInOrden(ab.getRaiz());
        System.out.println("\nRecorrido PreOrden");
        ab.recorridoPreOrden(ab.getRaiz());
        System.out.println("\nRecorrido PostOrden");
        ab.recorridoPostOrden(ab.getRaiz());
        // miercoles: hacer el recorrido desde un arreglo con los valores iniciales
    }

}
