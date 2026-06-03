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

    
}
