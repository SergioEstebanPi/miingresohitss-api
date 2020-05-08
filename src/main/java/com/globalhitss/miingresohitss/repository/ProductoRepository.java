package com.globalhitss.miingresohitss.repository;

import com.globalhitss.miingresohitss.model.Producto;
import org.springframework.data.repository.CrudRepository;

import java.math.BigDecimal;

public interface ProductoRepository extends CrudRepository<Producto, BigDecimal> {

}
