package com.globalhitss.miingresohitss.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globalhitss.miingresohitss.model.Descuento;
import com.globalhitss.miingresohitss.repository.DescuentoRepository;
import java.math.BigDecimal;
import com.globalhitss.miingresohitss.service.IDescuentoService;

@Service
public class DescuentoServiceImpl implements IDescuentoService {

    @Autowired
    private DescuentoRepository descuentoRepository;

    @Override
    public List<Descuento> getAllDescuento() {
        return (List<Descuento>) descuentoRepository.findAll();
    }

    @Override
    public Descuento getDescuento(BigDecimal id) {
        return descuentoRepository.findById(id).orElse(null);
    }

    @Override
    public Descuento saveDescuento(Descuento descuento) {
        return descuentoRepository.save(descuento);
    }

    @Override
    public void deleteDescuento(BigDecimal id) {
        descuentoRepository.deleteById(id);
    }
}
