package colecciones.Actividad3;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[]args){
        Set <Producto> set = new HashSet<>();

        Producto p1 = new Producto(1,"Manzana");
        Producto p2 = new Producto(2,"Banana");
        Producto p3 = new Producto(3,"Naranja");
        Producto p4 = new Producto(4,"Manzana");

        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);

        for (Producto producto:set){
            System.out.println(producto);
        }


    }
}
