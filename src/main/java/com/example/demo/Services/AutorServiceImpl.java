package com.example.demo.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.AutorDTO;
import com.example.demo.persistence.Entytis.AutorEntity;

@Service
public class AutorServiceImpl implements AutorService {

	@Autowired
    AutorRepository AutorRepository;
	
    @Autowired 
    AutorMapper AutorMapper;
    
    @Override
    public AutorDTO añadirAutor(AutorDTO Autor) {
         AutorEntity Autor2 = AutorMapper.autorToEntity(Autor);
         AutorEntity GuardarAutor = AutorRepository.save(Autor2);
         return AutorMapper.autorToDTO(GuardarAutor);
    }

    @Override
    public ArrayList<AutorDTO> verAutores() {
        List<AutorEntity> lista = AutorRepository.findAll();
        List<AutorDTO> Autores = AutorMapper.listaToDTO(lista);

        return Autores;
    }
}
