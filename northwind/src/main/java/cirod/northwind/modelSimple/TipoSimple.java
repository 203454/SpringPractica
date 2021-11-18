package cirod.northwind.modelSimple;

import cirod.northwind.modelSimple.ProductoSimple;

import javax.persistence.*;
import java.util.Set;

@Entity()
@Table(name = "tipo")
public class TipoSimple {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="tipoId")
    private int tipoId;

    @Column(name="descripcion")
    private String descripcion;


    @OneToMany(mappedBy = "tipo", fetch = FetchType.LAZY,
               cascade = CascadeType.ALL )
    private Set<ProductoSimple> productos;


    public TipoSimple(int tipoId, String descripcion) {
        this.tipoId = tipoId;
        this.descripcion = descripcion;
    }

    public TipoSimple(){};

    public int getTipoId() {
        return tipoId;
    }

    public void setTipoId(int tipoId) {
        this.tipoId = tipoId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public Set<ProductoSimple> getProductos() {
        return productos;
    }

    public void setProductos(Set<ProductoSimple> productos) {
        this.productos = productos;
    }


}
