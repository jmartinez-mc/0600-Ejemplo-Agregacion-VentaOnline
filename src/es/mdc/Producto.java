package es.mdc;

public class Producto {
	private String numero;
	private String descripcion;
	private double precio;
	
	// Constructor
	public Producto(String numero, String descripcion, double precio) {
		this.numero = numero;
		this.descripcion = descripcion;
		this.precio = precio;
	}
	
	// Getters
	public double getPrecio() {
		return precio;
	}

	public String getNumero() {
		return numero;
	}

	public String getDescripcion() {
		return descripcion;
	}

    // Setters
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	

}
