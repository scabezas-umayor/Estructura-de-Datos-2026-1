package Arboles;

public class Ejercicio1AppVariante2 {

    public static void main(String[] args) {
        // instancia del objeto Arbol Binario
        ArbolBinarioVariante bt = new ArbolBinarioVariante();
        // instancia del objeto Biblioteca
        Biblioteca biblioteca = new Biblioteca();
        // datos iniciales
        int[] valores = new int[15];
        // poblar arreglo de valores
        for (int i = 0; i < valores.length; i++) {
            valores[i] = biblioteca.getAleatorioEntre(100, 999);
        }
        biblioteca.mostrarArreglo(valores, "Numeros Random Iniciales");
        bt = biblioteca.poblarABVConArreglo(valores);
        System.out.println("Recorrido en InOrden");
        bt.recorrido(bt.getRaiz(), "in");
        System.out.println();
        System.out.println("Recorrido en PreOrden");
        bt.recorrido(bt.getRaiz(), "pre");
        System.out.println();
        System.out.println("Recorrido en PostOrden");
        bt.recorrido(bt.getRaiz(), "post");
        System.out.println();
    }

}
