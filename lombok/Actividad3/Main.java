package lombok.Actividad3;

import java.util.ArrayList;

public class Main {
    public static void main(String[]args){
        Producto p1 = new Producto(1,"Java Básico",1500,"Juan Perez");
        Producto p2 = new Producto(2,"Spring Boot Avanzado",2500,"Ana Gomez");

        ArrayList<ProductoDTO>listaDTO = new ArrayList<>();

        ProductoDTO dto1 = new ProductoDTO();
        dto1.setCodigo(1);
        dto1.setNombre("Java Básico");
        dto1.setPrecio(1500);

        ProductoDTO dto2 = new ProductoDTO();
        dto2.setCodigo((2));
        dto2.setNombre("Spring Boot Avanzado");
        dto2.setPrecio(2500);

        listaDTO.add(dto1);
        listaDTO.add(dto2);

        System.out.println("=== Productos ===");
        System.out.println(p1);
        System.out.println(p2);

        System.out.println("\n=== ProductosDTO ===");
        for (ProductoDTO dto : listaDTO) {
            System.out.println(dto);
        }
    }
}
