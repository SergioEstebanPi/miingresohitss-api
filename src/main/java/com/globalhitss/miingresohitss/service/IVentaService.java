package com.globalhitss.miingresohitss.service;

import java.util.List;

import com.globalhitss.miingresohitss.model.Venta;
import java.math.BigDecimal;

public interface IVentaService {

    public List<Venta> getAllVenta();

    public Venta getVenta(BigDecimal id);

    public Venta saveVenta(Venta venta);

    public void deleteVenta(BigDecimal id);

}
