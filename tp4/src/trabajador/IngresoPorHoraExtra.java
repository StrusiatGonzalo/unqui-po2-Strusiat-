package trabajador;

public class IngresoPorHoraExtra extends Ingreso {
	
	private double horasExtras;
	
	public IngresoPorHoraExtra(double mesDePercepcion, String concepto, double montoPercibido,double horasExtras) {
		super(mesDePercepcion, concepto, montoPercibido);
		this.horasExtras = horasExtras;
	}


	@Override 
	public double getMontoImponible() {
		return 0;
	}
	
}
