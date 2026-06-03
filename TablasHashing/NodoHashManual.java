package TablasHashing;

public class NodoHashManual {

    int clave;
    String valor;
    NodoHashManual siguiente;

    public NodoHashManual(int _clave, String _valor) {
        this.clave = _clave;
        this.valor = _valor;
        this.siguiente = null;
    }

}
