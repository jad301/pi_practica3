package es.unican.pi.supermercado.domain;

import java.util.Date;
import java.util.List;

public class Pedido {

	private Long referencia;
	private Date fecha;
	private Date horaRecogida;
	private Usuario usuario;
	private EstadoPedido estado;
	private List<LineaPedido> lineas;
	
	public Long getReferencia() {
		return referencia;
	}
	public void setReferencia(Long referencia) {
		this.referencia = referencia;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Date getHoraRecogida() {
		return horaRecogida;
	}
	public void setHoraRecogida(Date horaRecogida) {
		this.horaRecogida = horaRecogida;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public EstadoPedido getEstado() {
		return estado;
	}
	public void setEstado(EstadoPedido estado) {
		this.estado = estado;
	}
	public List<LineaPedido> getLineas() {
		return lineas;
	}
	public void setLineas(List<LineaPedido> lineas) {
		this.lineas = lineas;
	}
	
	
	
}
