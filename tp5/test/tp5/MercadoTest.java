package tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Mercado.Caja;
import Mercado.Producto;
import Mercado.ProductoCooperativa;

class MercadoTest {
	private Producto arroz;
	private ProductoCooperativa leche;
	private Caja caja1;
	
	@BeforeEach
	public void setUp() {
		arroz = new Producto(100,8);
		leche = new ProductoCooperativa(150,9,10);
		
		caja1 = new Caja();
		
		caja1.registrarProducto(arroz);
		caja1.registrarProducto(leche);
		
	}
	
	
	@Test
	void test() {
		assertEquals(235,caja1.totalAPagar());
		assertEquals(7,arroz.getStock());
		assertEquals(8,leche.getStock());
	}

}
