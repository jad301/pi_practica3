package es.unican.pi.supermercado.business;

import es.unican.pi.supermercado.domain.Albaran;

public interface IGestionPedidos {

	Albaran procesarPedido();
	Double entregarPedido(Long ref, String dni);
	
}
