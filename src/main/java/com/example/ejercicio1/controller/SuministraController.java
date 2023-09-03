package com.example.ejercicio1.controller;

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

import com.example.ejercicio1.dto.Suministra;
import com.example.ejercicio1.service.SuministraServiceImpl;

@RestController
@RequestMapping("/api")
public class SuministraController {

	@Autowired
	SuministraServiceImpl suministraService;
	
	@GetMapping("/suministro")
	public List<Suministra> listarSuministros(){
		return suministraService.listarSuministros();
	}
	
	@GetMapping("/suministro/{id}")
	public Suministra suministrosID(@PathVariable (name="id") int id) {
		return suministraService.suministroID(id);
	}
	
	@PostMapping("/suministro")
	public Suministra guardarSuministro(@RequestBody Suministra suministro) {
		return suministraService.guardarSuministro(suministro);
	}
	
	@PutMapping("/suministro/{id}")
	public Suministra actualizarSuministro(@PathVariable (name="id") int id, @RequestBody Suministra suministro) {
		
		Suministra suministro_seleccionada = new Suministra();
		Suministra suministro_actualizada = new Suministra();
		
		suministro_seleccionada = suministraService.suministroID(id);
		suministro_seleccionada.setPrecio(suministro.getPrecio());
		
		suministro_actualizada = suministraService.actualizarSuministro(suministro_seleccionada);
		System.out.println("Suministro actualizada: " + suministro_actualizada);
		
		return suministro_actualizada;
	}
	
	@DeleteMapping("/suministro/{id}")
	public void eliminarSuministro (@PathVariable (name="id") int id) {
		suministraService.eliminarSuministro(id);
	}
}
