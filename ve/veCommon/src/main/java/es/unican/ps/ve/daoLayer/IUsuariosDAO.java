package es.unican.ps.ve.daoLayer;

import java.util.List;

import es.unican.ps.ve.entities.Usuario;

public interface IUsuariosDAO {

	public Usuario creaUsuario(Usuario a);

	public Usuario actualizausuario(Usuario a);

	public Usuario eliminaUsuario(Usuario a);
	
	public Usuario usuarioPorId(Long id);

	public Usuario usuarioPorNombre(String nombre);

	public List<Usuario> Usuarios();

}
