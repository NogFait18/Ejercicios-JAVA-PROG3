package programaciónFuncional.Actividad2;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main (String[]args){
        List<Alumno> misEstudiantes = new ArrayList<>();

        Alumno e1 = new Alumno("Pepito",10,"Comision 4");
        Alumno e2 = new Alumno("Marta",8,"Comision 4");
        Alumno e3 = new Alumno("Lila",7,"Comision 3");
        Alumno e4 = new Alumno("Homero",4,"Comision 3");

        misEstudiantes.add(e1);
        misEstudiantes.add(e2);
        misEstudiantes.add(e3);
        misEstudiantes.add(e4);

        misEstudiantes.stream()
                .filter(a -> a.getNota()>=7)
                .forEach(System.out::println);

        double promedio = misEstudiantes.stream()
                .mapToDouble(n -> n.getNota())
                .average()
                .orElse(0);

        System.out.println("Promedio: " + promedio);

        Map<String, List<Alumno>> alumnosPorCurso = misEstudiantes.stream()
                .collect(Collectors.groupingBy(Alumno::getCurso));

        alumnosPorCurso.forEach((curso, listaAlumnos) -> System.out.println(curso + ": "+ listaAlumnos));


        List<Alumno> top3 = misEstudiantes.stream()
                .sorted(Comparator.comparingDouble(Alumno::getNota).reversed())
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(top3);
    }

}
