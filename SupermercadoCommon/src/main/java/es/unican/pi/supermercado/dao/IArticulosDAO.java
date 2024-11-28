package es.unican.pi.supermercado.dao;

import java.util.List;

import es.unican.pi.supermercado.domain.Articulo;

public interface IArticulosDAO {
	
	Articulo creaArticulo(Articulo a);
	Articulo modificaArticulo(Articulo a);
	Articulo eliminaArticulo(Articulo a);
	Articulo articuloPorId(Long id);
	List<Articulo> articulos();
	
}
