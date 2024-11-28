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
@Table(name="Peliculas")
public class Pelicula implements Serializable {
	
	@Id
	@GeneratedValue
	private Long id;
	private String titulo;
	private String anho;
	@Column(name="gen")
	@Enumerated(value=EnumType.STRING)
	private Genero genero;
	
	@ManyToMany
	@JoinTable(name="Actor_Pelicula",
			joinColumns=@JoinColumn(name="Pelicula_FK"),
			inverseJoinColumns=@JoinColumn(name="Actor_FK"))
	private List<Artista> actores = new LinkedList<Artista>();
	
	@ManyToMany
	@JoinTable(name="Director_Pelicula",
			joinColumns=@JoinColumn(name="Pelicula_FK"),
			inverseJoinColumns=@JoinColumn(name="Director_FK"))
	private List<Artista> directores = new LinkedList<Artista>();
	
	@OneToMany(mappedBy="pelicula")
	private List<Valoracion> valoraciones = new LinkedList<Valoracion>();

	@Transient
	private double puntuacion;
	
	public Pelicula(String titulo, String anho, Genero genero) {
		this.titulo = titulo;
		this.anho = anho;
		this.genero = genero;
	}
	
	public double getPuntuacion() {
		int suma=0;
		if (valoraciones.size()==0)
			return 0;
		for (Valoracion v:valoraciones) {
			suma+=v.getPuntuacion();
		}
		puntuacion = suma/valoraciones.size();
		return puntuacion;
	}

	@Override
	public int hashCode() {
		return Objects.hash(anho, genero, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pelicula other = (Pelicula) obj;
		return Objects.equals(anho, other.anho) && genero == other.genero && Objects.equals(titulo, other.titulo);
	}
	

}

