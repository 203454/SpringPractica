package cirod.northwind.repository;

import cirod.northwind.model.Tipo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TipoRepository
        extends CrudRepository<Tipo, Long> {

        /* @Query("SELECT customer FROM Customers customer")
         @Transactional(readOnly = true)
          List<Customers> All();*/
        List<Tipo> findAll();

                Tipo findByTipoId(int TipoId);

                Tipo save(Tipo tipo);
                void delete(Tipo tipo);


    }


