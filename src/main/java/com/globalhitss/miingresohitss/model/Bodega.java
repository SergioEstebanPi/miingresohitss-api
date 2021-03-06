package com.globalhitss.miingresohitss.model;
// Generated 7/05/2020 10:14:05 PM by Hibernate Tools 4.3.1

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import org.codehaus.jackson.annotate.JsonIgnore;

/**
 * Bodega generated by hbm2java
 */
@Entity
@Table(name = "BODEGA", schema = "MIINGRESOHITSS")
public class Bodega implements java.io.Serializable {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;
	private BigDecimal idBodega;
	private String nombreBodega;
	private String direccionBodega;
        @JsonIgnore
	private Set<Inventario> inventarios = new HashSet<Inventario>(0);

	public Bodega() {
	}

	public Bodega(BigDecimal idBodega, String nombreBodega, String direccionBodega) {
		this.idBodega = idBodega;
		this.nombreBodega = nombreBodega;
		this.direccionBodega = direccionBodega;
	}

	public Bodega(BigDecimal idBodega, String nombreBodega, String direccionBodega, Set<Inventario> inventarios) {
		this.idBodega = idBodega;
		this.nombreBodega = nombreBodega;
		this.direccionBodega = direccionBodega;
		this.inventarios = inventarios;
	}

	@Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_BODEGA")
        @SequenceGenerator(name = "ID_BODEGA", sequenceName = "ID_BODEGA", allocationSize = 1, initialValue = 1)
	@Column(name = "ID_BODEGA", unique = true, nullable = false, precision = 22, scale = 0)
	public BigDecimal getIdBodega() {
		return this.idBodega;
	}

	public void setIdBodega(BigDecimal idBodega) {
		this.idBodega = idBodega;
	}

	@Column(name = "NOMBRE_BODEGA", nullable = false, length = 80)
	public String getNombreBodega() {
		return this.nombreBodega;
	}

	public void setNombreBodega(String nombreBodega) {
		this.nombreBodega = nombreBodega;
	}

	@Column(name = "DIRECCION_BODEGA", nullable = false, length = 50)
	public String getDireccionBodega() {
		return this.direccionBodega;
	}

	public void setDireccionBodega(String direccionBodega) {
		this.direccionBodega = direccionBodega;
	}
        
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bodega")
	public Set<Inventario> getInventarios() {
		return this.inventarios;
	}

	public void setInventarios(Set<Inventario> inventarios) {
		this.inventarios = inventarios;
	}
        
}
