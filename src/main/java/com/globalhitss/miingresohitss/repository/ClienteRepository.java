package com.globalhitss.miingresohitss.repository;

import com.globalhitss.miingresohitss.model.Cliente;
import org.springframework.data.repository.CrudRepository;

import java.math.BigDecimal;

public interface ClienteRepository extends CrudRepository<Cliente, BigDecimal> {

}
