package es.unican.ps.ve.businessLayer;

import java.util.List;

import es.unican.ps.ve.entities.Artista;
import es.unican.ps.ve.entities.Pelicula;

public interface IConsultasPeliculas {
	
	public List<Artista> artista(String nombre);
	public List<Pelicula> pelicula (String titulo);
	public List<Pelicula> peliculas();
	public List<Artista> artistas();
	public List<Pelicula> ranking();
}
