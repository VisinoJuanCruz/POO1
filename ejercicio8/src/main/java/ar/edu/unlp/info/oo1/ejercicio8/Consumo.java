package ar.edu.unlp.info.oo1.ejercicio8;
import java.time.LocalDate;

public class Consumo {

	private LocalDate fecha = LocalDate.now();
	private double consumoEnergiaActiva;
	private double consumoEnergiaReactiva;
	
	public Consumo setConsumoEnergiaActiva(double newConsumoEnergiaActiva) {
		this.consumoEnergiaActiva = newConsumoEnergiaActiva;
		return this;
	}
	
	public double getConsumoEnergiaActiva() {
		return this.consumoEnergiaActiva;
	}
	
	public Consumo setConsumoEnergiaReactiva(double newConsumoEnergiaReactiva) {
		this.consumoEnergiaReactiva = newConsumoEnergiaReactiva;
		return this;
	}
	
	public double getConsumoEnergiaReactiva() {
		return this.consumoEnergiaReactiva;
	}
	
	public double costoEnBaseA(double precioKWh) {
		return this.getConsumoEnergiaActiva() * precioKWh;
	}
	
	public double factorDePotencia() {
		return this.getConsumoEnergiaActiva() / (Math.sqrt( Math.pow(getConsumoEnergiaActiva(),2)+ Math.pow(getConsumoEnergiaReactiva(), 2)));
	}
	
}
