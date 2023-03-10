package ar.edu.unlp.info.oo1.ejercicio9_15;

public class Propiedad {

	private String nombre;
	private String descripcion;
	private double precioPorNoche;
	private String direccion;
	private DateLapse fechaOcupada;
	private Usuario dueño;
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String unNombre) {
		this.nombre = unNombre;
	}
	
	public String getDescripcion() {
		return this.descripcion;
	}
	
	public void setDescripcion(String unaDescripcion) {
		this.descripcion = unaDescripcion;
	}
	
	public double getPrecioPorNoche() {
		return this.precioPorNoche;
	}
	
	public void setPrecioPorNoche(double unPrecioPorNoche) {
		this.precioPorNoche = unPrecioPorNoche;
	}
	
	public String getDireccion() {
		return this.direccion;
	}
	
	public void setDireccion(String unaDireccion) {
		this.direccion = unaDireccion;
	}
	
	public DateLapse getFechaOcupada() {
		return this.fechaOcupada;
	}
	
	public void setFechaOcupada(DateLapse unaFechaOcupada) {
		this.fechaOcupada = unaFechaOcupada;
	}
	
	public Usuario getDueño() {
		return this.dueño;
	}
	
	public void setDueño(Usuario unDueño) {
		this.dueño = unDueño;
	}
	
}
