package ar.edu.unlp.info.oo1.ejercicio9_11;

public class InversionEnAcciones extends Inversion{

	private String nombre;
	private int cantidad;
	private double valorUnitario;
	
	public InversionEnAcciones(String unNombre, int unaCantidad, double unValorUnitario) {
		this.nombre = unNombre;
		this.cantidad = unaCantidad;
		this.valorUnitario = unValorUnitario;
	}
	
	public void setNombre(String unNombre) {
		this.nombre = unNombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setCantidad(int unaCantidad) {
		this.cantidad = unaCantidad;
	}
	
	public int getCantidad() {
		return this.cantidad;
	}
	
	public void setValorUnitario(double unValorUnitario) {
		this.valorUnitario = unValorUnitario;
	}
	
	public double getValorUnitario() {
		return this.valorUnitario;
	}
	
	public double valorActual() {
		return this.getCantidad() * this.getValorUnitario();
	}
	
	
}
