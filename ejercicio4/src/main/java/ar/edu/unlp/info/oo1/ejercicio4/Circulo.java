package ar.edu.unlp.info.oo1.ejercicio4;

public class Circulo extends Figura2D{
	
	double radio;
	
	
	public double getRadio() {
		return Math.round(this.radio);
	}
	
	public Circulo setRadio(float newRadio) {
		this.radio = newRadio;
		return this;
	}
	
	
	public double getDiametro() {
		return Math.round(getRadio() * 2);
	}
	
	public Circulo setDiametro(float newDiametro) {
		this.radio = newDiametro / 2;
		return this;
	}
	
	public double getPerimetro() {
		return Math.PI * getDiametro();
	}
	
	public double getArea() {
		return Math.PI * (getRadio()* getRadio());
	}
	
	
	
}
