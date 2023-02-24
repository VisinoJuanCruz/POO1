package ar.edu.unlp.info.oo1.ejercicio3;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Presupuesto {

	private LocalDate fecha = LocalDate.now();
	private String cliente;
	private List<Item> items = new ArrayList<Item>();
	
	
	
	public String getCliente() {
		return this.cliente;
	}
	
	public Presupuesto cliente(String newCliente) {
		this.cliente = newCliente;
		return this;
	}
	
	
	
	public void agregarItem(Item item) {
		this.items.add(item);
	}
	
	public double calcularTotal() {
		double total = 0;
		for(Item item: items) {
			total += item.costo();
		}
		return total;
	}
	
}
