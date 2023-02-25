package ar.edu.unlp.info.oo1.ejercicio5;
import java.time.LocalDate;

public class Mamifero {

	private String identificador;
	private String especie;
	private LocalDate fechaNacimiento;
	private Mamifero padre = null;
	private Mamifero madre = null;
	
	public Mamifero() {
		this.padre = null;
		this.madre = null;
	}
	
	
	public Mamifero(String newIdentificador) {
		this.identificador = newIdentificador;	
		this.padre = null;
		this.madre = null;
	}
	
	public Mamifero setIdentificador(String newIdentificador) {
		this.identificador = newIdentificador;
		return this;
	}
	public String getIdentificador() {
		return this.identificador;
	}
	
	public Mamifero setEspecie(String newEspecie) {
		this.especie = newEspecie;
		return this;
	}
	
	public String getEspecie() {
		return this.especie;
	}
	
	public LocalDate getFechaNacimiento() {
		return this.fechaNacimiento;
	}
	
	public Mamifero setPadre(Mamifero newPadre) {
		this.padre = newPadre;
		return this;
	}
	
	public Mamifero getPadre() {
		if(this.padre == null) {
			return null;
		}else {
			return this.padre;	
		}
			
	}
	
	public Mamifero setMadre(Mamifero newMadre) {
		this.madre = newMadre;
		return this;
	}
	
	public Mamifero getMadre() {
		if(this.madre == null) {
			return null;
		}else {
			return this.madre;	
		}
		
	}
	
	public Mamifero getAbueloMaterno() {
		if(getMadre() == null) {
			return null;
		}else {
			return getMadre().getPadre();
		}
		
	}
	
	public Mamifero getAbuelaMaterna() {
		if(getMadre() == null) {
			return null;
		}else {
			return getMadre().getMadre();
		}
	}
	
	public Mamifero getAbueloPaterno() {
		if(getPadre() == null) {
			return null;
		}else {
			return getPadre().getPadre();
		}
		
	}
	
	public Mamifero getAbuelaPaterna() {
		if(getPadre() == null) {
			return null;
		}else {
			return getPadre().getMadre();
		}
		
	}
	
	
}
