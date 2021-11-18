package cirod.northwind.repository;


import cirod.northwind.model.ProductoInv;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductoRepositoryInv
    extends CrudRepository<ProductoInv, Integer> {

    public List<ProductoInv> findAll();
    public ProductoInv save(ProductoInv producto);
}
