package ar.edu.unlp.info.oo1.ejercicio3;

public class Item {

	private String detalle;
	private int cantidad;
	private double costoUnitario;
	
	public String getDetalle() {
		return this.detalle;
	}
	
	public Item detalle(String newDetalle) {
		this.detalle = newDetalle;
		return this;
	}
	
	public int getCantidad() {
		return this.cantidad;
	}
	
	public Item cantidad(int newCantidad) {
		this.cantidad = newCantidad;
		return this;
	}
	
	public double getCostoUnitario() {
		return this.costoUnitario;
	}
	
	public Item costoUnitario(double newCostoUnitario) {
		this.costoUnitario = newCostoUnitario;
		return this;
	}
	
	public double costo() {
		return getCostoUnitario() * getCantidad();
	}
	
	
}
