package com.globalhitss.miingresohitss.controller;

import com.globalhitss.miingresohitss.dto.ReporteDTO;
import com.globalhitss.miingresohitss.model.DetalleVenta;
import com.globalhitss.miingresohitss.model.Venta;
import com.globalhitss.miingresohitss.service.IDetalleVentaService;
import com.globalhitss.miingresohitss.service.IVentaService;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reporte")
public class ReporteController {

    @Autowired
    private IVentaService ventaService;
    @Autowired
    private IDetalleVentaService detalleVentaService;

    public ReporteController() {
    }

    @GetMapping("/{fechaInicial}/{fechaFinal}")
    @ResponseBody
    public List<ReporteDTO> productosVendidosEntreFechas(@PathVariable String fechaInicial, @PathVariable String fechaFinal) throws Exception {

        System.out.println("fi " + fechaInicial);
        System.out.println("ff " + fechaFinal);

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date fechaInicialDate = sdf.parse(fechaInicial);
        Date fechaFinalDate = sdf.parse(fechaFinal);
        System.out.println("fi " + fechaInicialDate);
        System.out.println("ff " + fechaFinalDate);

        List<ReporteDTO> listaVentasCliente = new ArrayList<>();
        for (DetalleVenta detalleVenta : detalleVentaService.getAllDetalleVenta()) {

            Venta venta = detalleVenta.getVenta();
            if (venta.getFechaVenta().after(fechaInicialDate) && venta.getFechaVenta().before(fechaFinalDate)) {
                ReporteDTO reporteDTO = new ReporteDTO();
                reporteDTO.setNombreProducto(detalleVenta.getProducto().getNombreProducto());
                reporteDTO.setValorUnitario(detalleVenta.getValorUnitario());
                reporteDTO.setCantidad(detalleVenta.getCantidadVenta());

                reporteDTO.setDocumentoCliente(venta.getCliente().getNombresCliente() + " " + venta.getCliente().getApellidosCliente());
                reporteDTO.setMedioPago(venta.getMedioPago().getNumeroTarjeta());
                reporteDTO.setFechaVenta(venta.getFechaVenta());

                listaVentasCliente.add(reporteDTO);
            }
        }

        return listaVentasCliente;
    }
}
