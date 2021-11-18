package cirod.northwind.repository;

import cirod.northwind.model.TipoInv;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TipoRepositoryInv
        extends CrudRepository<TipoInv, Long> {

        /* @Query("SELECT customer FROM Customers customer")
         @Transactional(readOnly = true)
          List<Customers> All();*/
        List<TipoInv> findAll();

        TipoInv findByTipoId(int TipoId);

        TipoInv save(TipoInv tipo);
        void delete(TipoInv tipo);


    }


