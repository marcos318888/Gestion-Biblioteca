package com.example.demo.Controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.Services.AutorService;
import com.example.demo.dto.AutorDTO;

@RestController
@RequestMapping("/Autor")
public class AutorRestController {

	 @Autowired
	    AutorService AutorService;
	    @PostMapping("/crear")
	    public ResponseEntity <?> crearAutor(AutorDTO Autor){
	        AutorDTO autor = AutorService.añadirAutor(Autor);
	        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/" + autor.getId()).buildAndExpand(autor.getId()).toUri();
	        return ResponseEntity.created(location).build();
	    } 
	    @GetMapping
	    ResponseEntity<?> VerAutores(){

	        List<AutorDTO> autores = AutorService.verAutores();

	        if(!autores.isEmpty()) {
	            return ResponseEntity.ok(autores);
	        }

	        return ResponseEntity.noContent().build();
	    }
}
