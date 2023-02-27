package ar.edu.unlp.info.oo1.ejercicio6;
import java.util.ArrayList;
import java.util.List;

public class Farola {

	private boolean on = false;
	private List<Farola> Neighbors = new ArrayList<Farola>();
	
	public void pairWithNeighbor(Farola otraFarola) {
		this.Neighbors.add(otraFarola);
		otraFarola.Neighbors.add(this);
	}
	
	public List<Farola> getNeighbors(){
		return this.Neighbors;
	}
	
	public void turnOn() {
		if(!isOn()) {
			this.on = true;
			for(Farola farola: getNeighbors()) {
				if(!farola.isOn()) {
					farola.turnOn();
				}
			}
		}
	}
	
	public void turnOff() {
		if(isOn()) {
			this.on = false;
			for(Farola farola: getNeighbors()) {
				if(farola.isOn()) {
					farola.turnOff();
				}
				
			}
		}
	}
	
	public boolean isOn() {
		return this.on;
	}
	
}
