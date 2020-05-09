package com.globalhitss.miingresohitss.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.globalhitss.miingresohitss.dto.ReporteDTO;
import com.globalhitss.miingresohitss.model.DetalleVenta;
import com.globalhitss.miingresohitss.model.Venta;
import com.globalhitss.miingresohitss.service.IDetalleVentaService;

@RestController
@RequestMapping("/reporte")
public class ReporteController {

	@Autowired
	private IDetalleVentaService detalleVentaService;

	public ReporteController() {
	}

	@GetMapping("/{fechaInicial}/{fechaFinal}")
	@ResponseBody
	public List<ReporteDTO> productosVendidosEntreFechas(@PathVariable String fechaInicial,
			@PathVariable String fechaFinal) throws Exception {

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Date fechaInicialDate = sdf.parse(fechaInicial);
		Date fechaFinalDate = sdf.parse(fechaFinal);

		List<ReporteDTO> listaVentasCliente = new ArrayList<>();
		for (DetalleVenta detalleVenta : detalleVentaService.getAllDetalleVenta()) {
			Venta venta = detalleVenta.getVenta();
			if (!venta.getFechaVenta().before(fechaInicialDate) && !venta.getFechaVenta().after(fechaFinalDate)) {
				ReporteDTO reporteDTO = new ReporteDTO();
				reporteDTO.setNombreProducto(detalleVenta.getProducto().getNombreProducto());
				reporteDTO.setValorUnitario(detalleVenta.getValorUnitario());
				reporteDTO.setCantidad(detalleVenta.getCantidadVenta());

				reporteDTO.setDocumentoCliente(
						venta.getCliente().getNombresCliente() + " " + venta.getCliente().getApellidosCliente());
				reporteDTO.setMedioPago(venta.getMedioPago().getNumeroTarjeta());
				reporteDTO.setFechaVenta(venta.getFechaVenta());

				listaVentasCliente.add(reporteDTO);
			}
		}

		return listaVentasCliente;
	}
}
