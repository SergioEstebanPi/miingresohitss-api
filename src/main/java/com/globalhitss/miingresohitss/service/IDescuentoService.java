package com.globalhitss.miingresohitss.service;

import java.util.List;

import com.globalhitss.miingresohitss.model.Descuento;
import java.math.BigDecimal;

public interface IDescuentoService {

    public List<Descuento> getAllDescuento();

    public Descuento getDescuento(BigDecimal id);

    public Descuento saveDescuento(Descuento descuento);

    public void deleteDescuento(BigDecimal id);

}
