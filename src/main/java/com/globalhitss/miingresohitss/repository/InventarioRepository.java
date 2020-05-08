package com.globalhitss.miingresohitss.repository;

import com.globalhitss.miingresohitss.model.Inventario;
import org.springframework.data.repository.CrudRepository;

import java.math.BigDecimal;

public interface InventarioRepository extends CrudRepository<Inventario, BigDecimal> {

}
