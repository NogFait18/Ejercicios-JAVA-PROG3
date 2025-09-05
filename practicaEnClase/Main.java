package practicaEnClase;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[]args){
        List<Estudiantes> misEstudiantes = new ArrayList<>();

        Estudiantes e1 = new Estudiantes("Pepito",19,10);
        Estudiantes e2 = new Estudiantes("Marta",25,9);
        Estudiantes e3 = new Estudiantes("Lila",30,7);
        Estudiantes e4 = new Estudiantes("Homero",22,4);

        misEstudiantes.add(e1);
        misEstudiantes.add(e2);
        misEstudiantes.add(e3);
        misEstudiantes.add(e4);

        misEstudiantes.stream()
                .filter(e -> e.getNota() >= 6)
                .sorted(Comparator.comparingDouble(Estudiantes::getNota).reversed())
                .toList()
                .forEach(System.out::println);
        double promedio = misEstudiantes.stream()
                .collect(Collectors.averagingDouble(Estudiantes::getNota));
        System.out.println("El promedio de todas las notas es: "+promedio);

        Optional<Estudiantes> mejorEstudiante = misEstudiantes.stream()
                .max(Comparator.comparingDouble(Estudiantes::getNota));
        System.out.println("Mejor estudiante: "+mejorEstudiante);

        Map<Integer, List<Estudiantes>> agrupadosPorEdad = misEstudiantes.stream()
                .collect(Collectors.groupingBy(Estudiantes::getEdad));
        System.out.println(agrupadosPorEdad);
        List<String> nombresMayusculas = misEstudiantes.stream()
                .map(e -> e.getNombre().toUpperCase())
                .toList(); // Si usás Java <16, usar .collect(Collectors.toList())
        System.out.println(nombresMayusculas);
    }
}
