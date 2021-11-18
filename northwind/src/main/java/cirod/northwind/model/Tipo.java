package cirod.northwind.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

@Entity()
@Table(name = "tipo")
public class Tipo {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="tipoId")
    private int tipoId;

    @Column(name="descripcion")
    private String descripcion;

    @JsonManagedReference
    @OneToMany(mappedBy = "tipo", fetch = FetchType.LAZY,
               cascade = CascadeType.DETACH, orphanRemoval = false )
    private Set<Producto> productos;

    public Tipo(){};

    public Tipo(int tipoId, String descripcion) {
        this.tipoId = tipoId;
        this.descripcion = descripcion;
    }


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


    public Set<Producto> getProductos() {
        return productos;
    }

    public void setProductos(Set<Producto> productos) {
        this.productos = productos;
    }


}
