package com.globalhitss.miingresohitss.service;

import java.util.List;

import com.globalhitss.miingresohitss.model.Inventario;
import java.math.BigDecimal;

public interface IInventarioService {

    public List<Inventario> getAllInventario();

    public Inventario getInventario(BigDecimal id);

    public Inventario saveInventario(Inventario inventario);

    public void deleteInventario(BigDecimal id);

}
