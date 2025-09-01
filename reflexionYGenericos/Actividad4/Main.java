package reflexionYGenericos.Actividad4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[]args){
        List<Integer> listaEnteros = Arrays.asList(1,2,3,4,5);

        List<String> listaCadenas = Arrays.asList("Java","Genéricos","UTN");

        System.out.println("Lista de enteros: ");
        Metodo.imprimirLista(listaEnteros);

        System.out.println("Lista de Strings: ");
        Metodo.imprimirLista(listaCadenas);
    }
}
