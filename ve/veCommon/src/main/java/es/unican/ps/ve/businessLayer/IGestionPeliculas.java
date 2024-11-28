package es.unican.ps.ve.businessLayer;

import es.unican.ps.ve.entities.Artista;
import es.unican.ps.ve.entities.Pelicula;


public interface IGestionPeliculas {
	
	public Pelicula creaPelicula(Pelicula p);
	public Artista creaArtista(Artista a);
	public Pelicula eliminaPelicula(Long idPelicula);
	public boolean anhadeActorPelicula(Long idArtista, Long idPelicula);
	public boolean anhadeDirectorPelicula(Long idArtista, Long idPelicula);

}
