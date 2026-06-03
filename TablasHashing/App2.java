package TablasHashing;

import java.util.Scanner;

public class App2 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        // 1. crear la tabla hash
        int tamTabla = 10;
        TablaHash miTabla = new TablaHash(tamTabla);

        // 2. insertar valores
        int cantidad = 2;
        System.out.println("--- insertar " + cantidad + " valores ---");
        for (int i = 1; i <= cantidad; i++) {
            System.out.println("Ingrese Producto [" + i + "/" + cantidad + "]");
            System.out.print("Clave: ");
            int clave = Integer.parseInt(leer.nextLine());
            System.out.print("Valor: ");
            String valor = leer.nextLine();
            miTabla.insertar(clave, valor);
        }

        // 3. Mostrar
        miTabla.mostrar();

        // 4. Buscar
        System.out.println("--- Busqueda ---");
        int opcion = 0;
        do {
            System.out.print("Ingrese Clave a buscar: ");
            int claveBuscada = Integer.parseInt(leer.nextLine());
            buscarClave(claveBuscada, miTabla);
            System.out.println("Ingrese 0 para salir / Otra tecla para buscar otro...");
            opcion = Integer.parseInt(leer.nextLine());
        } while (opcion != 0);
        System.out.println();

    }

    public static void buscarClave(int _clave, TablaHash _miTabla) {
        System.out.println("--- Buscar ---");

        System.out.println("Buscar el producto con la clave [" + _clave + "]");
        String encontrado = _miTabla.buscar(_clave);
        if (encontrado != null) {
            System.out.println("Wena! El elemento con clave [" + _clave + "] es: " + encontrado);
        } else {
            System.out.println("Error :( La clave [" + _clave + "] no existe.");
        }
        System.out.println("--- Fin Buscar ---");
    }
}
