package Odenamiento;

import java.util.Arrays;

public class App2Estudiante {

    public static void main(String[] args) {

        Biblioteca lib = new Biblioteca();

        Estudiante estudianteTilin = new Estudiante(2, "Tilin");

        Estudiante[] listaEstudiantes = {
                new Estudiante(3, "Seba"),
                new Estudiante(1, "Lucas"),
                estudianteTilin
        };

        lib.printEstudiante(listaEstudiantes, "Lista - Original");
        // OUTPUT: {id: 3 - name: Seba}, {id: 1 - name: Lucas}, {id: 2 - name: Tilin}

        // Ordenamos la lista de estudiantes por ID
        Arrays.sort(listaEstudiantes);
        lib.printEstudiante(listaEstudiantes, "Lista - Ordenada por ID");
        // OUTPUT: {id: 1 - name: Lucas}, {id: 2 - name: Tilin}, {id: 3 - name: Seba}
        
        // Ordenamos la lista de estudiantes por Nombre
        Arrays.sort(listaEstudiantes, new EstudianteCompararPorNombre());
        lib.printEstudiante(listaEstudiantes, "Lista - Ordenada por Nombre");
        // OUTPUT: {id: 1 - name: Lucas}, {id: 3 - name: Seba}, {id: 2 - name: Tilin}

    }

}
