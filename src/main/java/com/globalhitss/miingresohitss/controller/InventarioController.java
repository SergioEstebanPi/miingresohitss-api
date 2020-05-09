package com.globalhitss.miingresohitss.controller;

import com.globalhitss.miingresohitss.dto.InventarioDTO;
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

import com.globalhitss.miingresohitss.model.Inventario;
import java.math.BigDecimal;
import com.globalhitss.miingresohitss.service.IInventarioService;
import java.util.ArrayList;

@RestController
@RequestMapping("/inventario")
public class InventarioController {

    @Autowired
    private IInventarioService inventarioService;

    public InventarioController() {
    }

    @GetMapping
    @ResponseBody
    public List<InventarioDTO> getAllInventario() {
        List<InventarioDTO> listaInventario = new ArrayList<>();
        inventarioService.getAllInventario().forEach((inventario) -> {
            listaInventario.add(convertToDto(inventario));
        });
        return listaInventario;
    }

    @GetMapping("/{id}")
    @ResponseBody
    public InventarioDTO getAllInventario(@PathVariable BigDecimal id) {
        return convertToDto(inventarioService.getInventario(id));
    }

    @PostMapping
    @ResponseBody
    public InventarioDTO postInventario(@RequestBody Inventario inventario) {
        return convertToDto(inventarioService.saveInventario(inventario));
    }

    @PutMapping
    @ResponseBody
    public InventarioDTO putInventario(@RequestBody Inventario inventario) {
        Inventario ventaActual = inventarioService.getInventario(inventario.getIdInventario());
        inventarioService.saveInventario(ventaActual);
        return null;
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public void deleteInventario(@PathVariable BigDecimal id) {
        inventarioService.deleteInventario(id);
    }
    
    private InventarioDTO convertToDto(Inventario inventario) {
        InventarioDTO inventarioDTO = new InventarioDTO();
        //inventarioDTO.setBodega(inventario.getBodega());
        inventarioDTO.setCantidadDisponible(inventario.getCantidadDisponible());
        inventarioDTO.setIdInventario(inventario.getIdInventario());
        //inventarioDTO.setProducto(inventario.getProducto());
        return inventarioDTO;
    }

//    private Inventario convertToEntity(InventarioDTO inventarioDTO) {
//        Inventario inventario = new Inventario();
//        //inventario.setBodega(inventarioDTO.getBodega());
//        inventario.setCantidadDisponible(inventarioDTO.getCantidadDisponible());
//        inventario.setIdInventario(inventarioDTO.getIdInventario());
//        //inventario.setProducto(inventarioDTO.getProducto());
//        return inventario;
//    }
}
