package com.globalhitss.miingresohitss.repository;

import com.globalhitss.miingresohitss.model.DetalleVenta;
import org.springframework.data.repository.CrudRepository;

import java.math.BigDecimal;

public interface DetalleVentaRepository extends CrudRepository<DetalleVenta, BigDecimal> {

}
