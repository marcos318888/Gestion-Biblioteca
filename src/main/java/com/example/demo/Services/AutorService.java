package com.example.demo.Services;

import java.util.List;

import com.example.demo.dto.AutorDTO;

public interface AutorService {
 
	List<AutorDTO> verAutores();
	AutorDTO añadirAutor(AutorDTO Autor);
}
