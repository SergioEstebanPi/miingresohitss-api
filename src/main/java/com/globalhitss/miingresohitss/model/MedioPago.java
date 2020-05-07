package com.globalhitss.miingresohitss.model;
// Generated 7/05/2020 01:09:22 AM by Hibernate Tools 4.3.1

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * MedioPago generated by hbm2java
 */
@Entity
@Table(name = "MEDIO_PAGO", schema = "MIINGRESOHITSS")
public class MedioPago implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BigDecimal idMedioPago;
	private Cliente cliente;
	private String nombreTarjeta;
	private String numeroTarjeta;
	private String validaHasta;
	private String codigoVerificacion;
	private String codigoPostal;
	private Set<Venta> ventas = new HashSet<Venta>(0);

	public MedioPago() {
	}

	public MedioPago(BigDecimal idMedioPago, Cliente cliente, String nombreTarjeta, String numeroTarjeta,
			String validaHasta, String codigoVerificacion, String codigoPostal) {
		this.idMedioPago = idMedioPago;
		this.cliente = cliente;
		this.nombreTarjeta = nombreTarjeta;
		this.numeroTarjeta = numeroTarjeta;
		this.validaHasta = validaHasta;
		this.codigoVerificacion = codigoVerificacion;
		this.codigoPostal = codigoPostal;
	}

	public MedioPago(BigDecimal idMedioPago, Cliente cliente, String nombreTarjeta, String numeroTarjeta,
			String validaHasta, String codigoVerificacion, String codigoPostal, Set<Venta> ventas) {
		this.idMedioPago = idMedioPago;
		this.cliente = cliente;
		this.nombreTarjeta = nombreTarjeta;
		this.numeroTarjeta = numeroTarjeta;
		this.validaHasta = validaHasta;
		this.codigoVerificacion = codigoVerificacion;
		this.codigoPostal = codigoPostal;
		this.ventas = ventas;
	}

	@Id

	@Column(name = "ID_MEDIO_PAGO", unique = true, nullable = false, precision = 22, scale = 0)
	public BigDecimal getIdMedioPago() {
		return this.idMedioPago;
	}

	public void setIdMedioPago(BigDecimal idMedioPago) {
		this.idMedioPago = idMedioPago;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_CLIENTE", nullable = false)
	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Column(name = "NOMBRE_TARJETA", nullable = false, length = 20)
	public String getNombreTarjeta() {
		return this.nombreTarjeta;
	}

	public void setNombreTarjeta(String nombreTarjeta) {
		this.nombreTarjeta = nombreTarjeta;
	}

	@Column(name = "NUMERO_TARJETA", nullable = false, length = 16)
	public String getNumeroTarjeta() {
		return this.numeroTarjeta;
	}

	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	@Column(name = "VALIDA_HASTA", nullable = false, length = 5)
	public String getValidaHasta() {
		return this.validaHasta;
	}

	public void setValidaHasta(String validaHasta) {
		this.validaHasta = validaHasta;
	}

	@Column(name = "CODIGO_VERIFICACION", nullable = false, length = 4)
	public String getCodigoVerificacion() {
		return this.codigoVerificacion;
	}

	public void setCodigoVerificacion(String codigoVerificacion) {
		this.codigoVerificacion = codigoVerificacion;
	}

	@Column(name = "CODIGO_POSTAL", nullable = false, length = 20)
	public String getCodigoPostal() {
		return this.codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "medioPago")
	public Set<Venta> getVentas() {
		return this.ventas;
	}

	public void setVentas(Set<Venta> ventas) {
		this.ventas = ventas;
	}

}
