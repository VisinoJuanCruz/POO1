package ar.edu.unlp.info.oo1.ejercicio9_13;

import java.util.List;

public class Email {

	private String titulo;
	private String cuerpo;
	private List<Archivo> adjuntos;
	
	public void setTitulo(String unTitulo) {
		this.titulo = unTitulo;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public void setCuerpo(String unCuerpo) {
		this.cuerpo = unCuerpo;
	}
	
	public String getCuerpo() {
		return this.cuerpo;
	}
	
	public List<Archivo> getAdjuntos() {
		return this.adjuntos;
	}
	
	public int getTamaño() {
		int pesoTotal = 0;
		pesoTotal += this.getTitulo().length() + this.getCuerpo().length();
		for(Archivo archivo: adjuntos) {
			pesoTotal += archivo.getTamaño();
		}
		return pesoTotal;
	}
	
}
