package Arboles;

public class Ejercicio1AppVariante2 {
    
    public static void main(String[] args) {
        // instancia del objeto Arbol Binario
        ArbolBinario bt = new ArbolBinario();
        // instancia del objeto Biblioteca
        Biblioteca biblioteca = new Biblioteca();
        // datos iniciales
        int [] valores = new int[15];
        // poblar arreglo de valores
        for (int i = 0; i < valores.length; i++) {
            valores[i] = biblioteca.getAleatorioEntre(100, 999);
        }
        biblioteca.mostrarArreglo(valores, "Numeros Random Iniciales");
        bt = biblioteca.poblarABConArreglo(valores);
    }

}
