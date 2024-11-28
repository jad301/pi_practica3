package es.unican.ps.ve.daoLayer;

import java.util.List;

import es.unican.ps.ve.entities.Artista;

public interface IArtistasDAO {

	public Artista creaArtista(Artista a);

	public Artista actualizaArtista(Artista a);

	public Artista eliminaArtista(Artista a);
	
	public Artista artistaPorId(Long id);

	public List<Artista> artistaPorNombre(String nombre);

	public List<Artista> artistas();

}
