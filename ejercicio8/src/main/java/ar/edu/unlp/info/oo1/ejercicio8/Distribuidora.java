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
	
	public double consumoTotalActiva() {
		double consumoTotalUltimoPeriodo = 0;
		for(Usuario usuario: this.usuarios) {
			consumoTotalUltimoPeriodo +=  usuario.getConsumos().get(usuario.getConsumos().size() - 1).getConsumoEnergiaActiva();
		}
		return consumoTotalUltimoPeriodo;
	}
	
	public List<Factura> facturar(){
		List<Factura> nuevasFacturas = new ArrayList<Factura>();
		for(Usuario usuario: this.usuarios) {
			nuevasFacturas.add(usuario.facturarEnBaseA(this.getPrecioKWh()));
		}
		return nuevasFacturas;
	}
	
}
