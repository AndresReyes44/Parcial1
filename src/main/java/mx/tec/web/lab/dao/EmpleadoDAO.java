/**
 * 
 */
package mx.tec.web.lab.dao;

import java.util.List;

import mx.tec.web.lab.entity.Registro;

/**
 * @author Propietario
 *
 */
public interface EmpleadoDAO implements ProductDAO{


	Registro saveRegistro(Registro newRegistro);
	
	List<Registro> getRegistro();
}
