package com.globalhitss.miingresohitss.repository;

import com.globalhitss.miingresohitss.model.Descuento;
import org.springframework.data.repository.CrudRepository;

import java.math.BigDecimal;

public interface DescuentoRepository extends CrudRepository<Descuento, BigDecimal> {

}
