package Odenamiento;

// TDA: Tipo de Dato Abstracto
public class Estudiante implements Comparable<Estudiante> {

    // atributos de la clase
    int id;
    String nombre;

    public Estudiante(int _id, String _nombre) {
        this.id = _id;
        this.nombre = _nombre;
    }

    @Override
    public int compareTo(Estudiante _otro) {
        // Ordenar por ID (ascendente)
        return this.id - _otro.id;
    }

}
