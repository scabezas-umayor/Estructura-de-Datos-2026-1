package Odenamiento;

// TDA: Tipo de Dato Abstracto
public class Estudiante implements Comparable<Estudiante> {

    // atributos de la clase
    int id;
    String nombre;

    @Override
    public int compareTo(Estudiante _otro) {
        // Ordenar por ID (ascendente)
        return this.id - _otro.id;
    }

}
