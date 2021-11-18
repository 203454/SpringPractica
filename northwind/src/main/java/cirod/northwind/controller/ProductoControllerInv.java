package cirod.northwind.controller;


import cirod.northwind.model.Producto;
import cirod.northwind.model.ProductoInv;
import cirod.northwind.model.TipoInv;
import cirod.northwind.repository.ProductoRepositoryInv;
import cirod.northwind.repository.TipoRepository;
import cirod.northwind.repository.TipoRepositoryInv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductoControllerInv {

    @Autowired
    ProductoRepositoryInv productoRepositoryInv;

    @Autowired
    TipoRepositoryInv tipoRepositoryInv;

    @GetMapping(value="/inv/ListProductosInv")
    public List<ProductoInv> getListProductosInv(){
        return productoRepositoryInv.findAll();
    }

    @GetMapping(value="/inv/ListProductosQ")
    public List<ProductoInv> getListProductosQ(){
        return productoRepositoryInv.findAll();
    }

    @PostMapping(value = "/inv/producto/add")
    public ProductoInv addProducto(@RequestBody ProductoInv productoInv) {
        TipoInv tipo = tipoRepositoryInv.findByTipoId(2);
        productoInv.setTipo(tipo);
        return productoRepositoryInv.save(productoInv);

    }



}
