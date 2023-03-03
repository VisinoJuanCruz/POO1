package ar.edu.unlp.info.oo1.ejercicio9_13;
import java.util.List;

public class Carpeta {

	private String nombre;
	private List<Email> emails;
	
	public void setNombre(String unNombre) {
		this.nombre = unNombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	
	public List<Email> getEmails(){
		return this.emails;
	}
	
	public int getTamaño() {
		int pesoCarpeta = 0;
		for(Email email: this.getEmails()) {
			pesoCarpeta += email.getTamaño();
		}
		return pesoCarpeta;
	}
	
	
}
