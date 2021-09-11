/**
 * 
 */
package mx.tec.web.lab.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Propietario
 *
 */

@Entity
public class Empleado {
	
	@Id
	@GeneratedValue
	private int nss;
	private String nombreCompleto;
	private List<Registro> shieldRegistro;
	
	/**
	 * 
	 */
	public Empleado() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nss
	 * @param nombreCompleto
	 * @param shieldRegistro
	 */
	public Empleado(int nss, String nombreCompleto, List<Registro> shieldRegistro) {
		this.nss = nss;
		this.nombreCompleto = nombreCompleto;
		this.shieldRegistro = shieldRegistro;
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
	
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	
	/**
	 * @param nombreCompleto the nombreCompleto to set
	 */
	
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	
	/**
	 * @return the shieldRegistro
	 */
	
	public List<Registro> getShieldRegistro() {
		return shieldRegistro;
	}
	
	/**
	 * @param shieldRegistro the shieldRegistro to set
	 */
	
	public void setShieldRegistro(List<Registro> shieldRegistro) {
		this.shieldRegistro = shieldRegistro;
	}
	

}
