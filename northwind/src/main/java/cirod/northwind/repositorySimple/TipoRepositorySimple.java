 package cirod.northwind.repositorySimple;

import cirod.northwind.modelSimple.TipoSimple;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TipoRepositorySimple
        extends CrudRepository<TipoSimple,Integer> {

        /* @Query("SELECT customer FROM Customers customer")
         @Transactional(readOnly = true)
          List<Customers> All();*/
        List<TipoSimple> findAll();

        TipoSimple findByTipoId(int TipoId);

        TipoSimple save(TipoSimple tipo);
        void delete(TipoSimple tipo);


    }


