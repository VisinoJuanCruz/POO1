package ar.edu.unlp.info.oo1.ejercicio9_13;
import java.util.List;

public class ClienteDeCorreo {

	private List<Carpeta> carpetas;
	private Carpeta inbox;
	
	
	public void recibir (Email unEmail) {
		inbox.agregarEmail(unEmail);
	}
	
	public List<Carpeta> getCarpetas(){
		return this.carpetas;
	}
	
	public Carpeta getInbox() {
		return this.inbox;
	}
	
	public Email buscar(String texto) {
		Email emailBuscado;
		emailBuscado = this.getInbox().buscar(texto);
		if (emailBuscado == null) {
			for(Carpeta carpeta: this.getCarpetas()) {
				emailBuscado = carpeta.buscar(texto);
				if(emailBuscado != null) {
					return emailBuscado;
				}
			}
		}
		return emailBuscado;
	}
	
	public void mover(Email unEmail, Carpeta carpetaOrigen, Carpeta carpetaDestino) {
		for(Carpeta carpeta: this.getCarpetas()) {
			if(carpeta.getNombre() == carpetaDestino.getNombre()) {
				carpetaDestino.agregarEmail(unEmail);
			}
			if(carpeta.getNombre() == carpetaOrigen.getNombre()) {
				carpetaOrigen.eliminarEmail(unEmail);
			}
		}
	}
	
	public int espacioOcupado() {
		int espacioTotal =0;
		for(Carpeta carpeta: this.getCarpetas()) {
			espacioTotal += carpeta.getTamaño();
		}
		return espacioTotal += this.getInbox().getTamaño();
	}
	
	
}
