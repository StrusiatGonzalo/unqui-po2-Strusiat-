package Mercado;

import java.util.ArrayList;
import java.util.List;


public class Caja {
	double totalAPagar;

	
	public void registrarProducto(Producto producto) {
		totalAPagar += producto.getPrecio();
		producto.restarStock();
	}
	
	public double totalAPagar() {
		return totalAPagar;
	}
}
