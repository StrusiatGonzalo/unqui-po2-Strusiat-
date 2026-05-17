package Mercado;

public class Producto implements Registrable {
	protected double precio;
	protected double stock;
	
	public Producto(double precio,double stock) {
		this.precio = precio;
		this.stock = stock;
	}
	
	public Producto(double precio) {
		this.precio = precio;
		this.stock = 1;
	}
	
	public void  registrar() {
		this.decrementarStock();
	}
	
	public double monotoAPagar(){
		return this.getPrecio();
	}

	public double getPrecio() {
		return precio;
	}
	
	public double getStock() {
		return stock;
	}
	
	public void decrementarStock() {
		if (stock == 0) {
			throw new IllegalArgumentException("el stock esta en cero"); // esto es para que tirre un error al querer bajar stock si no hay 
		} 
		stock--;
		
	}
	
	public void incrementarStock() {
		stock++;
	}
}
