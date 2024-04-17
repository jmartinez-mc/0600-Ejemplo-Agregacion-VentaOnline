package es.mdc;

import java.util.LinkedList;

public class Usuario {
	private String username;
	private String claveCifrada;
	private String direccion;
	private double precioTotal;
	
	// Impl. Agregación. Posibilidades: 
	// 1) Producto[] listaProductos;
	// 2) Nuestra clase AnyList<Producto> listaProductos;
	// 3) De JAVA: ArrayList<Producto> listaProductos; 
	
	// 4) De JAVA: LinkedList<Producto> listaProductos;
	// 5) Nuestra MiLinkedList<Producto>  listaProductos;
	
	private LinkedList<Producto> listaProductos; // Esto es la "cesta"
	
	// Constructor
	public Usuario(String username) {	
		// Creo la lista de productos o "cesta" que queda vacía.
		listaProductos = new LinkedList<>();
		
		this.username     = username;
		this.precioTotal  = 0;
		this.claveCifrada = "";  // Provisional
		this.direccion    = "";
	}
	
	// Getters
	public String getUsername() {
		return username;
	}
	
	public String getClaveCifrada() {
		return claveCifrada;
	}

	public String getDireccion() {
		return direccion;
	}
	
	public void agregarProductoCesta(Producto p) {
		//...
		listaProductos.add(p);
		precioTotal = precioTotal + p.getPrecio(); 
		// ...
	}
	
	public void eliminarProductoCesta(Producto prod) {
		//...
		listaProductos.remove(prod);
		precioTotal = 0;
		// ...
	}
	
	public void verProductosCesta() {

		System.out.printf("Tienes %d producto(s)%n", listaProductos.size());
		
		// for-each: Por cada producto de la lista, 
		// escribe descripción y precio.
		for (Producto p : listaProductos) {
			System.out.printf("* %s, %.2f €%n",
					p.getDescripcion(),
					p.getPrecio());
		}		
	}
	
	public double getPrecioTotalCesta() {
		double total = 0.0;
		
		for (Producto p : listaProductos) {
			total = total + p.getPrecio(); 
		}
		// Actualizo el atributo
		this.precioTotal = total;
		return total;
	}
	
	public void vaciarCesta() {
		listaProductos.clear();
	}
}
