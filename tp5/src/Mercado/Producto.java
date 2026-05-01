package Mercado;

public class Producto {
	protected double precio;
	protected int stock;
	
	public Producto(double precio,int stock) {
		this.precio = precio;
		this.stock = stock;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void restarStock() {
		stock -= 1;
	}
	
	public int getStock() {
		return stock;
	}
}


