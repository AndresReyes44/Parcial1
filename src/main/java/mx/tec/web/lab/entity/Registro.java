package mx.tec.web.lab.entity;

import java.sql.Date;

public class Registro {
	
	/**
	 * @param date
	 * @param nss
	 * @param nombreCompleto
	 * @param año
	 * @param mes
	 * @param salarioDiario
	 * @param diasTrabajados
	 * @param factorDeIntegracion
	 * @param descripcion
	 * @param deduccion
	 */
	public Registro(Date date, int nss, int nombreCompleto, int año, int mes, int salarioDiario, int diasTrabajados,
			int factorDeIntegracion, int descripcion, int deduccion) {
		this.date = date;
		this.nss = nss;
		this.nombreCompleto = nombreCompleto;
		this.año = año;
		this.mes = mes;
		this.salarioDiario = salarioDiario;
		this.diasTrabajados = diasTrabajados;
		this.factorDeIntegracion = factorDeIntegracion;
		this.descripcion = descripcion;
		this.deduccion = deduccion;
	}

	private Date date;
	private int nss;
	private int nombreCompleto;
	private int año;
	private int mes;
	private int salarioDiario;
	private int diasTrabajados;
	private int factorDeIntegracion;
	private int descripcion;
	private int deduccion;
	
	public Registro() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @return the date
	 */
	
	public Date getDate() {
		return date;
	}
	
	/**
	 * @param date the date to set
	 */
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	/**
	 * @return the nss
	 */
	
	public int getNss() {
		return nss;
	}
	
	/**
	 * @param nss the nss to set
	 */
	
	public void setNss(int nss) {
		this.nss = nss;
	}
	
	/**
	 * @return the nombreCompleto
	 */
	
	public int getNombreCompleto() {
		return nombreCompleto;
	}
	
	/**
	 * @param nombreCompleto the nombreCompleto to set
	 */
	
	public void setNombreCompleto(int nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	
	/**
	 * @return the año
	 */
	
	public int getAño() {
		return año;
	}
	
	/**
	 * @param año the año to set
	 */
	
	public void setAño(int año) {
		this.año = año;
	}
	
	/**
	 * @return the mes
	 */
	
	public int getMes() {
		return mes;
	}
	
	/**
	 * @param mes the mes to set
	 */
	
	public void setMes(int mes) {
		this.mes = mes;
	}
	
	/**
	 * @return the salarioDiario
	 */
	
	public int getSalarioDiario() {
		return salarioDiario;
	}
	
	/**
	 * @param salarioDiario the salarioDiario to set
	 */
	
	public void setSalarioDiario(int salarioDiario) {
		this.salarioDiario = salarioDiario;
	}
	
	/**
	 * @return the diasTrabajados
	 */
	
	public int getDiasTrabajados() {
		return diasTrabajados;
	}
	
	/**
	 * @param diasTrabajados the diasTrabajados to set
	 */
	
	public void setDiasTrabajados(int diasTrabajados) {
		this.diasTrabajados = diasTrabajados;
	}
	
	/**
	 * @return the factorDeIntegracion
	 */
	
	public int getFactorDeIntegracion() {
		return factorDeIntegracion;
	}
	
	/**
	 * @param factorDeIntegracion the factorDeIntegracion to set
	 */
	
	public void setFactorDeIntegracion(int factorDeIntegracion) {
		this.factorDeIntegracion = factorDeIntegracion;
	}
	
	/**
	 * @return the descripcion
	 */
	
	public int getDescripcion() {
		return descripcion;
	}
	
	/**
	 * @param descripcion the descripcion to set
	 */
	
	public void setDescripcion(int descripcion) {
		this.descripcion = descripcion;
	}
	
	/**
	 * @return the deduccion
	 */
	
	public int getDeduccion() {
		return deduccion;
	}
	
	/**
	 * @param deduccion the deduccion to set
	 */
	
	public void setDeduccion(int deduccion) {
		this.deduccion = deduccion;
	}
	
}
