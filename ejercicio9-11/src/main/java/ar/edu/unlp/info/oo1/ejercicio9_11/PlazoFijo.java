package ar.edu.unlp.info.oo1.ejercicio9_11;
import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;

public class PlazoFijo extends Inversion{

	private LocalDate fechaDeConstitucion;
	private double montoDepositado;
	private double porcentajeDelInteresDiario;
	
	
	public PlazoFijo(LocalDate unaFechaDeConstitucion, double unMontoDepositado, double unPorcentajeDelInteresDiario) {
		this.fechaDeConstitucion = unaFechaDeConstitucion;
		this.montoDepositado = unMontoDepositado;
		this.porcentajeDelInteresDiario = unPorcentajeDelInteresDiario;
	}
	
	public LocalDate getFechaDeConstitucion() {
		return this.fechaDeConstitucion;
	}
	
	public double getMontoDepositado() {
		return this.montoDepositado;
	}
	
	public double getPorcentajeDelInteresDiario() {
		return this.porcentajeDelInteresDiario;
	}
	
	public double valorActual() {
		return this.getMontoDepositado() * this.getPorcentajeDelInteresDiario() * (DAYS.between(this.getFechaDeConstitucion(), LocalDate.now())) ; 
	}
}
