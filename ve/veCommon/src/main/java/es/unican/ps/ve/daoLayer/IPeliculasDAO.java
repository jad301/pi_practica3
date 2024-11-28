package es.unican.ps.ve.daoLayer;

import java.util.List;

import es.unican.ps.ve.entities.Pelicula;

public interface IPeliculasDAO {

	public Pelicula creaPelicula(Pelicula p);

	public Pelicula actualizaPelicula(Pelicula p);

	public Pelicula eliminaPelicula(Pelicula p);

	public Pelicula peliculaPorId(Long id);

	public List<Pelicula> peliculaPorTitulo(String titulo);

	public List<Pelicula> peliculas();

}
