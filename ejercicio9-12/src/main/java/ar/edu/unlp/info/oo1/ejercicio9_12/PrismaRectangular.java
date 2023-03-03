package ar.edu.unlp.info.oo1.ejercicio9_12;

public class PrismaRectangular extends Pieza{

	int ladoMayor;
	int ladoMenor;
	int altura;
	
	public PrismaRectangular(String newColor, String newMaterial, int newLadoMayor, int newLadoMenor, int newAltura) {
		this.color = newColor;
		this.material = newMaterial;
		this.ladoMayor = newLadoMayor;
		this.ladoMenor = newLadoMenor;
		this.altura = newAltura;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setColor(String newColor) {
		this.color = newColor;
	}
	
	public String getMaterial() {
		return this.material;
	}
	
	public void setMaterial(String newMaterial) {
		this.material = newMaterial;
	}
	
	public int getLadoMayor() {
		return this.ladoMayor;
	}
	
	public void setLadoMayor(int newLadoMayor) {
		this.ladoMayor = newLadoMayor;
	}
	
	public int getLadoMenor() {
		return this.ladoMenor;
	}
	
	public void setLadoMenor(int newLadoMenor) {
		this.ladoMenor = newLadoMenor;
	}
	
	public int getAltura() {
		return this.altura;
	}
	
	public void setAltura(int newAltura) {
		this.altura = newAltura;
	}
	
	public double getVolumen() {
		return this.getLadoMayor() * this.getLadoMenor() * this.getAltura()	;
	}
	
	public double getSuperficie() {
		return 2 * (this.getLadoMayor() * this.getLadoMenor() + this.getLadoMayor() * this.getAltura() + this.getLadoMenor() * this.getAltura());
	}
	
	
}
