package supermercado;

public class ProductoPrimeraNecesidad extends Producto {
	double porcentaje;
	
	public ProductoPrimeraNecesidad(String nombre, double precio,double porcentaje) {
		super(nombre, precio);
		this.porcentaje = porcentaje;
	}
	
	
	public ProductoPrimeraNecesidad(String nombre, double precio,boolean esPrecioCuidado,double porcentaje) {
		super(nombre, precio,esPrecioCuidado);
		this.porcentaje = porcentaje;
	}
	
	
	@Override
	public double getPrecio() {
		return super.getPrecio() - (super.getPrecio() * this.porcentaje) / 100;
	}

}
