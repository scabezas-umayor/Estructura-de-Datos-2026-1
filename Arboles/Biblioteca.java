package Arboles;

public class Biblioteca {

    public void mostrarArreglo(int[] _arreglo, String _titulo) {
        System.out.println("=== Arreglo: " + _titulo + " ===");
        for (int v : _arreglo) {
            System.out.print(v + " ");
        }
        System.out.println("\n==================================");
    }

    public ArbolBinario poblarABConArreglo(int[] _arreglo) {
        ArbolBinario ab = new ArbolBinario();
        for (int v : _arreglo) {
            ab.insertar(v);
        }
        return ab;
    }
    
    public ArbolBinarioVariante poblarABVConArreglo(int[] _arreglo) {
        ArbolBinarioVariante ab = new ArbolBinarioVariante();
        for (int v : _arreglo) {
            ab.insertar(v);
        }
        return ab;
    }

    public int getAleatorioEntre(int _x, int _y){
        // (casteo)
        return (int) (Math.random() * (_y - _x + 1) + _x);
    }

}
