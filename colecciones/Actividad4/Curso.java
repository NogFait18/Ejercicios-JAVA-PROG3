package colecciones.Actividad4;

import java.util.Objects;

public class Curso {
    public String nombre;
    public String docente;

    public Curso(String nombre, String docente) {
        this.nombre = nombre;
        this.docente = docente;
    }

    public Curso() {
    }

    @Override
    public String toString() {
        return
                "nombre='" + nombre + '\'' +
                ", docente='" + docente + '\'' +
                '}';
    }


}
