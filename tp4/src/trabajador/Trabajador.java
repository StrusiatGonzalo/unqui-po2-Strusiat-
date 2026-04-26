	package trabajador;
	
	import java.util.ArrayList;
	import java.util.List;
	
	import supermercado.Producto;
	
	public class Trabajador {
		private List<Ingreso> ingresosPercibidos = new ArrayList<Ingreso>();
		
		public Trabajador() {
			
		}
		
		public Trabajador(List<Ingreso> ingresos) {
			this.ingresosPercibidos = ingresos;
		}
		
		public double getTotalPercibido() {
			double total = ingresosPercibidos.stream()
					.mapToDouble(Ingreso::getMontoPercibido)
					.sum();
			
			return total;
		}
		
		public double getMontoImponible() {
			double total = ingresosPercibidos.stream()
					.mapToDouble(Ingreso::getMontoImponible)
					.sum();
			
			return total;
		}
		
		public double getImpuestoAPagar() {
			return this.getMontoImponible() * 0.02;
		}
		
		public void agregarIngreso(Ingreso ingreso) {
			this.ingresosPercibidos.add(ingreso);
		}
	}

