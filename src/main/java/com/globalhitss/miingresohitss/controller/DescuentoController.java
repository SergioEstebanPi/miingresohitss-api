package com.globalhitss.miingresohitss.controller;

import com.globalhitss.miingresohitss.dto.DescuentoDTO;
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

import com.globalhitss.miingresohitss.model.Descuento;
import java.math.BigDecimal;
import com.globalhitss.miingresohitss.service.IDescuentoService;
import java.util.ArrayList;

@RestController
@RequestMapping("/descuento")
public class DescuentoController {

    @Autowired
    private IDescuentoService descuentoService;

    public DescuentoController() {
    }

    @GetMapping
    @ResponseBody
    public List<DescuentoDTO> getAllDescuento() {
        List<DescuentoDTO> listaDescuento = new ArrayList<>();
        descuentoService.getAllDescuento().forEach((descuento) -> {
            listaDescuento.add(convertToDto(descuento));
        });
        return listaDescuento;
    }

    @GetMapping("/{id}")
    @ResponseBody
    public DescuentoDTO getAllDescuento(@PathVariable BigDecimal id) {
        return convertToDto(descuentoService.getDescuento(id));
    }

    @PostMapping
    @ResponseBody
    public DescuentoDTO postDescuento(@RequestBody Descuento descuento) {
        return convertToDto(descuentoService.saveDescuento(descuento));
    }

    @PutMapping
    @ResponseBody
    public DescuentoDTO putDescuento(@RequestBody Descuento descuento) {
        Descuento descuentoActual = descuentoService.getDescuento(descuento.getIdDescuento());
        descuentoService.saveDescuento(descuentoActual);
        return null;
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public void deleteDescuento(@PathVariable BigDecimal id) {
        descuentoService.deleteDescuento(id);
    }
    
    private DescuentoDTO convertToDto(Descuento descuento) {
        DescuentoDTO descuentoDTO = new DescuentoDTO();
        descuentoDTO.setFechaFinal(descuento.getFechaFinal());
        descuentoDTO.setFechaInicial(descuento.getFechaInicial());
        descuentoDTO.setIdDescuento(descuento.getIdDescuento());
        descuentoDTO.setPorcentaje(descuento.getPorcentaje());
        //descuentoDTO.setProducto(descuento.getProducto());
        return descuentoDTO;
    }

    private Descuento convertToEntity(DescuentoDTO descuentoDTO) {
        Descuento descuento = new Descuento();
        descuento.setFechaFinal(descuentoDTO.getFechaFinal());
        descuento.setFechaInicial(descuentoDTO.getFechaInicial());
        descuento.setIdDescuento(descuentoDTO.getIdDescuento());
        descuento.setPorcentaje(descuentoDTO.getPorcentaje());
        //descuento.setProducto(descuentoDTO.getProducto());
        return descuento;
    }

}
