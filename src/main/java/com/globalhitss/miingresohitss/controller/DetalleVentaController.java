package com.globalhitss.miingresohitss.controller;

import com.globalhitss.miingresohitss.dto.DetalleVentaDTO;
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

import com.globalhitss.miingresohitss.model.DetalleVenta;
import java.math.BigDecimal;
import com.globalhitss.miingresohitss.service.IDetalleVentaService;
import java.util.ArrayList;

@RestController
@RequestMapping("/detalleventa")
public class DetalleVentaController {

    @Autowired
    private IDetalleVentaService detalleVentaService;

    public DetalleVentaController() {
    }

    @GetMapping
    @ResponseBody
    public List<DetalleVentaDTO> getAllDetalleVenta() {
        List<DetalleVentaDTO> listaDetalleVenta = new ArrayList<>();
        detalleVentaService.getAllDetalleVenta().forEach((detalleVenta) -> {
            listaDetalleVenta.add(convertToDto(detalleVenta));
        });
        return listaDetalleVenta;
    }

    @GetMapping("/{id}")
    @ResponseBody
    public DetalleVentaDTO getAllDetalleVenta(@PathVariable BigDecimal id) {
        return convertToDto(detalleVentaService.getDetalleVenta(id));
    }

    @PostMapping
    @ResponseBody
    public DetalleVentaDTO postDetalleVenta(@RequestBody DetalleVenta detalleVenta) {
        return convertToDto(detalleVentaService.saveDetalleVenta(detalleVenta));
    }

    @PutMapping
    @ResponseBody
    public DetalleVentaDTO putDetalleVenta(@RequestBody DetalleVenta detalleVenta) {
        DetalleVenta detalleVentaActual = detalleVentaService.getDetalleVenta(detalleVenta.getIdDetalleVenta());
        detalleVentaService.saveDetalleVenta(detalleVentaActual);
        return null;
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public void deleteDetalleVenta(@PathVariable BigDecimal id) {
        detalleVentaService.deleteDetalleVenta(id);
    }
    
    private DetalleVentaDTO convertToDto(DetalleVenta detalleVenta) {
        DetalleVentaDTO detalleVentaDTO = new DetalleVentaDTO();
        detalleVentaDTO.setCantidadVenta(detalleVenta.getCantidadVenta());
        detalleVentaDTO.setIdDetalleVenta(detalleVenta.getIdDetalleVenta());
        //detalleVentaDTO.setProducto(detalleVenta.getProducto());
        detalleVentaDTO.setValorUnitario(detalleVenta.getValorUnitario());
        //detalleVentaDTO.setVenta(detalleVenta.getVenta());
        return detalleVentaDTO;
    }

//    private DetalleVenta convertToEntity(DetalleVentaDTO detalleVentaDTO) {
//        DetalleVenta detalleVenta = new DetalleVenta();
//        detalleVenta.setCantidadVenta(detalleVentaDTO.getCantidadVenta());
//        detalleVenta.setIdDetalleVenta(detalleVenta.getIdDetalleVenta());
//        //detalleVenta.setProducto(detalleVentaDTO.getProducto());
//        detalleVenta.setValorUnitario(detalleVentaDTO.getValorUnitario());
//        //detalleVenta.setVenta(detalleVentaDTO.getVenta());
//        return detalleVenta;
//    }
}
