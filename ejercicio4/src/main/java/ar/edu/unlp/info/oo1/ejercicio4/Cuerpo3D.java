package ar.edu.unlp.info.oo1.ejercicio4;

public class Cuerpo3D {

	Figura2D caraBasal;
	double altura;
	double radio;
	
	public Cuerpo3D setAltura(double newAltura) {
		this.altura = newAltura;
		return this;
	}
	
	public double getAltura() {
		return this.altura;
	}
	
	public Cuerpo3D setCaraBasal(Figura2D newCaraBasal) {
		this.caraBasal = newCaraBasal;
		return this;
	}
	
	public Figura2D getCaraBasal() {
		return this.caraBasal;
	}
	
	public double getVolumen() {
		return getCaraBasal().getArea() * getAltura();
	}
	
	public double getSuperficieExterior() {
		return 2 * getCaraBasal().getArea() + getCaraBasal().getPerimetro()* getAltura();
		}
	
	
}
