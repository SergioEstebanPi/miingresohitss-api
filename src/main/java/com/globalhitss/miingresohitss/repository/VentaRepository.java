package com.globalhitss.miingresohitss.repository;

import com.globalhitss.miingresohitss.model.Venta;
import org.springframework.data.repository.CrudRepository;

import java.math.BigDecimal;

public interface VentaRepository extends CrudRepository<Venta, BigDecimal> {

}
