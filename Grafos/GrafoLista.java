package Grafos;

import java.util.LinkedList;
import java.util.Queue;

public class GrafoLista {

    private int numVertices;
    private LinkedList<Integer>[] listaAdyacencia;

    public GrafoLista(int _numVertices) {
        this.numVertices = _numVertices;
        this.listaAdyacencia = new LinkedList[this.numVertices];
        for (int i = 0; i < this.numVertices; i++) {
            this.listaAdyacencia[i] = new LinkedList<>();
        }
    }

    // Agregar una arista (Grafo no dirigido: genera una relación simétrica)
    public void agregarArista(int _origen, int _destino) {
        this.listaAdyacencia[_origen].add(_destino);
        this.listaAdyacencia[_destino].add(_origen);
    }

    public void recorrerAnchura(int _nodoInicio) {
        boolean[] listaVisitados = new boolean[this.numVertices];
        Queue<Integer> cola = new LinkedList<>();

        listaVisitados[_nodoInicio] = true;
        cola.add(_nodoInicio);

        System.out.println("Recorrido en Anchura (BFS)");

        while (!cola.isEmpty()) { // mientras esta cola no sea vacia
            int nodoActual = cola.poll(); // sacar de la cola (desencolar)
            System.out.print(nodoActual + " ");

            // Visitar a los vecinos del nodo
            for (int vecino : this.listaAdyacencia[nodoActual]) {
                if (!listaVisitados[vecino]) {
                    listaVisitados[vecino] = true;
                    cola.add(vecino);
                }
            }
        }
        System.out.println();
    }

    public void mostrarLista() {
        System.out.println("--- Lista de Adyacencia ---");
        for (int i = 0; i < this.numVertices; i++) {
            System.out.print("Vertice[" + i + "]: ");
            for (int vecino : this.listaAdyacencia[i]) {
                System.out.print("-> " + vecino + " ");
            }
            System.out.println();
        }
    }

}
