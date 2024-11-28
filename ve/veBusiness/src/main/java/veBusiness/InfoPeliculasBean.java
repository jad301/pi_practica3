package veBusiness;

import java.util.List;

import es.unican.ps.ve.businessLayer.*;
import es.unican.ps.ve.daoLayer.*;
import es.unican.ps.ve.entities.Artista;
import es.unican.ps.ve.entities.Pelicula;
import jakarta.ejb.EJB;
import jakarta.ejb.Stateless;

@Stateless
public class InfoPeliculasBean implements IConsultasPeliculasLocal, IConsultasPeliculasRemote {
	
	@EJB
	private IPeliculasDAOLocal peliculasDAO;
	
	@EJB
	private IArtistasDAOLocal artistasDAO;

	@Override
	public List<Artista> artista(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pelicula> pelicula(String titulo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pelicula> peliculas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Artista> artistas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pelicula> ranking() {
		// TODO Auto-generated method stub
		return null;
	}

}
