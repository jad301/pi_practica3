package veBusiness;

import es.unican.ps.ve.businessLayer.*;
import es.unican.ps.ve.daoLayer.*;
import es.unican.ps.ve.entities.Usuario;
import jakarta.ejb.EJB;
import jakarta.ejb.Stateless;

@Stateless
public class GestionUsuariosBean implements IGestionUsuariosLocal, IGestionUsuariosRemote {
	
	@EJB
	private IUsuariosDAOLocal usuariosDAO;

	@Override
	public boolean registraUsuario(Usuario u) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Usuario usuarioPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

}
