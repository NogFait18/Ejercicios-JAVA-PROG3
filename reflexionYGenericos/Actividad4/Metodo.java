package reflexionYGenericos.Actividad4;

import java.util.List;

public class Metodo {
    public static <T> void imprimirLista (List<T> lista){
        for (T elemento : lista){
            System.out.println(elemento);
        }
    }
}
