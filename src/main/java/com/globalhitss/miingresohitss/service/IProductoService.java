package com.globalhitss.miingresohitss.service;

import java.util.List;

import com.globalhitss.miingresohitss.model.Producto;
import java.math.BigDecimal;

public interface IProductoService {

    public List<Producto> getAllProducto();

    public Producto getProducto(BigDecimal id);

    public Producto saveProducto(Producto producto);

    public void deleteProducto(BigDecimal id);

}
