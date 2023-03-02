package ar.edu.unlp.info.oo1.ejercicio8;
import java.time.LocalDate;

public class Factura {

	private double montoEnergiaActiva;
	private double descuento;
	private LocalDate fecha = LocalDate.now();
	private Usuario usuario;
	
	
	public Factura setUsuario(Usuario newUsuario) {
		this.usuario = newUsuario;
		return this;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	
	public Factura setMontoEnergiaActiva(double newMontoEnergiaActiva) {
		this.montoEnergiaActiva = newMontoEnergiaActiva;
		return this;
	}
	
	public double getMontoEnergiaActiva() {
		return this.montoEnergiaActiva;
	}
	
	public LocalDate getFecha() {
		return this.fecha;
	}
	
	public Factura setDescuento(double newDescuento) {
		this.descuento = newDescuento;
		return this;
	}
	
	public double getDescuento() {
		return this.descuento;
	}
	
	public double montoTotal() {
		return this.getMontoEnergiaActiva() - this.getDescuento();
	}
	
	
}
