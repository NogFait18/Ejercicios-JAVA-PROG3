package toStringEqualsHashCode.Actividad5;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
public class Producto {
    private int codigo;
    private String nombre;
    private int precio;

    public Producto(int codigo, String nombre, int precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public int getPrecio() { return precio; }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Producto producto)) return false;
        return codigo == producto.codigo && precio == producto.precio && Objects.equals(nombre, producto.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, nombre, precio);
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", nombre='" + nombre + '\'' + ", precio=" + precio + '}';
    }
}

