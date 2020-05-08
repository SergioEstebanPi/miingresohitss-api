package com.globalhitss.miingresohitss.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globalhitss.miingresohitss.model.Bodega;
import com.globalhitss.miingresohitss.repository.BodegaRepository;
import java.math.BigDecimal;
import com.globalhitss.miingresohitss.service.IBodegaService;

@Service
public class BodegaServiceImpl implements IBodegaService {

    @Autowired
    private BodegaRepository bodegaRepository;

    @Override
    public List<Bodega> getAllBodega() {
        return (List<Bodega>) bodegaRepository.findAll();
    }

    @Override
    public Bodega getBodega(BigDecimal id) {
        return bodegaRepository.findById(id).orElse(null);
    }

    @Override
    public Bodega saveBodega(Bodega bodega) {
        return bodegaRepository.save(bodega);
    }

    @Override
    public void deleteBodega(BigDecimal id) {
        bodegaRepository.deleteById(id);
    }
}
