package ar.edu.unlp.info.oo1.ejercicio2;

public class Balanza {

	private int cantidadDeProductos = 0;
	private double precioTotal = 0;
	private double pesoTotal = 0;
	
	public void ponerEnCero() {
		this.cantidadDeProductos = 0;
		this.precioTotal = 0;
		this.pesoTotal = 0;
	}
	
	public int getCantidadDeProductos() {
		return this.cantidadDeProductos;
	}
	
	public double getPrecioTotal() {
		return this.precioTotal;
	}
	
	public double getPesoTotal() {
		return this.pesoTotal;
	}
	
	public void agregarProducto(Producto producto) {
		this.cantidadDeProductos++;
		this.precioTotal = getPrecioTotal() + producto.getPeso() * producto.getPrecioPorKilo();
		this.pesoTotal = getPesoTotal() + producto.getPeso();
	}

	public Ticket emitirTicket() {
		Ticket ticket = new Ticket();
		return ticket;
	}
}
