package ar.edu.unlp.info.oo1.ejercicio7;

public class Empleado {

	String nombre;
	
	public Empleado(String newNombre) {
		this.nombre = newNombre;
		
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public Empleado setNombre(String newNombre) {
		this.nombre = newNombre;
		return this;
	}
	
	public double montoBasico() {
		return 35000;
	}
	
	public double aportes() {
		return 13500;
	}
	
	public double sueldoBasico() {
		return this.montoBasico() + this.aportes();
	}
	
	
}
