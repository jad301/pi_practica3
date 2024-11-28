package es.unican.pi.supermercado.business;

import java.util.List;

import es.unican.pi.supermercado.domain.Articulo;
import es.unican.pi.supermercado.domain.Pedido;

@Local
public interface IRealizarPedidos {

	List<Articulo> consultaArticulos(String dni);
	Boolean anhadeArticulo(int uds, Articulo art);
	Pedido confirmarPedido(int hora, Long idPedido);
}
