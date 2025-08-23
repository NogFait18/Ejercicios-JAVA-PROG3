package toStringEqualsHashCode.Actividad5;

import toStringEqualsHashCode.Actividad4.Producto;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Producto, Integer> inventario = new HashMap<>();

        Producto p1 = new Producto(1, "Hamburguesa", 500);
        Producto p2 = new Producto(2, "Pizza", 800);
        Producto p3 = new Producto(1, "Hamburguesa", 500); // Mismo que p1

        inventario.put(p1, 10); // 10 unidades
        inventario.put(p2, 5);  // 5 unidades
        inventario.put(p3, 20); // Reemplaza a p1 porque son iguales

        // Mostrar inventario
        inventario.forEach((producto, cantidad) ->
                System.out.println(producto + " -> " + cantidad + " unidades")
        );
    }
}
