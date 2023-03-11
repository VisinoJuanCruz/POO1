package ar.edu.unlp.info.oo1.ejercicio9_15;

import java.util.List;

public class OOBnB {

	private List<Propiedad> propiedades;
	private List<Usuario> usuarios;
	
	
	public List<Propiedad> getPropiedades(){
		return this.propiedades;
	}
	
	public List<Usuario> getUsuarios(){
		return this.usuarios;
	}
	
	public void registrarPropiedad(Propiedad unaPropiedad) {
		this.propiedades.add(unaPropiedad);
		unaPropiedad.getDueño().agregarPropiedadAlquilada(unaPropiedad);
	}
}
