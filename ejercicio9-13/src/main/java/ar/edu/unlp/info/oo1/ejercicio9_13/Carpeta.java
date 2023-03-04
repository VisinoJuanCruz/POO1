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
	
	public void agregarEmail(Email unEmail) {
		this.getEmails().add(unEmail);
	}
	
	public Email buscar(String texto) {
		for(Email email: this.getEmails()) {
			if(email.getTitulo() == texto || email.getCuerpo() == texto) {
				return email;
			}
		}
		return null;
	}
	
	public void eliminarEmail(Email unEmail) {
		for(int i = 0; i < this.getEmails().size(); i++) {
			if(this.getEmails().get(i) == unEmail) {
				this.getEmails().remove(i);
			}
		}
	}
	
	
}
