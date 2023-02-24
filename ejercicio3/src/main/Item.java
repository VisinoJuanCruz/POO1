package ar.edu.unlp.info.oo1.ejercicio3;

public class Item {

	private String detalle;
	private int cantidad;
	private double costoUnitario;
	
	public String getDetalle() {
		return this.detalle;
	}
	
	public void setDetalle(String newDetalle) {
		this.detalle = newDetalle;
	}
	
	public int getCantidad() {
		return this.cantidad;
	}
	
	public void setCantidad(int newCantidad) {
		this.cantidad = newCantidad;
	}
	
	public double getCostoUnitario() {
		return this.costoUnitario;
	}
	
	public void setCostoUnitario(double newCostoUnitario) {
		this.costoUnitario = newCostoUnitario;
	}
	
	public double costo() {
		return getCostoUnitario() * getCantidad();
	}
	
	
}
