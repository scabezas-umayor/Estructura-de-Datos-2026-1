package Grafos;

public class App1 {
    public static void main(String[] args) {
        int numVertices = 5;
        // 1. Con Matriz
        GrafoMatriz gMatriz = new GrafoMatriz(numVertices);
        gMatriz.agregarArista(0, 1);
        gMatriz.agregarArista(0, 4);
        gMatriz.agregarArista(1, 2);
        gMatriz.agregarArista(1, 3);
        gMatriz.agregarArista(2, 3);
        gMatriz.agregarArista(3, 4);

        gMatriz.mostrarMatriz();
        gMatriz.recorrerProfundidad(2);

        // 2. Con Lista
        GrafoLista gLista = new GrafoLista(numVertices);
        gLista.agregarArista(0, 1);
        gLista.agregarArista(0, 4);
        gLista.agregarArista(1, 2);
        gLista.agregarArista(1, 3);
        gLista.agregarArista(2, 3);
        gLista.agregarArista(3, 4);

        gLista.mostrarLista();
        gLista.recorrerAnchura(2);
    }
}
