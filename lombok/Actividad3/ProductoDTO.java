package lombok.Actividad3;

public class ProductoDTO {
    private int codigo;
    private String nombre;
    private int precio;

    public ProductoDTO(int codigo, int precio, String nombre) {
        this.codigo = codigo;
        this.precio = precio;
        this.nombre = nombre;
    }

    public ProductoDTO() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int isPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "ProductoDTO{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
