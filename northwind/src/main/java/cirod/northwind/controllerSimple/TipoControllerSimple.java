/*package cirod.northwind.controllerSimple;

import cirod.northwind.modelSimple.TipoSimple;
import cirod.northwind.repositorySimple.TipoRepositorySimple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TipoControllerSimple {

    @Autowired
    TipoRepositorySimple tipoRepositorySimple;

    @GetMapping(value = "/listTipos")
    public List<TipoSimple> getListTipo(){
        return tipoRepositorySimple.findAll();
    }

    @PostMapping(value = "/tipo")
    public TipoSimple getTipo(@RequestBody TipoSimple tipo){
        return tipoRepositorySimple.findByTipoId(tipo.getTipoId());
    }

    @PostMapping(value = "/tipo/new")
    public TipoSimple addTipo(@RequestBody TipoSimple tipo){
        return tipoRepositorySimple.save(tipo);
    }


}
*/