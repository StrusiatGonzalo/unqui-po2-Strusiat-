package tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Mercado.Caja;
import Mercado.Producto;
import Mercado.ProductoCooperativa;
import Mercado.ProductoDeCooperativa;

class MercadoTest {
	
	protected Caja caja1 = new Caja();
	
	protected Producto leche = new Producto(1965.0, 3); 
    protected Producto manteca = new Producto(2800.5);
    protected ProductoDeCooperativa fideos = new ProductoDeCooperativa(1000.8, 10);
    protected ProductoDeCooperativa arroz = new ProductoDeCooperativa(1790.0, 5 ,10);
    
	@BeforeEach
	public void setUp() {
		caja1.addProducto(arroz);
		caja1.addProducto(manteca);
		caja1.addProducto(fideos);
		caja1.addProducto(leche);
		
	}
	
	
	@Test
	void test() {
		assertEquals(caja1.montoTotal(), 7277.22);
		assertEquals(leche.getStock(),2);
		assertEquals(manteca.getStock(),0);
		
	}

}
