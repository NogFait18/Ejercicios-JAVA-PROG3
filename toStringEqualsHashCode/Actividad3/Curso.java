package toStringEqualsHashCode.Actividad3;

import java.util.List;

public class Curso {
    private String nombre;
    private List<Estudiante> listaDeEstudiantes;
    private int cantAlumnos;
    private String profesor;

    public Curso(String nombre,int cantAlumnos,String profesor, List<Estudiante> listaDeEstudiantes) {
        this.nombre = nombre;
        this.listaDeEstudiantes = listaDeEstudiantes;
        this.cantAlumnos = cantAlumnos;
        this.profesor = profesor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Estudiante> getListaDeEstudiantes() {
        return listaDeEstudiantes;
    }

    public void setListaDeEstudiantes(List<Estudiante> listaDeEstudiantes) {
        this.listaDeEstudiantes = listaDeEstudiantes;
    }

    public int getCantAlumnos() {
        return cantAlumnos;
    }

    public void setCantAlumnos(int cantAlumnos) {
        this.cantAlumnos = cantAlumnos;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "\nnombre='" + nombre + '\'' +
                "\n\nProfesor: "+profesor+
                "\n\nCantidad de alumnos: "+cantAlumnos+
                "\n\nlistaDeEstudiantes:\n" + listaDeEstudiantes +
                " }";
    }
}
