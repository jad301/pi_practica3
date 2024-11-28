package es.unican.ps.ve.dao;

import java.util.List;

import es.unican.ps.ve.daoLayer.IUsuariosDAOLocal;
import es.unican.ps.ve.daoLayer.IUsuariosDAORemote;
import es.unican.ps.ve.entities.Usuario;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Stateless
public class UsuariosDAOBean implements IUsuariosDAOLocal, IUsuariosDAORemote{
	
	@PersistenceContext(unitName="versionEspanholaPU")
	private EntityManager em;

	@Override
	public Usuario creaUsuario(Usuario a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario actualizausuario(Usuario a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario eliminaUsuario(Usuario a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario usuarioPorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario usuarioPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuario> Usuarios() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
