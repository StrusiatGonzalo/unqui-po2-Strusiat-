package Mercado;

public class FacturaServicio extends Factura {
	private double unidadesConsumidas;
	private double unidadesConsumidasEnPF;
	
	@Override 
	public double montoAPagar() {
		return this.unidadesConsumidas * this.unidadesConsumidasEnPF;
	}
}
