package com.globalhitss.miingresohitss.controller;

import com.globalhitss.miingresohitss.dto.CompraDTO;
import com.globalhitss.miingresohitss.model.Cliente;
import com.globalhitss.miingresohitss.model.DetalleVenta;
import com.globalhitss.miingresohitss.model.MedioPago;
import com.globalhitss.miingresohitss.model.Producto;
import com.globalhitss.miingresohitss.model.Venta;
import com.globalhitss.miingresohitss.service.IClienteService;
import com.globalhitss.miingresohitss.service.IDetalleVentaService;
import com.globalhitss.miingresohitss.service.IMedioPagoService;
import com.globalhitss.miingresohitss.service.IProductoService;
import com.globalhitss.miingresohitss.service.IVentaService;
import com.globalhitss.miingresohitss.serviceImpl.VentaServiceImpl;
import java.math.BigDecimal;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/compra")
public class CompraController {

    @Autowired
    private IVentaService ventaService;
    @Autowired
    private IDetalleVentaService detalleVentaService;
    @Autowired
    private IClienteService clienteService;
    @Autowired
    private IMedioPagoService medioPagoService;
    @Autowired
    private IProductoService productoService;

    public CompraController() {
    }

    @PostMapping
    @ResponseBody
    public int postBodega(@RequestBody CompraDTO compraDTO) {
        Cliente cliente = clienteService.getCliente(compraDTO.getIdCliente());
        MedioPago medioPago = medioPagoService.getMedioPago(compraDTO.getIdMedioPago());
        Producto producto = productoService.getProducto(compraDTO.getIdProducto());

        if (medioPago.getCliente().getIdCliente() == cliente.getIdCliente()) {
            Venta venta = new Venta();
            venta.setCliente(cliente);
            venta.setMedioPago(medioPago);
            venta.setFechaVenta(new Date());
            venta.setEstadoVenta("ACT");
            venta.setValorTotal(new BigDecimal(0));
            ventaService.saveVenta(venta);

            DetalleVenta detalleVenta = new DetalleVenta();
            detalleVenta.setVenta(venta);
            detalleVenta.setProducto(producto);
            detalleVenta.setValorUnitario(producto.getPrecioMinimo());
            detalleVenta.setCantidadVenta(compraDTO.getCantidad());
            detalleVentaService.saveDetalleVenta(detalleVenta);
            return 0;
        }
        return -1;
    }
}
