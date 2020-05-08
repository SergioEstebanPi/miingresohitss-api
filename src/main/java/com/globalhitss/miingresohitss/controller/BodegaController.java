package com.globalhitss.miingresohitss.controller;

import com.globalhitss.miingresohitss.dto.BodegaDTO;
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

import com.globalhitss.miingresohitss.model.Bodega;
import java.math.BigDecimal;
import com.globalhitss.miingresohitss.service.IBodegaService;
import java.util.ArrayList;

@RestController
@RequestMapping("/bodega")
public class BodegaController {

        @Autowired
        private IBodegaService bodegaService;

        public BodegaController() {
        }

        @GetMapping
        @ResponseBody
        public List<BodegaDTO> getAllBodega() {
            List<BodegaDTO> listaBodega = new ArrayList<>();
            bodegaService.getAllBodega().forEach((bodega) -> {
                listaBodega.add(convertToDto(bodega));
            });
            return listaBodega;
        }

        @GetMapping("/{id}")
        @ResponseBody
        public BodegaDTO getAllBodega(@PathVariable BigDecimal id) {
            return convertToDto(bodegaService.getBodega(id));
        }

        @PostMapping
        @ResponseBody
        public BodegaDTO postBodega(@RequestBody Bodega bodega) {
            return convertToDto(bodegaService.saveBodega(bodega));
        }

        @PutMapping
        @ResponseBody
        public BodegaDTO putBodega(@RequestBody Bodega bodega) {
            Bodega bodegaActual = bodegaService.getBodega(bodega.getIdBodega());
            if (bodegaActual != null) {
                if (bodega.getNombreBodega() != null) {
                    bodegaActual.setNombreBodega(bodega.getNombreBodega());
                }
                if (bodega.getDireccionBodega() != null) {
                    bodegaActual.setNombreBodega(bodega.getDireccionBodega());
                }
                bodegaService.saveBodega(bodegaActual);
            }
            return null;
        }

        @DeleteMapping("/{id}")
        @ResponseBody
        public void deleteBodega(@PathVariable BigDecimal id) {
            bodegaService.deleteBodega(id);
        }

        private BodegaDTO convertToDto(Bodega bodega) {
            BodegaDTO bodegaDTO = new BodegaDTO();
            bodegaDTO.setIdBodega(bodega.getIdBodega());
            bodegaDTO.setDireccionBodega(bodega.getDireccionBodega());
            //bodegaDTO.setInventarios(bodega.getInventarios());
            bodegaDTO.setNombreBodega(bodega.getNombreBodega());
            return bodegaDTO;
        }

        private Bodega convertToEntity(BodegaDTO bodegaDTO) {
            Bodega bodega = new Bodega();
            bodega.setIdBodega(bodegaDTO.getIdBodega());
            bodega.setDireccionBodega(bodegaDTO.getDireccionBodega());
            //bodegaDTO.setInventarios(bodega.getInventarios());
            bodega.setNombreBodega(bodegaDTO.getNombreBodega());
            return bodega;
        }
}
