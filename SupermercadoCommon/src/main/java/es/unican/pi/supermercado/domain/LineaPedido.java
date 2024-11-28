package es.unican.pi.supermercado.domain;

public class LineaPedido {

	private int cantidad;
	private Double precio;
	private Articulo art;
	
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public Articulo getArt() {
		return art;
	}
	public void setArt(Articulo art) {
		this.art = art;
	}
	
	
	
}
