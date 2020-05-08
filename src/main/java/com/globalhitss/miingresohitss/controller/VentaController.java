package com.globalhitss.miingresohitss.controller;

import com.globalhitss.miingresohitss.dto.VentaDTO;
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

import com.globalhitss.miingresohitss.model.Venta;
import java.math.BigDecimal;
import com.globalhitss.miingresohitss.service.IVentaService;
import java.util.ArrayList;

@RestController
@RequestMapping("/venta")
public class VentaController {

    @Autowired
    private IVentaService ventaService;

    public VentaController() {
    }

    @GetMapping
    @ResponseBody
    public List<VentaDTO> getAllVenta() {
        List<VentaDTO> listaVenta = new ArrayList<>();
        ventaService.getAllVenta().forEach((venta) -> {
            listaVenta.add(convertToDto(venta));
        });
        return listaVenta;
    }

    @GetMapping("/{id}")
    @ResponseBody
    public VentaDTO getAllVenta(@PathVariable BigDecimal id) {
        //return convertToDto(ventaService.getVenta(id));
        return new VentaDTO();
    }

    @PostMapping
    @ResponseBody
    public VentaDTO postVenta(@RequestBody Venta venta) {
        return convertToDto(ventaService.saveVenta(venta));
    }

    @PutMapping
    @ResponseBody
    public VentaDTO putVenta(@RequestBody Venta venta) {
        Venta ventaActual = ventaService.getVenta(venta.getIdVenta());
        return convertToDto(ventaService.saveVenta(ventaActual));
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public void deleteVenta(@PathVariable BigDecimal id) {
        ventaService.deleteVenta(id);
    }
    
    private VentaDTO convertToDto(Venta venta) {
        VentaDTO ventaDTO = new VentaDTO();
        //ventaDTO.setCliente(venta.getCliente());
        //ventaDTO.setDetalleVentas(venta.getDetalleVentas());
        ventaDTO.setEstadoVenta(venta.getEstadoVenta());
        ventaDTO.setFechaVenta(venta.getFechaVenta());
        ventaDTO.setIdVenta(venta.getIdVenta());
        //ventaDTO.setMedioPago(venta.getMedioPago());
        ventaDTO.setValorTotal(venta.getValorTotal());
        return ventaDTO;
    }

    private Venta convertToEntity(VentaDTO ventaDTO) {
        Venta venta = new Venta();
        //venta.setCliente(ventaDTO.getCliente());
        //venta.setDetalleVentas(ventaDTO.getDetalleVentas());
        venta.setEstadoVenta(ventaDTO.getEstadoVenta());
        venta.setFechaVenta(ventaDTO.getFechaVenta());
        venta.setIdVenta(ventaDTO.getIdVenta());
        //venta.setMedioPago(ventaDTO.getMedioPago());
        venta.setValorTotal(ventaDTO.getValorTotal());
        return venta;
    }
}
