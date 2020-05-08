package com.globalhitss.miingresohitss.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globalhitss.miingresohitss.model.Inventario;
import com.globalhitss.miingresohitss.repository.InventarioRepository;
import java.math.BigDecimal;
import com.globalhitss.miingresohitss.service.IInventarioService;

@Service
public class InventarioServiceImpl implements IInventarioService {

    @Autowired
    private InventarioRepository inventarioRepository;

    @Override
    public List<Inventario> getAllInventario() {
        return (List<Inventario>) inventarioRepository.findAll();
    }

    @Override
    public Inventario getInventario(BigDecimal id) {
        return inventarioRepository.findById(id).orElse(null);
    }

    @Override
    public Inventario saveInventario(Inventario inventario) {
        return inventarioRepository.save(inventario);
    }

    @Override
    public void deleteInventario(BigDecimal id) {
        inventarioRepository.deleteById(id);
    }
}
