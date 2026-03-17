public class ArregloConRandom {
    public static int getAleatorioEntre(int _x, int _y){
        // (casteo)
        return (int) (Math.random() * (_y - _x + 1) + _x);
    }
    public static void printArreglo(int [] _arr, String _titulo){
        System.out.println("Arreglo: " + _titulo);
        for (int i = 0; i < _arr.length; i++) {
            System.out.print(_arr[i] + " ");
        }
        System.out.println();
    }

    public static int getMayor(int [] _arr){
        int mayor = _arr[0];
        for (int i = 1; i < _arr.length; i++) {
            if (_arr[i] > mayor) {
                mayor = _arr[i];
            }
        }
        return mayor;
    }
    public static void main(String[] args) {
        int arreglo1 [] = {7, 5, 15, 8, 64};
        System.out.println("Tamaño: " + arreglo1.length);
        int arreglo2 [] = new int[10];
        // fori + tab => for (int i = 0; i < arreglo2.length; i++) {}
        for (int i = 0; i < arreglo2.length; i++) {
            arreglo2[i] = getAleatorioEntre(1, 90);
        }
        printArreglo(arreglo2, "Aleatorios entre 1 y 90");
        System.out.println("El Mashor del 1 es: " + getMayor(arreglo1));
        System.out.println("El Mashor del 2 es: " + getMayor(arreglo2));
    }
}
