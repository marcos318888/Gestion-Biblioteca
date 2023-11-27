package com.example.demo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.LibroService;

@RestController
@RequestMapping("/libro")
public class LibroRestControllers {
	
	@Autowired
	 LibroService libroService;
	
}
