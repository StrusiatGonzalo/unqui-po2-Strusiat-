package supermercado;



public class Producto {
	private String nombre;
	private double precio;
	private boolean esPrecioCuidado;
	
	public Producto(String nombre,double precio,boolean esCuidado) {
		this.nombre = nombre;
		this.precio = precio;
		this.esPrecioCuidado = esCuidado;
	}
	
	public Producto(String nombre,double precio) {
		this.nombre = nombre;
		this.precio = precio;
		this.esPrecioCuidado = false;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public double getPrecio() {
		return this.precio;
	}
	
	public boolean esPrecioCuidado() {
		return this.esPrecioCuidado;
	}
	
	public void aumentarPrecio(double valor) {
		this.precio += valor;
	}
}


