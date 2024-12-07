package es.unican.pi.supermercado.business;

import jakarta.ejb.EJB;
import jakarta.ejb.Stateless;
import es.unican.pi.supermercado.dao.IArticulosDAO;
import es.unican.pi.supermercado.domain.Articulo;

@Stateless
public class GestionArticulosBean implements IGestionInventarioLocal, IGestionInventarioRemote {

	@EJB
	private IArticulosDAO articulosDAO;

	@Override
	public Articulo anhadirArticulo(Articulo a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Articulo actualizarArticulo(Articulo a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Articulo eliminarArticulo(Articulo a) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
