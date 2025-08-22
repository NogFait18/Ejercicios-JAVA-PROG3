package toStringEqualsHashCode.Actividad2;
public class Estudiante extends Persona{
    private String carrera;

    public Estudiante(String nombre, int edad, String carrera) {
        super(nombre, edad); // Llamada al constructor de Persona
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}
