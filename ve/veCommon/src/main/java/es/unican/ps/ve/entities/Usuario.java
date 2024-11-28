package es.unican.ps.ve.entities;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@SuppressWarnings("serial")
@Getter @Setter @NoArgsConstructor 

@Entity
@Table(name="Usuarios")
public class Usuario implements Serializable {
	
	@Id
	@GeneratedValue
	private Long id;
	@Column(name="nombre")
	private String nombreUsuario;
	private String password;
	
	@OneToMany
	@JoinColumn(name="Usuario_FK")
	private List<Valoracion> valoraciones = new LinkedList<Valoracion>();
	
	public Valoracion getValoracionPelicula(Pelicula p) {
		for (Valoracion v:valoraciones) {
			if (v.getPelicula().equals(p)) {
				return v;
			}
		}
		return null;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombreUsuario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(nombreUsuario, other.nombreUsuario);
	}
	
	


}
