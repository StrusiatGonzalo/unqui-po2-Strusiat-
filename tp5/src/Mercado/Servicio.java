package Mercado;

public class Servicio extends Factura {
	private double costoPorUnidad;
	private double cantidadesConsumidas;
	
	
	public Servicio(double costoPorUnidad,double cantidadesConsumidas,AgenciaRecaudadora agencia) {
		super(agencia);
		this.cantidadesConsumidas = cantidadesConsumidas;
		this.costoPorUnidad = costoPorUnidad;
	}
	
	
	@Override
	public void registrar() {
		
	}
	
	@Override
	public double montoAPagar() {
		return costoPorUnidad * cantidadesConsumidas;
	}
}
