package ar.edu.unlp.info.oo1.ejercicio2;
import java.time.LocalDate;

public class Ticket {

	private LocalDate fecha = LocalDate.now();
	private int cantidadDeProductos;
	private double pesoTotal;
	private double precioTotal;
	
	
	public int getCantidadDeProductos() {
		return this.cantidadDeProductos;
	}
	
	public void setCantidadDeProductos(int cantidadDeProductos) {
		this.cantidadDeProductos = cantidadDeProductos;
	}
	
	public LocalDate getFecha() {
		return this.fecha;
	}
	
	public double getPesoTotal() {
		return this.pesoTotal;
	}
	
	public void setPesoTotal(double peso) {
		this.pesoTotal = pesoTotal;
	}
	
	public double getPrecioTotal() {
		return this.precioTotal;
	}
	
	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}
	
	public double impuesto() {
		return this.precioTotal * 0.21;
	}
	
}
