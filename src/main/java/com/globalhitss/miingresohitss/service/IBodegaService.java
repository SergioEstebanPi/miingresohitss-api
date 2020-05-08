package com.globalhitss.miingresohitss.service;

import java.util.List;

import com.globalhitss.miingresohitss.model.Bodega;
import java.math.BigDecimal;

public interface IBodegaService {

    public List<Bodega> getAllBodega();

    public Bodega getBodega(BigDecimal id);

    public Bodega saveBodega(Bodega bodega);

    public void deleteBodega(BigDecimal id);

}
