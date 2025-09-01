package reflexionYGenericos.Actividad3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[]args){
        Caja<String> cajaDeTexto = new Caja<>("Hola, que tal");
        Caja<Integer> cajaDeNumeros = new Caja<>(123);

        System.out.println(cajaDeTexto);
        System.out.println(cajaDeNumeros);

        // 2. Comparación con colecciones sin genéricos
        List listaSinGenericos = new ArrayList();
        listaSinGenericos.add("Un texto");
        listaSinGenericos.add(456);

        // El compilador no se queja, pero hay riesgos:
        String textoLista = (String) listaSinGenericos.get(0); // Ok
        // String error = (String) listaSinGenericos.get(1); // ❌ ClassCastException en runtime

        System.out.println("Lista sin genéricos: " + listaSinGenericos);

        // 3. Colecciones con genéricos
        List<String> listaConGenericos = new ArrayList<>();
        listaConGenericos.add("Java");
        // listaConGenericos.add(100); // ❌ Error de compilación
        System.out.println("Lista con genéricos: " + listaConGenericos);
    }
}
