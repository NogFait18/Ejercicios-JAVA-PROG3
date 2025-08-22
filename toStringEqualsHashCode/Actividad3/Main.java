package toStringEqualsHashCode.Actividad3;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[]args){
        List<toStringEqualsHashCode.Actividad3.Estudiante> listaEstudiante = new ArrayList<>();

        listaEstudiante.add(new Estudiante("Juan", 20,"Programador"));
        listaEstudiante.add(new Estudiante("María", 22,"Programador"));
        listaEstudiante.add(new Estudiante("Pedro", 21, "Programador"));

        Curso c4 = new Curso("Comision 4",40,"Prof, Carlos Ruiz",listaEstudiante);
        System.out.println(c4);
    }
}
