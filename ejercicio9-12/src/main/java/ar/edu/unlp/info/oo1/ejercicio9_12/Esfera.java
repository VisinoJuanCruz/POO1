package ar.edu.unlp.info.oo1.ejercicio9_12;

public class Esfera extends Pieza{
	
	private int radio;
	
	public Esfera(String newColor, String newMaterial, int newRadio) {
		this.color = newColor;
		this.material = newMaterial;
		this.radio = newRadio;
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
	
	public double getVolumen() {
		return 4/3 * Math.PI * Math.pow(this.getRadio(), 3);
	}
	
	public double getSuperficie() {
		return 4 * Math.PI * Math.pow(this.getRadio(), 2);
	}


}
