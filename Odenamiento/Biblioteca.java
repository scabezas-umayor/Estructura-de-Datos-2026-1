package Odenamiento;

public class Biblioteca {
    
    public void printArregloEntero(int [] _arr, String _titulo){
        System.out.println("=== " + _titulo + " ===");
        for (int i = 0; i < _arr.length; i++) {
            System.out.print(_arr[i] + " ");
        }
        System.out.println();
    }

}
