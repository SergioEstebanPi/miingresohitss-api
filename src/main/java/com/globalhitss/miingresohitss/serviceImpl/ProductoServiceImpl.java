package com.globalhitss.miingresohitss.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globalhitss.miingresohitss.model.Producto;
import com.globalhitss.miingresohitss.repository.ProductoRepository;
import java.math.BigDecimal;
import com.globalhitss.miingresohitss.service.IProductoService;

@Service
public class ProductoServiceImpl implements IProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public List<Producto> getAllProducto() {
        return (List<Producto>) productoRepository.findAll();
    }

    @Override
    public Producto getProducto(BigDecimal id) {
        return productoRepository.findById(id).orElse(null);
    }

    @Override
    public Producto saveProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public void deleteProducto(BigDecimal id) {
        productoRepository.deleteById(id);
    }
}
