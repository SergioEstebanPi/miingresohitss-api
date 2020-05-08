package com.globalhitss.miingresohitss.repository;

import com.globalhitss.miingresohitss.model.MedioPago;
import org.springframework.data.repository.CrudRepository;

import java.math.BigDecimal;

public interface MedioPagoRepository extends CrudRepository<MedioPago, BigDecimal> {

}
