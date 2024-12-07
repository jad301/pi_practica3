package es.unican.pi.supermercado.business;

import es.unican.pi.supermercado.domain.Articulo;

public interface IGestionInventario {

	Articulo anhadirArticulo(Articulo a);
	Articulo actualizarArticulo(Articulo a);
	Articulo eliminarArticulo(Articulo a);
}
