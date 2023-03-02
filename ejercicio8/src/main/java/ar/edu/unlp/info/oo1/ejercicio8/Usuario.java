package ar.edu.unlp.info.oo1.ejercicio8;
import java.util.ArrayList;
import java.util.List;


public class Usuario {

	private String domicilio;
	private String nombre;
	private List<Factura> facturas = new ArrayList<Factura>();
	private List<Consumo> consumos = new ArrayList<Consumo>();
	
	public Usuario(String newNombre, String newDomicilio){
		this.domicilio = newDomicilio;
		this.nombre = newNombre;
		this.facturas = new ArrayList<Factura>();
		this.consumos = new ArrayList<Consumo>();
				}
	
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
	
	public Usuario agregarMedicion(Consumo medicion) {
		this.consumos.add(medicion);
		return this;
	}
	
	public List<Consumo> getConsumos(){
		return this.consumos;
	}
	
	public Factura facturarEnBaseA(double precioKWh) {
		Factura nuevaFactura = new Factura();
		nuevaFactura.setUsuario(this);
		Consumo ultimoConsumo = consumos.get(consumos.size() -1);
		nuevaFactura.setMontoEnergiaActiva(ultimoConsumo.getConsumoEnergiaActiva() * precioKWh);
		if(ultimoConsumo.factorDePotencia() > 0.8) {
			nuevaFactura.setDescuento(ultimoConsumo.costoEnBaseA(precioKWh) * 0.1);
		}else {
			nuevaFactura.setDescuento(0);
		}
		this.addFactura(nuevaFactura);
		return nuevaFactura;
	}
	
}
