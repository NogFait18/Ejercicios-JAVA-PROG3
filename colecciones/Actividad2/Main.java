package colecciones.Actividad2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String[]args){
        List<Alumno> list = new ArrayList<>();

        Alumno a1 = new Alumno("Lautaro",10);
        Alumno a2 = new Alumno("Luis",7);
        Alumno a3 = new Alumno("Miguel",9);

        list.add(a1);
        list.add(a2);
        list.add(a3);

        list.forEach(alumno -> System.out.println("Alumno: "+ alumno));

    }
}
