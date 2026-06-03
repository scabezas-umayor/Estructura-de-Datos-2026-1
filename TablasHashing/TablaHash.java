package TablasHashing;

import java.util.LinkedList;

public class TablaHash {

    private int tam;
    private LinkedList<NodoHash>[] tabla;

    public TablaHash(int _tam) {
        this.tam = _tam;
        this.tabla = new LinkedList[this.tam];
        for (int i = 0; i < this.tam; i++) {
            tabla[i] = new LinkedList<>();
        }
    }

    public int funcionHash(int _clave) {
        return Math.abs(_clave) % this.tam;
    }

    public void insertar(int _clave, String _valor) {
        int indice = funcionHash(_clave);
        this.tabla[indice].add(new NodoHash(_clave, _valor));
    }

    public void mostrar() {
        System.out.println("--- Mostrar Tabla (Inspeccionar Linked List) ---");
        for (int i = 0; i < this.tam; i++) {
            System.out.print("Indice [" + i + "]: ");
            if (this.tabla[i].isEmpty()) {
                System.out.println("null (Casilla Vacía)");
            } else {
                for (NodoHash aux : tabla[i]){
                    System.out.print("-> [Clave: " + aux.clave + " | Valor: (" + aux.valor + ")]");
                }
                System.out.println("-> null");
            }
        }
        System.out.println("--- --- fin mostrar --- ---\n");
    }

}
