 package cirod.northwind.repositorySimple;

import cirod.northwind.modelSimple.ProductoSimple;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductoRepositorySimple
    extends CrudRepository<ProductoSimple, Integer> {

    public List<ProductoSimple> findAll();


}



