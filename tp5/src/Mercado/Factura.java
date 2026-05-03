package Mercado;

abstract class Factura implements Agencia {
	
	@Override 
	public void registrarPago(Factura factura) {
		
	}
	
	abstract double montoAPagar();
}


