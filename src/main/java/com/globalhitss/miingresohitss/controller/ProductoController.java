package com.globalhitss.miingresohitss.controller;

import com.globalhitss.miingresohitss.dto.ProductoDTO;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.globalhitss.miingresohitss.model.Producto;
import java.math.BigDecimal;
import com.globalhitss.miingresohitss.service.IProductoService;
import java.util.ArrayList;

@RestController
@RequestMapping("/producto")
public class ProductoController {

    @Autowired
    private IProductoService productoService;

    public ProductoController() {
    }

    @GetMapping
    @ResponseBody
    public List<ProductoDTO> getAllProducto() {
        List<ProductoDTO> listaProducto = new ArrayList<>();
        productoService.getAllProducto().forEach((producto) -> {
            listaProducto.add(convertToDto(producto));
        });
        return listaProducto;
    }

    @GetMapping("/{id}")
    @ResponseBody
    public ProductoDTO getAllProducto(@PathVariable BigDecimal id) {
        //return productoService.getProducto(id);
        return new ProductoDTO();
    }

    @PostMapping
    @ResponseBody
    public ProductoDTO postProducto(@RequestBody Producto producto) {
        return convertToDto(productoService.saveProducto(producto));
    }

    @PutMapping
    @ResponseBody
    public ProductoDTO putProducto(@RequestBody Producto producto) {
        Producto productoActual = productoService.getProducto(producto.getIdProducto());
        return convertToDto(productoService.saveProducto(producto));
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public void deleteProducto(@PathVariable BigDecimal id) {
        productoService.deleteProducto(id);
    }
    
    private ProductoDTO convertToDto(Producto producto) {
        ProductoDTO productoDTO = new ProductoDTO();
        productoDTO.setDescripcionProducto(producto.getDescripcionProducto());
        //productoDTO.setDescuentos(producto.getDescuentos());
        //productoDTO.setDetalleVentas(producto.getDetalleVentas());
        productoDTO.setEstadoProducto(producto.getEstadoProducto());
        productoDTO.setFabricante(producto.getFabricante());
        productoDTO.setFotoProducto(producto.getFotoProducto());
        productoDTO.setIdProducto(producto.getIdProducto());
        //productoDTO.setInventarios(producto.getInventarios());
        productoDTO.setMesesGarantia(producto.getMesesGarantia());
        productoDTO.setNombreProducto(producto.getNombreProducto());
        productoDTO.setPrecioMinimo(producto.getPrecioMinimo());
        productoDTO.setUnidadMedida(producto.getUnidadMedida());
        return productoDTO;
    }

    private Producto convertToEntity(ProductoDTO productoDTO) {
        Producto producto = new Producto();
        producto.setDescripcionProducto(productoDTO.getDescripcionProducto());
        //producto.setDescuentos(productoDTO.getDescuentos());
        //producto.setDetalleVentas(productoDTO.getDetalleVentas());
        producto.setEstadoProducto(productoDTO.getEstadoProducto());
        producto.setFabricante(productoDTO.getFabricante());
        producto.setFotoProducto(productoDTO.getFotoProducto());
        producto.setIdProducto(productoDTO.getIdProducto());
        //producto.setInventarios(productoDTO.getInventarios());
        producto.setMesesGarantia(productoDTO.getMesesGarantia());
        producto.setNombreProducto(productoDTO.getNombreProducto());
        producto.setPrecioMinimo(productoDTO.getPrecioMinimo());
        producto.setUnidadMedida(productoDTO.getUnidadMedida());
        return producto;
    }
}
