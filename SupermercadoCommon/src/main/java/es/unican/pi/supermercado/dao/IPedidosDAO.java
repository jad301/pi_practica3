package es.unican.pi.supermercado.dao;

import java.util.List;

import es.unican.pi.supermercado.domain.Pedido;

public interface IPedidosDAO {

	Pedido creaPedido(Pedido p);
	Pedido modificaPedido(Pedido p);
	Pedido eliminaPedido(Pedido p);
	Pedido pedidoPorId(Long id);
	List<Pedido> pedidos();
}
