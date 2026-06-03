package TablasHashing;

public class TablaHashManual {

    private int tam;
    private NodoHashManual[] tabla;

    public TablaHashManual(int _tam) {
        this.tam = _tam;
        this.tabla = new NodoHashManual[this.tam];
    }

    public int funcionHash(int _clave) {
        return Math.abs(_clave) % this.tam;
    }

    public void insertar(int _clave, String _valor) {
        int indice = funcionHash(_clave);
        NodoHashManual nuevo = new NodoHashManual(_clave, _valor);

        // Si la casilla está vacía, entonces el nuevo nodo es el primero
        if (this.tabla[indice] == null) {
            this.tabla[indice] = nuevo;
        } else {
            // Si hay colisión, pq si hay, entonces recorremos manualmente la lista hasta el
            // final
            NodoHashManual aux = this.tabla[indice];
            while (aux.siguiente != null) {
                aux = aux.siguiente;
            }
            aux.siguiente = nuevo;
        }
    }
}
