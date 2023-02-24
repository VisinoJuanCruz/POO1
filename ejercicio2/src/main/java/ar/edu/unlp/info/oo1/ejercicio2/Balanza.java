package ar.edu.unlp.info.oo1.ejercicio2;
import java.util.ArrayList;
import java.util.List;

public class Balanza {

	
	
	private List<Producto> productos = new ArrayList<Producto>();
	
	
	public void ponerEnCero() {
			this.productos.clear();
	}
	
	public int getCantidadDeProductos() {
		return this.productos.size();
	}
	
	public double getPrecioTotal() {
		double precioTotal = 0;
		for(Producto producto: getProductos()) {
			precioTotal += producto.getPrecio();
		}
		return precioTotal;
	}
	
	public double getPesoTotal() {
		double pesoTotal = 0;
		for(Producto producto: getProductos()) {
			pesoTotal += producto.getPeso();
		}
		return pesoTotal;
	}
	
	public List<Producto> getProductos(){
		return productos;
	}
	
	public void agregarProducto(Producto producto) {
		this.productos.add(producto);
		
	}

	public Ticket emitirTicket() {
		Ticket ticket = new Ticket();
		ticket.setPesoTotal(getPesoTotal());
		ticket.setPrecioTotal(getPrecioTotal()+ ticket.impuesto());
		ticket.setCantidadDeProductos(getCantidadDeProductos());
		return ticket;
	}
}
