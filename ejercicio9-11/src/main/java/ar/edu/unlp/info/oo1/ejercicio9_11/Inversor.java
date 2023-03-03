package ar.edu.unlp.info.oo1.ejercicio9_11;
import java.util.ArrayList;
import java.util.List;

public class Inversor {

	private String nombre;
	private List<Inversion> inversiones;
	
	public Inversor(String unNombre) {
		this.nombre = unNombre;
		this.inversiones = new ArrayList<Inversion>();
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String unNombre) {
		this.nombre = unNombre;
	}
	
	public List<Inversion> getInversiones(){
		return this.inversiones;
	}
	
	public double valorTotal() {
		double total = 0;
		for(Inversion inversion: this.getInversiones()) {
			total += inversion.valorActual();
		}
		return total;
	}
	
}
