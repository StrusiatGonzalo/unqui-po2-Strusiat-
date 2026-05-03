package Mercado;

public class FacturaImpuesto extends Factura {
	double tasaDeServicio;
	
	@Override 
	public double montoAPagar() {
		return this.tasaDeServicio;
	}
}
