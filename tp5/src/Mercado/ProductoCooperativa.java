package Mercado;

public class ProductoCooperativa extends Producto {
	protected double porcentaje;
	
	public ProductoCooperativa(double precio, int stock, double porcentaje) {
		super(precio, stock);
		this.porcentaje = porcentaje;
	}

	@Override
	public double getPrecio() {
		return super.getPrecio() * (1 - porcentaje / 100);
	}
}
