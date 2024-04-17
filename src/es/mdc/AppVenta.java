package es.mdc;

public class AppVenta {

	public static void main(String[] args) {
		// Creo un par de productos
		Producto iphone11 = new Producto("0001", "iPhone 11", 1000);
		Producto mac      = new Producto("0002", "MacBook Pro", 2000 );
		
		// Creo un usuario
		Usuario userJohn  = new Usuario("john");
		
		// El usuario agrega dos productos a su "Cesta"
		userJohn.agregarProductoCesta(iphone11);
		userJohn.agregarProductoCesta(mac);
		
		// Visualizo el contenido de la cesta
		System.out.println("Cesta de John");
		System.out.println("-------------");
		
		userJohn.verProductosCesta();
		System.out.printf("--%nTotal: %.2f EUR%n%n", 
				userJohn.getPrecioTotalCesta());

        // Elimino producto de la cesta
		userJohn.eliminarProductoCesta(mac);
		
		// Quiero eliminar un producto que tenga la cadena 
		// "MacBook"
		//userJohn.eliminarProductoCesta("MacBook");
		
		
		
		
		
		System.out.println("Cesta de John");
		System.out.println("-------------");
		userJohn.verProductosCesta();
		System.out.printf("--%nTotal: %.2f EUR%n%n", 
				userJohn.getPrecioTotalCesta());
		

		userJohn.vaciarCesta();
		System.out.println("Cesta de John");
		System.out.println("-------------");
		userJohn.verProductosCesta();
		System.out.printf("--%nTotal: %.2f EUR%n%n", 
				userJohn.getPrecioTotalCesta());
	}

}
