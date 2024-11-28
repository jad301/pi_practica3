package es.unican.ps.ve.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@SuppressWarnings("serial")
@Getter @Setter @NoArgsConstructor 

@Entity
@Table(name="Artistas")
public class Artista implements Serializable{	
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String nombre;
	
	@ManyToMany(mappedBy="actores")
	private List<Pelicula> peliculas;
	
	@ManyToMany(mappedBy="directores")
	private List<Pelicula> peliculasDirigidas;
	
	
	public Artista(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Artista other = (Artista) obj;
		return Objects.equals(nombre, other.nombre);
	}
	
	

}
