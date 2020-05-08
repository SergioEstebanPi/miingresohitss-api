package com.globalhitss.miingresohitss.service;

import java.util.List;

import com.globalhitss.miingresohitss.model.Cliente;
import java.math.BigDecimal;

public interface IClienteService {

    public List<Cliente> getAllCliente();

    public Cliente getCliente(BigDecimal id);

    public Cliente saveCliente(Cliente cliente);

    public void deleteCliente(BigDecimal id);

}
