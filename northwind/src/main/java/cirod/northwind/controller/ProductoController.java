package cirod.northwind.controller;


import cirod.northwind.model.Producto;
import cirod.northwind.model.ProductoInv;
import cirod.northwind.model.TipoInv;
import cirod.northwind.model.Tipo;

import cirod.northwind.repository.ProductoRepository;
import cirod.northwind.repository.ProductoRepositoryInv;
import cirod.northwind.repository.TipoRepositoryInv;
import cirod.northwind.repository.TipoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductoController {

    @Autowired
    ProductoRepository productoRepository;

    @Autowired
    TipoRepository tipoRepository;

    @GetMapping(value="/ListProductosInv")
    public List<Producto> getListProductosInv(){
        return productoRepository.findAll();
    }

    @GetMapping(value="/ListProductosQ")
    public List<Producto> getListProductosQ(){
        return productoRepository.findAll();
    }

    @PostMapping(value = "/producto/add")
    public Producto addProducto(@RequestBody Producto producto) {
        Tipo tipo = tipoRepository.findByTipoId(2);
        producto.setTipo(tipo);
        return productoRepository.save(producto);

    }



}
