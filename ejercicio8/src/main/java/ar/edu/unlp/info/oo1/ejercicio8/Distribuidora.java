package ar.edu.unlp.info.oo1.ejercicio8;
import java.util.ArrayList;
import java.util.List;


public class Distribuidora {

	private double precioKWh;
	private List<Usuario> usuarios = new ArrayList<Usuario>();
	
	public Distribuidora setPrecioKWh(double newPrecioKWh) {
		this.precioKWh = newPrecioKWh;
		return this;
	}
	
	public double getPrecioKWh() {
		return this.precioKWh;
	}
	
	public List<Usuario> getUsuarios(){
		return this.usuarios;
	}
	
	public void agregarUsuario(Usuario newUsuario){
		this.usuarios.add(newUsuario);
	}
	
}
