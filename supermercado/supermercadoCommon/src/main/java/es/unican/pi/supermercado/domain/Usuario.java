package es.unican.pi.supermercado.domain;

import java.util.List;

public class Usuario {

	private Long id;
	private String nombre;
	private String dni;
	private String email;
	private int comprasMensuales;
	private List<Pedido> pedidos;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getComprasMensuales() {
		return comprasMensuales;
	}
	public void setComprasMensuales(int comprasMensuales) {
		this.comprasMensuales = comprasMensuales;
	}
	public List<Pedido> getPedidos() {
		return pedidos;
	}
	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	
	
}
