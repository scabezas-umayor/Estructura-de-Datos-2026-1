package Odenamiento;

import java.util.Comparator;

public class EstudianteCompararPorNombre implements Comparator<Estudiante> {
    @Override
    public int compare(Estudiante _e1, Estudiante _e2) {
        return _e1.nombre.compareTo(_e2.nombre);
    }
}
