package colecciones.Actividad2;

public class Alumno {
    public String nombre;
    public int nota;

    public Alumno(String nombre,int nota ) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public Alumno() {
    }

    @Override
    public String toString() {
        return
                "nombre='" + nombre + '\'' +
                ", nota='" + nota + '\'' +
                '}';
    }
}
