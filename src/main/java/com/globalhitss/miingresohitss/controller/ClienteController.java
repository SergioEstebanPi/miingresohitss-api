package com.globalhitss.miingresohitss.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.globalhitss.miingresohitss.dto.ClienteDTO;
import com.globalhitss.miingresohitss.model.Cliente;
import com.globalhitss.miingresohitss.service.IClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private IClienteService clienteService;

    public ClienteController() {
    }

    @GetMapping
    @ResponseBody
    public List<ClienteDTO> getAllCliente() {
        List<ClienteDTO> listaCliente = new ArrayList<>();
        clienteService.getAllCliente().forEach((cliente) -> {
            listaCliente.add(convertToDto(cliente));
        });
        return listaCliente;
    }

    @GetMapping("/{id}")
    @ResponseBody
    public ClienteDTO getAllCliente(@PathVariable BigDecimal id) {
        return convertToDto(clienteService.getCliente(id));
    }

    @PostMapping
    @ResponseBody
    public ClienteDTO postCliente(@RequestBody Cliente cliente) {
        return convertToDto(clienteService.saveCliente(cliente));
    }

    @PutMapping
    @ResponseBody
    public ClienteDTO putCliente(@RequestBody Cliente cliente) {
        return convertToDto(clienteService.saveCliente(cliente));
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public void deleteCliente(@PathVariable BigDecimal id) {
        clienteService.deleteCliente(id);
    }
    
    private ClienteDTO convertToDto(Cliente cliente) {
        ClienteDTO clienteDTO = new ClienteDTO();
        clienteDTO.setApellidosCliente(cliente.getApellidosCliente());
        clienteDTO.setContrasena(cliente.getContrasena());
        clienteDTO.setCorreo(cliente.getCorreo());
        clienteDTO.setDireccionCliente(cliente.getDireccionCliente());
        clienteDTO.setDocumento(cliente.getDocumento());
        clienteDTO.setFechaNacimiento(cliente.getFechaNacimiento());
        clienteDTO.setFotoCliente(cliente.getFotoCliente());
        clienteDTO.setGenero(cliente.getGenero());
        clienteDTO.setIdCliente(cliente.getIdCliente());
        //clienteDTO.setMedioPagos(cliente.getMedioPagos());
        clienteDTO.setNombresCliente(cliente.getNombresCliente());
        clienteDTO.setTelefono(cliente.getTelefono());
        clienteDTO.setTipoDocumento(cliente.getTipoDocumento());
        //clienteDTO.setVentas(cliente.getVentas());
        return clienteDTO;
    }

//    private Cliente convertToEntity(ClienteDTO clienteDTO) {
//        Cliente cliente = new Cliente();
//        cliente.setApellidosCliente(clienteDTO.getApellidosCliente());
//        cliente.setContrasena(clienteDTO.getContrasena());
//        cliente.setCorreo(clienteDTO.getCorreo());
//        cliente.setDireccionCliente(clienteDTO.getDireccionCliente());
//        cliente.setDocumento(clienteDTO.getDocumento());
//        cliente.setFechaNacimiento(clienteDTO.getFechaNacimiento());
//        cliente.setFotoCliente(clienteDTO.getFotoCliente());
//        cliente.setGenero(clienteDTO.getGenero());
//        cliente.setIdCliente(clienteDTO.getIdCliente());
//        //cliente.setMedioPagos(clienteDTO.getMedioPagos());
//        clienteDTO.setNombresCliente(clienteDTO.getNombresCliente());
//        clienteDTO.setTelefono(clienteDTO.getTelefono());
//        clienteDTO.setTipoDocumento(clienteDTO.getTipoDocumento());
//        //cliente.setVentas(clienteDTO.getVentas());
//        return cliente;
//    }
}
