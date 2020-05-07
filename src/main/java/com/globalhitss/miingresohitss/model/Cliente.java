package com.globalhitss.miingresohitss.model;
// Generated 7/05/2020 01:09:22 AM by Hibernate Tools 4.3.1

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Cliente generated by hbm2java
 */
@Entity
@Table(name = "CLIENTE", schema = "MIINGRESOHITSS")
public class Cliente implements java.io.Serializable {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;
	private BigDecimal idCliente;
	private String documento;
	private String tipoDocumento;
	private String correo;
	private String contrasena;
	private String nombresCliente;
	private String apellidosCliente;
	private String fotoCliente;
	private String telefono;
	private Character genero;
	private Date fechaNacimiento;
	private String direccionCliente;
	private Set<MedioPago> medioPagos = new HashSet<MedioPago>(0);
	private Set<Venta> ventas = new HashSet<Venta>(0);

	public Cliente() {
	}

	public Cliente(BigDecimal idCliente, String documento, String tipoDocumento, String correo, String contrasena,
			String nombresCliente, String apellidosCliente) {
		this.idCliente = idCliente;
		this.documento = documento;
		this.tipoDocumento = tipoDocumento;
		this.correo = correo;
		this.contrasena = contrasena;
		this.nombresCliente = nombresCliente;
		this.apellidosCliente = apellidosCliente;
	}

	public Cliente(BigDecimal idCliente, String documento, String tipoDocumento, String correo, String contrasena,
			String nombresCliente, String apellidosCliente, String fotoCliente, String telefono, Character genero,
			Date fechaNacimiento, String direccionCliente, Set<MedioPago> medioPagos, Set<Venta> ventas) {
		this.idCliente = idCliente;
		this.documento = documento;
		this.tipoDocumento = tipoDocumento;
		this.correo = correo;
		this.contrasena = contrasena;
		this.nombresCliente = nombresCliente;
		this.apellidosCliente = apellidosCliente;
		this.fotoCliente = fotoCliente;
		this.telefono = telefono;
		this.genero = genero;
		this.fechaNacimiento = fechaNacimiento;
		this.direccionCliente = direccionCliente;
		this.medioPagos = medioPagos;
		this.ventas = ventas;
	}

	@Id

	@Column(name = "ID_CLIENTE", unique = true, nullable = false, precision = 22, scale = 0)
	public BigDecimal getIdCliente() {
		return this.idCliente;
	}

	public void setIdCliente(BigDecimal idCliente) {
		this.idCliente = idCliente;
	}

	@Column(name = "DOCUMENTO", nullable = false, length = 20)
	public String getDocumento() {
		return this.documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	@Column(name = "TIPO_DOCUMENTO", nullable = false, length = 4)
	public String getTipoDocumento() {
		return this.tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	@Column(name = "CORREO", nullable = false, length = 20)
	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Column(name = "CONTRASENA", nullable = false, length = 100)
	public String getContrasena() {
		return this.contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	@Column(name = "NOMBRES_CLIENTE", nullable = false, length = 50)
	public String getNombresCliente() {
		return this.nombresCliente;
	}

	public void setNombresCliente(String nombresCliente) {
		this.nombresCliente = nombresCliente;
	}

	@Column(name = "APELLIDOS_CLIENTE", nullable = false, length = 50)
	public String getApellidosCliente() {
		return this.apellidosCliente;
	}

	public void setApellidosCliente(String apellidosCliente) {
		this.apellidosCliente = apellidosCliente;
	}

	@Column(name = "FOTO_CLIENTE", length = 200)
	public String getFotoCliente() {
		return this.fotoCliente;
	}

	public void setFotoCliente(String fotoCliente) {
		this.fotoCliente = fotoCliente;
	}

	@Column(name = "TELEFONO", length = 15)
	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Column(name = "GENERO", length = 1)
	public Character getGenero() {
		return this.genero;
	}

	public void setGenero(Character genero) {
		this.genero = genero;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "FECHA_NACIMIENTO", length = 7)
	public Date getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Column(name = "DIRECCION_CLIENTE", length = 20)
	public String getDireccionCliente() {
		return this.direccionCliente;
	}

	public void setDireccionCliente(String direccionCliente) {
		this.direccionCliente = direccionCliente;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cliente")
	public Set<MedioPago> getMedioPagos() {
		return this.medioPagos;
	}

	public void setMedioPagos(Set<MedioPago> medioPagos) {
		this.medioPagos = medioPagos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cliente")
	public Set<Venta> getVentas() {
		return this.ventas;
	}

	public void setVentas(Set<Venta> ventas) {
		this.ventas = ventas;
	}

}
