package toStringEqualsHashCode.Actividad5;


import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Producto> productos = new HashSet<>();

        productos.add(new Producto(1, "Hamburguesa", 500));
        productos.add(new Producto(2, "Pizza", 800));
        productos.add(new Producto(1, "Hamburguesa Doble", 600)); // Duplicado según código

        System.out.println("Productos en HashSet:");
        productos.forEach(System.out::println);
    }
}


