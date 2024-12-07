package es.unican.pi.supermercado.dao;

import java.util.List;

import es.unican.pi.supermercado.domain.Usuario;

public interface IUsuariosDAO {

	Usuario creaUsuario(Usuario uAnonimo);
	Usuario modificaUsuario(Usuario u);
	Usuario eliminaUsuario(Usuario u);
	Usuario usuarioPorId(Long id);
	List<Usuario> usuarios();
}
