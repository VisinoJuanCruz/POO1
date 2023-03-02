package ar.edu.unlp.info.oo1.ejercicio9;

public class CajaDeAhorro extends Cuenta{

	
	public boolean puedeExtraer(double monto) {
		if(this.getSaldo() >= monto*1.02) {
			return true;
		}
		return false;
	}
}
