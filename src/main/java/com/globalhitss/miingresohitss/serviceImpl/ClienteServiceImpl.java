package com.globalhitss.miingresohitss.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globalhitss.miingresohitss.model.Cliente;
import com.globalhitss.miingresohitss.repository.ClienteRepository;
import java.math.BigDecimal;
import com.globalhitss.miingresohitss.service.IClienteService;

@Service
public class ClienteServiceImpl implements IClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public List<Cliente> getAllCliente() {
        return (List<Cliente>) clienteRepository.findAll();
    }

    @Override
    public Cliente getCliente(BigDecimal id) {
        return clienteRepository.findById(id).orElse(null);
    }

    @Override
    public Cliente saveCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public void deleteCliente(BigDecimal id) {
        clienteRepository.deleteById(id);
    }
}
