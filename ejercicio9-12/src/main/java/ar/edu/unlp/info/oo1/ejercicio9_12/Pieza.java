package ar.edu.unlp.info.oo1.ejercicio9_12;

public abstract class Pieza {
	String material;
	String color;
	
	abstract String getMaterial();
	abstract String getColor();
	abstract double getVolumen();
	abstract double getSuperficie();
}
