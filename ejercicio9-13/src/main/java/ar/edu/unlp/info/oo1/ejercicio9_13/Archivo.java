package ar.edu.unlp.info.oo1.ejercicio9_13;

public class Archivo {
	
	private String nombre;
	
	public Archivo(String unNombre) {
		this.nombre = unNombre;
	}
	
	public void setNombre(String unNombre) {
		this.nombre = unNombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public int getTamaño() {
		return this.nombre.length();
	}
}
