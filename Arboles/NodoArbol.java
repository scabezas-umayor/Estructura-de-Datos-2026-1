package Arboles;

public class NodoArbol {
    
    int dato;
    NodoArbol izquierdo;
    NodoArbol derecho;

    public NodoArbol(int _dato){
        this.dato = _dato;
        this.izquierdo = null;
        this.derecho = null;
    }

}
