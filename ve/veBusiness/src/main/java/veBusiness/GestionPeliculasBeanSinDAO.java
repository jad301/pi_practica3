package veBusiness;

import java.util.List;

import es.unican.ps.ve.businessLayer.*;
import es.unican.ps.ve.daoLayer.*;
import es.unican.ps.ve.entities.Artista;
import es.unican.ps.ve.entities.Pelicula;
import es.unican.ps.ve.entities.Valoracion;
import jakarta.ejb.EJB;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Stateless
public class GestionPeliculasBeanSinDAO implements IGestionPeliculasLocal, 
IValoracionPeliculasLocal, IGestionPeliculasRemote, IValoracionPeliculasRemote {
	
	@PersistenceContext(unitName="versionEspanholaPU")
	private EntityManager em;
	
	@Override
	public boolean anhadeActorPelicula(Long idArtista, Long idPelicula) {
		Pelicula peli = em.find(Pelicula.class,idPelicula);
		Artista artista = em.find(Artista.class,idArtista);
		if (peli==null || artista==null)
			return false;
		// TODO Comprobar que no está ya en la película
		if (peli.getActores().contains(artista)) {
			return false;
		}
		peli.getActores().add(artista);
		artista.getPeliculas().add(peli);
		
		return true;	
	}

	@Override
	public Pelicula creaPelicula(Pelicula p) {
		// TODO
		return null;
	}

	@Override
	public Artista creaArtista(Artista a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pelicula eliminaPelicula(Long idPelicula) {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public boolean anhadeDirectorPelicula(Long idArtista, Long idPelicula) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean valorarPelicula(Long idPelicula, Valoracion v, Long idUsuario) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Pelicula> rankingPersonal(Long idUsuario) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
