package Odenamiento;

import java.util.Arrays;

public class App1Estudiante {

    public static void main(String[] args) {

        Biblioteca lib = new Biblioteca();

        Estudiante estudianteTilin = new Estudiante(2, "Tilin");

        Estudiante[] listaEstudiantes = {
                new Estudiante(3, "Seba"),
                new Estudiante(1, "Lucas"),
                estudianteTilin
        };

        Arrays.toString(listaEstudiantes);

        lib.printEstudiante(listaEstudiantes, "Lista 1");

    }
}
