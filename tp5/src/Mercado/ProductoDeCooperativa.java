package Mercado;

public class ProductoDeCooperativa extends Producto {
	private double porcentaje;


	
	public ProductoDeCooperativa(double precio,double porcentaje) {
		super(precio);
		this.porcentaje = porcentaje;
		
	}
	
	public ProductoDeCooperativa(double precio,double stock,double porcentaje) {
		super(precio,stock);
		this.porcentaje = porcentaje;
	}
	
	public double getPrecio() {
		return this.precio * (1 - porcentaje / 100);
	}
	
	public double getStock() {
		return stock;
	}
}
