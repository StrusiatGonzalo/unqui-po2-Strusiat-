package Mercado;

import java.util.ArrayList;
import java.util.List;


public class Caja {
	private double totalAPagar;
	private Factura factura;
	
	public Factura getFactura() {
		return this.factura;
	}
	
	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	
	public void registrarProducto(Producto producto) {
		totalAPagar += producto.getPrecio();
		producto.restarStock();
	}
	
	public double totalAPagar() {
		return totalAPagar;
	}
}
