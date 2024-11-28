package es.unican.ps.ve.entities;

import java.io.Serializable;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@SuppressWarnings("serial")
@Getter @Setter @NoArgsConstructor 
@Entity
public class Valoracion implements Serializable {
	
	private long id;
	
	private int puntuacion;
	private String critica;
	
	@ManyToOne
	@JoinColumn(name="Pelicula_FK")
	private Pelicula pelicula;
	
	


}
