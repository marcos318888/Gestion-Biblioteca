package com.example.demo.Services;

import com.example.demo.dto.LibroDTO;

public interface LibroService {
	LibroDTO createLibro(LibroDTO cursoDTO);

	LibroDTO getLibro(Long cursoId);
}
