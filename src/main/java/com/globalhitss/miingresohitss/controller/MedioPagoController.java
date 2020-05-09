package com.globalhitss.miingresohitss.controller;

import com.globalhitss.miingresohitss.dto.MedioPagoDTO;
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

import com.globalhitss.miingresohitss.model.MedioPago;
import java.math.BigDecimal;
import com.globalhitss.miingresohitss.service.IMedioPagoService;
import java.util.ArrayList;

@RestController
@RequestMapping("/mediopago")
public class MedioPagoController {

    @Autowired
    private IMedioPagoService medioPagoService;

    public MedioPagoController() {
    }

    @GetMapping
    @ResponseBody
    public List<MedioPagoDTO> getAllMedioPago() {
        List<MedioPagoDTO> listaMedioPago = new ArrayList<>();
        medioPagoService.getAllMedioPago().forEach((medioPago) -> {
            listaMedioPago.add(convertToDto(medioPago));
        });
        return listaMedioPago;
    }

    @GetMapping("/{id}")
    @ResponseBody
    public MedioPagoDTO getAllMedioPago(@PathVariable BigDecimal id) {
        return convertToDto(medioPagoService.getMedioPago(id));
    }

    @PostMapping
    @ResponseBody
    public MedioPagoDTO postMedioPago(@RequestBody MedioPago medioPago) {
        return convertToDto(medioPagoService.saveMedioPago(medioPago));
    }

    @PutMapping
    @ResponseBody
    public MedioPagoDTO putMedioPago(@RequestBody MedioPago medioPago) {
        MedioPago medioPagoActual = medioPagoService.getMedioPago(medioPago.getIdMedioPago());
        medioPagoService.saveMedioPago(medioPagoActual);
        return null;
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public void deleteMedioPago(@PathVariable BigDecimal id) {
        medioPagoService.deleteMedioPago(id);
    }
    
    private MedioPagoDTO convertToDto(MedioPago medioPago) {
        MedioPagoDTO medioPagoDTO = new MedioPagoDTO();
        //medioPagoDTO.setCliente(medioPago.getCliente());
        medioPagoDTO.setCodigoPostal(medioPago.getCodigoPostal());
        medioPagoDTO.setCodigoVerificacion(medioPago.getCodigoVerificacion());
        medioPagoDTO.setIdMedioPago(medioPago.getIdMedioPago());
        medioPagoDTO.setNombreTarjeta(medioPago.getNombreTarjeta());
        medioPagoDTO.setNumeroTarjeta(medioPago.getNumeroTarjeta());
        medioPagoDTO.setValidaHasta(medioPago.getValidaHasta());
        //medioPagoDTO.setVentas(medioPago.getVentas());
        return medioPagoDTO;
    }

//    private MedioPago convertToEntity(MedioPagoDTO medioPagoDTO) {
//        MedioPago medioPago = new MedioPago();
//        //medioPago.setCliente(medioPagoDTO.getCliente());
//        medioPago.setCodigoPostal(medioPagoDTO.getCodigoPostal());
//        medioPago.setCodigoVerificacion(medioPagoDTO.getCodigoVerificacion());
//        medioPago.setIdMedioPago(medioPagoDTO.getIdMedioPago());
//        medioPago.setNombreTarjeta(medioPagoDTO.getNombreTarjeta());
//        medioPago.setNumeroTarjeta(medioPagoDTO.getNumeroTarjeta());
//        medioPago.setValidaHasta(medioPagoDTO.getValidaHasta());
//        //medioPago.setVentas(medioPagoDTO.getVentas());
//        return medioPago;
//    }
}
