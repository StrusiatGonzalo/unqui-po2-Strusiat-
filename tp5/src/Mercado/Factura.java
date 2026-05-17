package Mercado;

abstract class Factura implements Registrable {
	private AgenciaRecaudadora agenciaRecaudadora;
	
	public Factura(AgenciaRecaudadora agencia) {
		this.agenciaRecaudadora = agencia;
	}
	
	public void registrar() {
		agenciaRecaudadora.registrarPago(this);
	}
	
	abstract public double montoAPagar();
	
}
