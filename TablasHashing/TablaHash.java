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

    

}
