package ar.edu.unlp.info.oo1.ejercicio9_12;

import java.util.List;


public class ReporteDeConstruccion {

	private List<Pieza> piezas;
	

	public List<Pieza> getPiezas(){
		return this.piezas;
	}
	
	public void addPieza(Pieza newPieza) {
		this.piezas.add(newPieza);
	}
	
	public double volumenDeMaterial(String unMaterial) {
		double volumenTotal = 0;
		for(Pieza pieza: this.getPiezas()) {
			if(pieza.getMaterial() == unMaterial) {
				volumenTotal += pieza.getVolumen();
			}
		}		
		return volumenTotal;
	}
	
	public double superficieDeColor(String unColor) {
		double superficieTotal = 0;
		for(Pieza pieza: this.getPiezas()) {
			if(pieza.getColor() == unColor) {
				superficieTotal += pieza.getSuperficie();
			}
		}
		return superficieTotal;
	}
	
}
