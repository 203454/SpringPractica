package cirod.northwind.controller;

import cirod.northwind.model.Customers;
import cirod.northwind.model.Tipo;
import cirod.northwind.repository.TipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TipoController {

    @Autowired
    TipoRepository tipoRepository;

    @GetMapping(value = "/listTipos")
    public List<Tipo> getListTipo(){
        return tipoRepository.findAll();
    }


    @PostMapping(value = "/tipo/add")
    public Tipo addTipo(@RequestBody Tipo tipo){
        return tipoRepository.save(tipo);
    }

    @PostMapping(value = "/tipo/update")
    public Tipo updateTipo(@RequestBody Tipo tipo){
        Tipo t = tipoRepository.findByTipoId(tipo.getTipoId());
        if(t != null){
            t.setDescripcion(tipo.getDescripcion());
            return tipoRepository.save(t);
        }else{
            return null;
        }

    }

    @PostMapping(value = "/tipo/delete")
    public boolean deleteTipo(@RequestBody Tipo tipo){
        Tipo t = tipoRepository.findByTipoId(tipo.getTipoId());

        if(t != null){
            tipoRepository.delete(t);
            return true;
        }else{
            return false;
        }
    }


}
