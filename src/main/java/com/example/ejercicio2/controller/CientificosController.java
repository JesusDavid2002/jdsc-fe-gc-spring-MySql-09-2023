package com.example.ejercicio2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ejercicio2.dto.Cientificos;
import com.example.ejercicio2.service.CientificosServiceImpl;


@RestController
@RequestMapping("/api")
public class CientificosController {

	@Autowired
	CientificosServiceImpl cientificosService;
	
	@GetMapping("/cientificos")
	public List<Cientificos> listarCientificos(){
		return cientificosService.listarCientificos();
	}
	
	@GetMapping("/cientificos/{id}")
	public Cientificos cientificosID(@PathVariable (name="id") String id) {
		return cientificosService.cientificosID(id);
	}
	
	@PostMapping("/cientificos")
	public Cientificos guardarCientifico(@RequestBody Cientificos cientifico) {
		return cientificosService.guardarCientifico(cientifico);
	}
	
	@PutMapping("/cientificos/{id}")
	public Cientificos actualizarCientifico(@PathVariable (name="id") String id, @RequestBody Cientificos cientifico) {
		
		Cientificos cientifico_seleccionada = new Cientificos();
		Cientificos cientifico_actualizada = new Cientificos();
		
		cientifico_seleccionada = cientificosService.cientificosID(id);
		cientifico_seleccionada.setNomApels(cientifico.getNomApels());
		
		cientifico_actualizada = cientificosService.actualizarCientifico(cientifico_seleccionada);
		System.out.println("Cientifico actualizada: " + cientifico_actualizada);
		
		return cientifico_actualizada;
	}
	
	@DeleteMapping("/cientificos/{id}")
	public void eliminarCientifico (@PathVariable (name="id") String id) {
		cientificosService.eliminarCientifico(id);
	}
}
