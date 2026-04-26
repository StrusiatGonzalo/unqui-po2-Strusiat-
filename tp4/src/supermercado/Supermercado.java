package supermercado;


import java.util.ArrayList;
import java.util.List;

public class Supermercado {
	String nombre;
	String direccion;
	List<Producto> productos = new ArrayList<>();
	
	public Supermercado(String nombre,String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	public double getCantidadDeProductos() {
		 return productos.size();
	}
	
	
	public void agregarProducto(Producto producto) {
		this.productos.add(producto);
	}
	
	public double getPrecioTotal() {
		double precioTotal = productos.stream()
				.mapToDouble(Producto::getPrecio)
				.sum();
		
		return precioTotal;	
	}
}


