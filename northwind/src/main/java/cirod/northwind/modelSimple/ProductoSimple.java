package cirod.northwind.modelSimple;


import cirod.northwind.modelSimple.TipoSimple;


import javax.persistence.*;

@Entity
@Table(name="producto")
public class ProductoSimple {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productoId;

    @Column(name="nombre")
    private String nombre;

    @Column(name="precio")
    private double precio;

    @Column(name="existencia")
    private int existencia;

    private TipoSimple tipo;

    public ProductoSimple(int productoId, String nombre, double precio, int existencia, TipoSimple tipo) {
        this.productoId = productoId;
        this.nombre = nombre;
        this.precio = precio;
        this.existencia = existencia;
        this.tipo = tipo;
    }

    public ProductoSimple(){}

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

    public TipoSimple getTipoSimple() {
        return tipo;
    }

    public void setTipoSimple(TipoSimple tipoSimple) {
        this.tipo = tipoSimple;
    }
}
