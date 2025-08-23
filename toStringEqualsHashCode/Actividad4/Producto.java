package toStringEqualsHashCode.Actividad4;

import java.util.Objects;

public class Producto {
    private int codigo;
    private int precio;
    private String nombre;

    public Producto(int codigo,String nombre, int precio ) {
        this.codigo = codigo;
        this.precio = precio;
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Producto producto)) return false;
        return codigo == producto.codigo && precio == producto.precio && Objects.equals(nombre, producto.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, precio, nombre);
    }

    @Override
    public String toString() {
        return "Producto{" +
                "codigo=" + codigo +
                ", precio=" + precio +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
