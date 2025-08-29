package colecciones.Actividad4;

import colecciones.Actividad4.Curso;

import java.util.HashMap;
import java.util.Map;


public class Main {
    public static void main(String[]args){
        HashMap<String,Curso> map = new HashMap<>();
        Curso a1 = new Curso("Comision 2","Miguel");
        Curso a2 = new Curso("Comision 3","Pedro");
        Curso a3 = new Curso("Comision 2","Miguel");
        map.put("Prog 1", a1);
        map.put("Prog 2", a2);
        map.put("Prog 1", a3);

        for(Map.Entry<String,Curso>entry : map.entrySet()){
            System.out.println("Key: "+entry.getKey() + ", Value: "+ entry.getValue());
        }

    }
}
