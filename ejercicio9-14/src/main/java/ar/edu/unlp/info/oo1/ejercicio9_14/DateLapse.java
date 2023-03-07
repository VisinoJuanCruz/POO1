package ar.edu.unlp.info.oo1.ejercicio9_14;
import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;

public class DateLapse {

	private LocalDate from;
	private LocalDate to;
	
	public LocalDate getFrom() {
		return this.from;
	}
	
	public LocalDate getTo() {
		return this.to;
	}
	
	public int sizeInDays() {
		return (int) DAYS.between(this.getFrom(), this.getTo());
	}
	
	public boolean includesDate(LocalDate unaFecha) {
		return this.sizeInDays() > (int) DAYS.between(this.getFrom(), unaFecha);
	}
	
}
