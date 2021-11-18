package cirod.northwind.model;


import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name="producto")
public class ProductoInv {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productoId;

    @Column(name="nombre")
    private String nombre;

    @Column(name="precio")
    private double precio;

    @Column(name="existencia")
    private int existencia;

    @ManyToOne
    @JoinColumn(name = "tipoId", nullable = true)
    private TipoInv tipo;

    public ProductoInv(int productoId, String nombre, double precio, int existencia, TipoInv tipo) {
        this.productoId = productoId;
        this.nombre = nombre;
        this.precio = precio;
        this.existencia = existencia;
        this.tipo = tipo;
    }

    public ProductoInv(){}

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

    public TipoInv getTipo() {
        return tipo;
    }

    public void setTipo(TipoInv tipo) {
        this.tipo = tipo;
    }
}
