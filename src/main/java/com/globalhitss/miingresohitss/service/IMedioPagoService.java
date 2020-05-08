package com.globalhitss.miingresohitss.service;

import java.util.List;

import com.globalhitss.miingresohitss.model.MedioPago;
import java.math.BigDecimal;

public interface IMedioPagoService {

    public List<MedioPago> getAllMedioPago();

    public MedioPago getMedioPago(BigDecimal id);

    public MedioPago saveMedioPago(MedioPago medioPago);

    public void deleteMedioPago(BigDecimal id);

}
