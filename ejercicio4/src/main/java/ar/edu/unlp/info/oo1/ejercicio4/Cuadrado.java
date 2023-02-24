package ar.edu.unlp.info.oo1.ejercicio4;

public class Cuadrado extends Figura2D{

	double lado;
	
	public double getLado() {
		return this.lado;
	}
	
	public Cuadrado setLado(float newLado) {
		this.lado = newLado;
		return this;
	}
	
	public double getPerimetro() {
		return getLado() * 4;
	}
	
	public double getArea() {
		return Math.pow(getLado(), 2);
	}
}
