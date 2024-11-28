package es.unican.ps.ve.dao;

import java.util.List;

import es.unican.ps.ve.daoLayer.IPeliculasDAOLocal;
import es.unican.ps.ve.daoLayer.IPeliculasDAORemote;
import es.unican.ps.ve.entities.Pelicula;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityExistsException;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Stateless
public class PeliculasDAOBean implements IPeliculasDAOLocal, IPeliculasDAORemote{
	
	@PersistenceContext(unitName="versionEspanholaPU")
	private EntityManager em;

	@Override
	public Pelicula creaPelicula(Pelicula p) {
		try {
			em.persist(p);
		} catch (EntityExistsException e) {
			return null;
		}
		return p;
	}
	
	@Override
	public Pelicula peliculaPorId(Long id) {
		return em.find(Pelicula.class, id);
	}

	@Override
	public Pelicula actualizaPelicula(Pelicula p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pelicula eliminaPelicula(Pelicula p) {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public List<Pelicula> peliculaPorTitulo(String titulo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pelicula> peliculas() {
		// TODO Auto-generated method stub
		return null;
	}

}
