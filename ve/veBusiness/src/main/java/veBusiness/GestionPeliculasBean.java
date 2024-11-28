package veBusiness;

import java.util.List;

import es.unican.ps.ve.businessLayer.*;
import es.unican.ps.ve.daoLayer.*;
import es.unican.ps.ve.entities.Artista;
import es.unican.ps.ve.entities.Pelicula;
import es.unican.ps.ve.entities.Valoracion;
import jakarta.ejb.EJB;
import jakarta.ejb.Stateless;

@Stateless
public class GestionPeliculasBean implements IGestionPeliculasLocal, 
IValoracionPeliculasLocal, IGestionPeliculasRemote, IValoracionPeliculasRemote {
	
	@EJB
	private IPeliculasDAOLocal peliculasDAO;
	
	@EJB
	private IUsuariosDAOLocal usuariosDAO;
	
	@EJB
	private IArtistasDAOLocal artistasDAO;
	
	
	@Override
	public boolean anhadeActorPelicula(Long idArtista, Long idPelicula) {
		Pelicula peli = peliculasDAO.peliculaPorId(idPelicula);
		Artista artista = artistasDAO.artistaPorId(idArtista);
		if (peli==null || artista==null)
			return false;
		// TODO Comprobar que no está ya en la película
		if (peli.getActores().contains(artista)) {
			return false;
		}
		peli.getActores().add(artista);
		artista.getPeliculas().add(peli);
		
		peliculasDAO.actualizaPelicula(peli);
		artistasDAO.actualizaArtista(artista);
		
		return true;	
	}

	@Override
	public Pelicula creaPelicula(Pelicula p) {
		// Comprobamos que la pelicula no existe ya, 
		// para ello buscamos las de igual título y
		// comprobamos que no esté en esa lista
		List<Pelicula> peliculas = peliculasDAO.peliculaPorTitulo(p.getTitulo());
		if (peliculas.contains(p))
			return null;
		return peliculasDAO.creaPelicula(p);
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
