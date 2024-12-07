package es.unican.pi.supermercado.business;

import java.util.List;

import es.unican.pi.supermercado.dao.IArticulosDAO;
import es.unican.pi.supermercado.dao.IPedidosDAO;
import es.unican.pi.supermercado.dao.IUsuariosDAO;
import es.unican.pi.supermercado.domain.Articulo;
import es.unican.pi.supermercado.domain.Pedido;
import jakarta.ejb.EJB;
import jakarta.ejb.Stateful;

@Stateful
public class GestionPedidosBean implements IRealizarPedidosLocal, IRealizarPedidosRemote {

	@EJB
	private IPedidosDAO pedidosDAO;
	
	@EJB
	private IArticulosDAO articulosDAO;
	
	@EJB
	private IUsuariosDAO usuariosDAO;
	
	@Override
	public List<Articulo> consultaArticulos(String dni) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean anhadeArticulo(int uds, Articulo art) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pedido confirmarPedido(int hora, Long idPedido) {
		// TODO Auto-generated method stub
		return null;
	}
}
