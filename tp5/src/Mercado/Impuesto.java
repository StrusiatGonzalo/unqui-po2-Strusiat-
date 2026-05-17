package Mercado;

public class Impuesto  extends Factura{
	private double tasaDeServicios;
	
	public Impuesto(double tasaDeServicios,AgenciaRecaudadora agencia) {
		super(agencia);
		this.tasaDeServicios = tasaDeServicios;
	}
	
	@Override
	public double montoAPagar() {
		return tasaDeServicios;
	}
}
