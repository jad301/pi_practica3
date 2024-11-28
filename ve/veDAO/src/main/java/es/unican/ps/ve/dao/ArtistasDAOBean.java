package es.unican.ps.ve.dao;

import java.util.List;

import es.unican.ps.ve.daoLayer.IArtistasDAOLocal;
import es.unican.ps.ve.daoLayer.IArtistasDAORemote;
import es.unican.ps.ve.entities.Artista;
import es.unican.ps.ve.entities.Pelicula;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Stateless
public class ArtistasDAOBean implements IArtistasDAOLocal, IArtistasDAORemote{
	
	@PersistenceContext(unitName="versionEspanholaPU")
	private EntityManager em;

	@Override
	public Artista creaArtista(Artista a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Artista actualizaArtista(Artista a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Artista eliminaArtista(Artista a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Artista artistaPorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Artista> artistaPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Artista> artistas() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
