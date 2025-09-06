package programaciónFuncional.Actividad3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[]args){
        List<Producto> listaProductos = new ArrayList<>();
        Producto p1 = new Producto("Manzana","A",80.0, 20);
        Producto p2 = new Producto("Pera","B",200.0, 5);
        Producto p3 = new Producto("Banana","A",50.0, 15);
        Producto p4 = new Producto("Frutilla","B",300.0, 12);
        Producto p5 = new Producto("Naranja","E",350.0, 8);

        listaProductos.add(p1);
        listaProductos.add(p2);
        listaProductos.add(p3);
        listaProductos.add(p4);
        listaProductos.add(p5);

        listaProductos.stream()
                .filter(p->p.getPrecio()>100)
                .forEach(System.out::println);
        Map <String, Integer> stockPorCategoria = listaProductos.stream()
                .collect(Collectors.groupingBy(
                        Producto::getCategoria,
                        Collectors.summingInt(Producto::getStock)
                ));
        Map<String, List<Producto>> productosPorCategoria = listaProductos.stream()
                .collect(Collectors.groupingBy(Producto::getCategoria));
        productosPorCategoria.forEach((c, p)-> System.out.println("Categoria: "+c + " Productos: "+ p+ "\n"));
        stockPorCategoria.forEach((c,stockTotal)-> System.out.println(c + ": "+stockTotal));

        String resultado = listaProductos.stream()
                .map(p -> p.getNombre() + " $" + p.getPrecio())
                .collect(Collectors.joining("; "));

        System.out.println(resultado);


        double promedioGeneral = listaProductos.stream()
                .collect(Collectors.averagingDouble(Producto::getPrecio));

        System.out.println("Promedio general: " + promedioGeneral);


        Map<String, Double> promedioPorCategoria = listaProductos.stream()
                .collect(Collectors.groupingBy(
                        Producto::getCategoria,
                        Collectors.averagingDouble(Producto::getPrecio)
                ));

        promedioPorCategoria.forEach((categoria, promedio) ->
                System.out.println(categoria + ": " + promedio));

    }
}
