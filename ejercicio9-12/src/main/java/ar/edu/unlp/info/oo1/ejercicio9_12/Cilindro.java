package ar.edu.unlp.info.oo1.ejercicio9_12;

public class Cilindro extends Pieza{

	private int radio;
	private int altura;
	
	public Cilindro(String newColor, String newMaterial, int newRadio, int newAltura) {
		this.color = newColor;
		this.material = newMaterial;
		this.radio = newRadio;
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
	
	public int getRadio() {
		return this.radio;
	}
	
	public void setRadio(int newRadio) {
		this.radio = newRadio;
	}
	
	public int getAltura() {
		return this.altura;
	}
	
	public void setAltura(int newAltura) {
		this.altura = newAltura;
	}
	
	public double getVolumen() {
		return Math.PI * Math.pow(this.getRadio(), 2) * this.getAltura();
	}
	
	public double getSuperficie() {
		return 2 * Math.PI * this.getRadio() * this.getAltura() + 2 * Math.PI * Math.pow(this.getRadio(), 2);
	}
	
}
