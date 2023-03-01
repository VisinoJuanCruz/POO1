package ar.edu.unlp.info.oo1.ejercicio8;
import java.util.ArrayList;
import java.util.List;


public class Usuario {

	private String domicilio;
	private String nombre;
	private List<Factura> facturas = new ArrayList<Factura>();
	private List<Consumo> consumos = new ArrayList<Consumo>();
	
	
	public Usuario setDomicilio(String newDomicilio) {
		this.domicilio = newDomicilio;
		return this;
	}
	
	public String getDomicilio() {
		return this.domicilio;
	}
	
	public Usuario setNombre(String newNombre) {
		this.nombre = newNombre;
		return this;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public Usuario addFactura(Factura newFactura) {
		this.facturas.add(newFactura);
		return this;
	}
	
	public List<Factura> getFacturas(){
		return this.facturas;
	}
	
	public Usuario addConsumo(Consumo newConsumo) {
		this.consumos.add(newConsumo);
		return this;
	}
	
	public List<Consumo> getConsumos(){
		return this.consumos;
	}
	
}
