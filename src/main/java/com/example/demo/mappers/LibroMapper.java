package com.example.demo.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.example.demo.dto.LibroDTO;
import com.example.demo.persistence.Entytis.LibroEntity;

@Mapper(componentModel = "spring", uses = {AutorMapper.class})
public interface LibroMapper {


    LibroDTO toDto(LibroEntity libro);
    LibroEntity toEntity(LibroDTO libroDTO);

    @Mapping(target = "autores", ignore = true)
    LibroDTO toDtoWithoutLibroDTO(LibroEntity libro);
}
