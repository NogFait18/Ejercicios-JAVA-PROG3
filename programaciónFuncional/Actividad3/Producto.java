package programaciónFuncional.Actividad3;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString


public class Producto {
    private String nombre;
    private String categoria;
    private double precio;
    private int  stock;
}
