package cirod.northwind.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;

@Entity
@Table(name="producto")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productoId;

    @Column(name="nombre")
    private String nombre;

    @Column(name="precio")
    private double precio;

    @Column(name="existencia")
    private int existencia;

    @JsonBackReference //Es una referencia hacia atras, o sea que es referenciado y no se incluye en el proceso de serializacion
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "tipoId", nullable = true)
    private Tipo tipo;

    public Producto(int productoId, String nombre, double precio, int existencia, Tipo tipo) {
        this.productoId = productoId;
        this.nombre = nombre;
        this.precio = precio;
        this.existencia = existencia;
        this.tipo = tipo;
    }

    public Producto(){}

    public int getProductoId() {
        return productoId;
    }

    public void setProductoId(int productoId) {
        this.productoId = productoId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
