package lombok.Actividad3;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Producto {
    private int codigo;
    private String nombre;
    private int precio;
    private String autor;

}
