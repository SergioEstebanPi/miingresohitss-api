package com.globalhitss.miingresohitss.service;

import java.util.List;

import com.globalhitss.miingresohitss.model.DetalleVenta;
import java.math.BigDecimal;

public interface IDetalleVentaService {

    public List<DetalleVenta> getAllDetalleVenta();

    public DetalleVenta getDetalleVenta(BigDecimal id);

    public DetalleVenta saveDetalleVenta(DetalleVenta detalleVenta);

    public void deleteDetalleVenta(BigDecimal id);

}
