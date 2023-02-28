package ar.edu.unlp.info.oo1.ejercicio7;

public class EmpleadoJerarquico extends Empleado{

	public EmpleadoJerarquico(String newNombre) {
		super(newNombre);
	}

	public double bonoPorCategoria() {
		return 8000;
	}
	
	public double montoBasico() {
		return 45000;
	}
	
	public double sueldoBasico() {
		return super.sueldoBasico() + this.bonoPorCategoria();
	}
	
	
}
