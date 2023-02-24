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
	
	public void setCliente(String newCliente) {
		this.cliente = newCliente;
	}
	
	
	
	public void agregarItem(Item item) {
		this.items.add(item);
	}
	
}
