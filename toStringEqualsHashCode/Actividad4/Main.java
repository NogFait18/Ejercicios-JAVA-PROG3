package toStringEqualsHashCode.Actividad4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args){
        List<Producto> listaProductos = new ArrayList<>();

        Producto p1 = new Producto(1, "Mouse", 1500);
        Producto p2 = new Producto(2, "Teclado", 3000);
        Producto p3 = new Producto(1, "Mouse", 1500); // mismo código que p1

        // Agregamos evitando duplicados
        agregarProducto(listaProductos, p1);
        agregarProducto(listaProductos, p2);
        agregarProducto(listaProductos, p3); // NO debería agregarse por tener mismo código

        // Imprimimos lista final
        System.out.println(listaProductos);
    }

    public static void agregarProducto(List<Producto> lista, Producto nuevo) {
        if (!lista.contains(nuevo)) { // contains usa equals()
            lista.add(nuevo);
            System.out.println("Agregado: " + nuevo.getNombre());
        } else {
            System.out.println("Duplicado no agregado: " + nuevo.getNombre());
        }
    }
}

