package cirod.northwind.repository;

import cirod.northwind.model.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

public interface ProductoRepository
    extends CrudRepository<Producto, Integer> {

    @Query("SELECT producto FROM Producto producto " +
            "left join fetch Tipo tipo on tipo.tipoId = producto.tipo.tipoId")
    @Transactional(readOnly = true)
    public List<Producto> findQ();

    public List<Producto> findAll();

    public Producto save(Producto producto);
}
