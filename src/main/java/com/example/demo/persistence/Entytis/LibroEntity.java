package com.example.demo.persistence.Entytis;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class LibroEntity {
	private Long id;

	private String titulo;

	private String isbn;

	private BigDecimal precio;
	
	@ManyToOne
	@JoinColumn(name = "autor_id")

	private AutorEntity autor;
}
