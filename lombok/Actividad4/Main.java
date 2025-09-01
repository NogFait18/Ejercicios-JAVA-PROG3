package lombok.Actividad4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. Instanciar varios Producto (POJOs)
        Producto p1 = new Producto("P001", "Monitor", "LG", 150000);
        Producto p2 = new Producto("P002", "Notebook", "HP", 350000);

        // 2. Instanciar varios ProductoRecord directamente
        ProductoRecord r1 = new ProductoRecord("R001", "Teclado", 25000);
        ProductoRecord r2 = new ProductoRecord("R002", "Mouse", 15000);

        // 3. Instanciar ProductoRecord a partir de los objetos Producto
        ProductoRecord r3 = new ProductoRecord(p1.getCodigo(), p1.getNombre(), p1.getPrecio());
        ProductoRecord r4 = new ProductoRecord(p2.getCodigo(), p2.getNombre(), p2.getPrecio());

        // 4. Guardarlos en una lista
        List<ProductoRecord> listaRecords = new ArrayList<>();
        listaRecords.add(r1);
        listaRecords.add(r2);
        listaRecords.add(r3);
        listaRecords.add(r4);

        // 5. Mostrar los productos en consola
        System.out.println("=== Lista de ProductoRecord ===");
        for (ProductoRecord rec : listaRecords) {
            System.out.println(rec);
        }

        System.out.println("\n=== Producto POJO ===");
        System.out.println(p1);
        System.out.println(p2);
    }
}