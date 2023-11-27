package com.example.demo.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import com.example.demo.dto.AutorDTO;
import com.example.demo.persistence.Entytis.AutorEntity;
import com.example.demo.persistence.Entytis.LibroEntity;

@Mapper(componentModel = "spring")
public interface AutorMapper {

	AutorDTO autorToDTO (AutorEntity Autor);
    AutorEntity autorToEntity (AutorDTO Autor);
    @Mapping(target = "Libros", ignore = true)
    AutorDTO toDtoWithoutlibros(AutorEntity Autor);
   }

