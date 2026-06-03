package TablasHashing;

public class App1 {
    public static void main(String[] args) {
        // implementacion manual
        // 1. crear la tabla hash
        int tamTabla = 10;
        TablaHashManual miTabla = new TablaHashManual(tamTabla);

        // 2. insertar valores
        System.out.println("--- Insertar Valores ---");
        miTabla.insertar(15, "Notebook Asus");
        miTabla.insertar(25, "Teclado Mecánico");
        miTabla.insertar(35, "Monitor Gamer");
        System.out.println("--- Fin Insertar Valores ---");

        // 2.1 insertar otros valores
        miTabla.insertar(12, "Mouse");
        miTabla.insertar(92, "Audífonos Bluetooth");
        miTabla.insertar(47, "Memoria RAM 32 GB");

        // 3. Mostrar la tabla
        miTabla.mostrar();

        // 4. Buscar
        buscarClave(35, miTabla);
        buscarClave(25, miTabla);
        buscarClave(22, miTabla);
    }

    public static void buscarClave(int _clave, TablaHashManual _miTabla) {
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
