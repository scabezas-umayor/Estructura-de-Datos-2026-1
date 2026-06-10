package Grafos;

public class GrafoMatriz {

    private int numVertices;
    private int[][] matrizAdyacencia;

    public GrafoMatriz(int _numVertices) {
        this.numVertices = _numVertices;
        this.matrizAdyacencia = new int[this.numVertices][this.numVertices];
    }

    // Agregar una arista (Grafo no dirigido: genera una relación simétrica)
    public void agregarArista(int _origen, int _destino) {
        this.matrizAdyacencia[_origen][_destino] = 1;
        this.matrizAdyacencia[_destino][_origen] = 1;
    }

    // RECORRIDO EN PROFUNDIDAD (DFS)
    public void recorrerProfundidad(int _nodoInicio) {
        boolean[] listaVisitados = new boolean[this.numVertices];
        System.out.println("Recorriendo en Profundidad (DFS)");
        profundidadRecursivo(_nodoInicio, listaVisitados);
        System.out.println();
    }

    private void profundidadRecursivo(int _nodo, boolean[] _listaVisitados) {
        _listaVisitados[_nodo] = true;
        System.out.print(_nodo + " ");
        // Ahora, buscamos los vecinos (los adyacentes)
        for (int i = 0; i < this.numVertices; i++) {
            if (this.matrizAdyacencia[_nodo][i] == 1 && !_listaVisitados[i]) {
                profundidadRecursivo(i, _listaVisitados); // llamada recursiva (PILA)
            }
        }
    }

    public void mostrarMatriz() {
        System.out.println("--- Matriz de Adyacencia ---");
        for (int fila = 0; fila < this.numVertices; fila++) {
            for (int columna = 0; columna < this.numVertices; columna++) {
                System.out.print(this.matrizAdyacencia[fila][columna] + " ");
            }
            System.out.println();
        }
        System.out.println("--- Fin Matriz de Adyacencia ---");
    }

}