package ar.edu.unlp.info.oo1.ejercicio7;

public class Gerente extends EmpleadoJerarquico{

	public Gerente(String newNombre) {
		super(newNombre);
	}
	
	public double aportes() {
		return this.montoBasico() * 0.05;
	}
	
	public double montoBasico() {
		return 57000;
	}

	
	
	
}
