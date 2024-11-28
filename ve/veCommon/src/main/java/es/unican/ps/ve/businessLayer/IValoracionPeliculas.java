package es.unican.ps.ve.businessLayer;

import java.util.List;

import es.unican.ps.ve.entities.Pelicula;
import es.unican.ps.ve.entities.Valoracion;

public interface IValoracionPeliculas {
	
	public boolean valorarPelicula(Long idPelicula, Valoracion v, Long idUsuario);
	public List<Pelicula> rankingPersonal(Long idUsuario);

}
