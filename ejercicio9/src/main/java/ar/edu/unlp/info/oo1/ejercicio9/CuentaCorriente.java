package ar.edu.unlp.info.oo1.ejercicio9;

public class CuentaCorriente extends Cuenta{

		double descubierto;
		
		public CuentaCorriente() {
			this.descubierto = 0;
		}
		
		public double getDescubierto() {
			return this.descubierto;
		}
		
		public void setDescubierto(double newDescubierto) {
			this.descubierto = newDescubierto;
		}
		
		public boolean puedeExtraer(double monto) {
			if((this.getSaldo() + this.getDescubierto()) >= monto) {
				return true;
			}
			return false;
		}
}
