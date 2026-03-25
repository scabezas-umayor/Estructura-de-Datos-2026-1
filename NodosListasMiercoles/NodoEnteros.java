package NodosListasMiercoles;

public class NodoEnteros {
    
    int dato;
    NodoEnteros siguiente;

    public NodoEnteros(int _dato){
        this.dato = _dato;
        this.siguiente = null;
    }

    @Override
    public String toString(){
        return "[" + this.dato + "] --> " + this.siguiente;
    }

}


