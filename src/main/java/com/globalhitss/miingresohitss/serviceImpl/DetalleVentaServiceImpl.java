package com.globalhitss.miingresohitss.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globalhitss.miingresohitss.model.DetalleVenta;
import com.globalhitss.miingresohitss.repository.DetalleVentaRepository;
import java.math.BigDecimal;
import com.globalhitss.miingresohitss.service.IDetalleVentaService;

@Service
public class DetalleVentaServiceImpl implements IDetalleVentaService {

    @Autowired
    private DetalleVentaRepository detalleVentaRepository;

    @Override
    public List<DetalleVenta> getAllDetalleVenta() {
        return (List<DetalleVenta>) detalleVentaRepository.findAll();
    }

    @Override
    public DetalleVenta getDetalleVenta(BigDecimal id) {
        return detalleVentaRepository.findById(id).orElse(null);
    }

    @Override
    public DetalleVenta saveDetalleVenta(DetalleVenta detalleDetalleVenta) {
        return detalleVentaRepository.save(detalleDetalleVenta);
    }

    @Override
    public void deleteDetalleVenta(BigDecimal id) {
        detalleVentaRepository.deleteById(id);
    }
}
