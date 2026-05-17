package Mercado;

import java.util.ArrayList;
import java.util.List;

public class Caja {
	private List<Registrable> elementos = new ArrayList<Registrable>(); 
	
	
	public double montoTotal() {
		return elementos.stream()
				.mapToDouble(e -> e.montoAPagar())
				.sum();
	}
	
	public void addProducto(Registrable elemento) {
		elemento.registrar();
		elementos.add(elemento);

	}
}
