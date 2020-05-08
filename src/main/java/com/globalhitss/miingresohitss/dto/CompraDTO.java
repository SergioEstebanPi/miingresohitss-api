package com.globalhitss.miingresohitss.dto;
// Generated 7/05/2020 10:14:05 PM by Hibernate Tools 4.3.1

import java.math.BigDecimal;

/**
 * DetalleVenta generated by hbm2java
 */
public class CompraDTO implements java.io.Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private BigDecimal idCliente;
    private BigDecimal idMedioPago;
    private BigDecimal idProducto;
    private BigDecimal cantidad;

    public CompraDTO() {
    }

    public CompraDTO(BigDecimal idCliente, BigDecimal idMedioPago, BigDecimal idProducto, BigDecimal cantidad) {
        this.idCliente = idCliente;
        this.idMedioPago = idMedioPago;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
    }

    public BigDecimal getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(BigDecimal idCliente) {
        this.idCliente = idCliente;
    }

    public BigDecimal getIdMedioPago() {
        return idMedioPago;
    }

    public void setIdMedioPago(BigDecimal idMedioPago) {
        this.idMedioPago = idMedioPago;
    }

    public BigDecimal getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(BigDecimal idProducto) {
        this.idProducto = idProducto;
    }

    public BigDecimal getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }

}
