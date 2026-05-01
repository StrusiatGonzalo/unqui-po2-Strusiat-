package trabajador;

public class Ingreso {
	private double mesDePercepcion;
	private String concepto;
	private double montoPercibido;
	
	
	public Ingreso(double mesDePercepcion,String concepto,double montoPercibido) {
		this.mesDePercepcion = mesDePercepcion;
		this.concepto = concepto;
		this.montoPercibido = montoPercibido;
	}
	
	public double getMontoImponible() {
		return this.montoPercibido;
	}
	
	public double getMontoPercibido() {
		return this.montoPercibido;
	}
	
}
