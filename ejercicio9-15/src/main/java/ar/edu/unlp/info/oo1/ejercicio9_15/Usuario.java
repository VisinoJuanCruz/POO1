package ar.edu.unlp.info.oo1.ejercicio9_15;
import java.util.List;

public class Usuario {

	private String nombre;
	private String direccion;
	private int dni;
	private List<Propiedad> propiedadesEnAlquiler;
	private List<Propiedad> propiedadesReservadas;
	private List<Propiedad> propiedadesAlquiladas;
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String unNombre) {
		this.nombre = unNombre;
	}
	
	public String getDireccion() {
		return this.direccion;
	}
	
	public void setDireccion(String unaDireccion) {
		this.direccion = unaDireccion;
	}
	
	public int getDni() {
		return this.dni;
	}
	
	public void setDni(int unDni) {
		this.dni = unDni;
	}
	
	public List<Propiedad> getPropiedadesEnAlquiler(){
		return this.propiedadesEnAlquiler;
	}
	public List<Propiedad> getPropiedadesReservadas(){
		return this.propiedadesReservadas;
	}
	public List<Propiedad> getPropiedadesAlquiladas(){
		return this.propiedadesAlquiladas;
	}
	
	public void agregarPropiedadEnAlquiler(Propiedad unaPropiedad) {
		this.getPropiedadesEnAlquiler().add(unaPropiedad);
	}
	
	public void agregarPropiedadReservada(Propiedad unaPropiedad) {
		this.getPropiedadesReservadas().add(unaPropiedad);
	}
	public void agregarPropiedadAlquilada(Propiedad unaPropiedad) {
		this.getPropiedadesAlquiladas().add(unaPropiedad);
	}
	
	
}
