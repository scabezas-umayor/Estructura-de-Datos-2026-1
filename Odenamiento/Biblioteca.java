package Odenamiento;

import java.util.Arrays;

public class Biblioteca {
    
    public void printArregloEntero(int [] _arr, String _titulo){
        System.out.println("=== " + _titulo + " ===");
        // Con Bibliotecas
        System.out.println(Arrays.toString(_arr));
        // Sin Bibliotecas
        /*
        System.out.print("[");
        for (int i = 0; i < _arr.length; i++) {
            System.out.print(_arr[i]);
            // System.out.print(_arr[i] + ", ");
            if (i != _arr.length -1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
        */
    }

}
