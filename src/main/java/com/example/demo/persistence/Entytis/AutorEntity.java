package com.example.demo.persistence.Entytis;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class AutorEntity {
	private Long id;

	private String nombre;

	private String nacionalidad;
	@OneToMany(mappedBy = "Autor")

	private List<LibroEntity> libros = new ArrayList<>();
}
