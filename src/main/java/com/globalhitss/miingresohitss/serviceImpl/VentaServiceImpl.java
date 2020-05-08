package com.globalhitss.miingresohitss.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globalhitss.miingresohitss.model.Venta;
import com.globalhitss.miingresohitss.repository.VentaRepository;
import java.math.BigDecimal;
import com.globalhitss.miingresohitss.service.IVentaService;

@Service
public class VentaServiceImpl implements IVentaService {

    @Autowired
    private VentaRepository ventaRepository;

    @Override
    public List<Venta> getAllVenta() {
        return (List<Venta>) ventaRepository.findAll();
    }

    @Override
    public Venta getVenta(BigDecimal id) {
        return ventaRepository.findById(id).orElse(null);
    }

    @Override
    public Venta saveVenta(Venta venta) {
        return ventaRepository.save(venta);
    }

    @Override
    public void deleteVenta(BigDecimal id) {
        ventaRepository.deleteById(id);
    }
}
