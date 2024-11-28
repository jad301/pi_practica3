package es.unican.ps.ve.businessLayer;

import es.unican.ps.ve.entities.Usuario;

public interface IGestionUsuarios {
	
	public boolean registraUsuario(Usuario u);
	public Usuario usuarioPorNombre(String nombre);
	

}
