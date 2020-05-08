package com.globalhitss.miingresohitss.dto;
// Generated 7/05/2020 10:14:05 PM by Hibernate Tools 4.3.1

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * MedioPago generated by hbm2java
 */
public class MedioPagoDTO implements java.io.Serializable {

        /**
         *
         */
        private static final long serialVersionUID = 1L;
        private BigDecimal idMedioPago;
        private ClienteDTO cliente;
        private String nombreTarjeta;
        private String numeroTarjeta;
        private String validaHasta;
        private String codigoVerificacion;
        private String codigoPostal;
        private Set<VentaDTO> ventas = new HashSet<VentaDTO>(0);

        public MedioPagoDTO() {
        }

        public MedioPagoDTO(BigDecimal idMedioPago, ClienteDTO cliente, String nombreTarjeta, String numeroTarjeta,
                String validaHasta, String codigoVerificacion, String codigoPostal) {
            this.idMedioPago = idMedioPago;
            this.cliente = cliente;
            this.nombreTarjeta = nombreTarjeta;
            this.numeroTarjeta = numeroTarjeta;
            this.validaHasta = validaHasta;
            this.codigoVerificacion = codigoVerificacion;
            this.codigoPostal = codigoPostal;
        }

        public MedioPagoDTO(BigDecimal idMedioPago, ClienteDTO cliente, String nombreTarjeta, String numeroTarjeta,
                String validaHasta, String codigoVerificacion, String codigoPostal, Set<VentaDTO> ventas) {
            this.idMedioPago = idMedioPago;
            this.cliente = cliente;
            this.nombreTarjeta = nombreTarjeta;
            this.numeroTarjeta = numeroTarjeta;
            this.validaHasta = validaHasta;
            this.codigoVerificacion = codigoVerificacion;
            this.codigoPostal = codigoPostal;
            this.ventas = ventas;
        }

        public BigDecimal getIdMedioPago() {
            return this.idMedioPago;
        }

        public void setIdMedioPago(BigDecimal idMedioPago) {
            this.idMedioPago = idMedioPago;
        }

        public ClienteDTO getCliente() {
            return this.cliente;
        }

        public void setCliente(ClienteDTO cliente) {
            this.cliente = cliente;
        }

        public String getNombreTarjeta() {
            return this.nombreTarjeta;
        }

        public void setNombreTarjeta(String nombreTarjeta) {
            this.nombreTarjeta = nombreTarjeta;
        }

        public String getNumeroTarjeta() {
            return this.numeroTarjeta;
        }

        public void setNumeroTarjeta(String numeroTarjeta) {
            this.numeroTarjeta = numeroTarjeta;
        }

        public String getValidaHasta() {
            return this.validaHasta;
        }

        public void setValidaHasta(String validaHasta) {
            this.validaHasta = validaHasta;
        }

        public String getCodigoVerificacion() {
            return this.codigoVerificacion;
        }

        public void setCodigoVerificacion(String codigoVerificacion) {
            this.codigoVerificacion = codigoVerificacion;
        }

        public String getCodigoPostal() {
            return this.codigoPostal;
        }

        public void setCodigoPostal(String codigoPostal) {
            this.codigoPostal = codigoPostal;
        }

        public Set<VentaDTO> getVentas() {
            return this.ventas;
        }

        public void setVentas(Set<VentaDTO> ventas) {
            this.ventas = ventas;
        }

}
