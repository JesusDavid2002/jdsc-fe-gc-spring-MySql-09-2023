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

import com.example.ejercicio1.dto.Piezas;
import com.example.ejercicio1.service.PiezasServiceImpl;

@RestController
@RequestMapping("/api")
public class PiezasController {
	
	@Autowired
	PiezasServiceImpl piezasService;
	
	@GetMapping("/piezas")
	public List<Piezas> listarPiezas(){
		return piezasService.listarPiezas();
	}
	
	@GetMapping("/piezas/{id}")
	public Piezas piezasID(@PathVariable (name="id") int id) {
		return piezasService.piezasID(id);
	}
	
	@PostMapping("/piezas")
	public Piezas guardarPiezas(@RequestBody Piezas piezas) {
		return piezasService.guardarPiezas(piezas);
	}
	
	@PutMapping("/piezas/{id}")
	public Piezas actualizarPiezas(@PathVariable (name="id") int id, @RequestBody Piezas piezas) {
		
		Piezas pieza_seleccionada = new Piezas();
		Piezas pieza_actualizada = new Piezas();
		
		pieza_seleccionada = piezasService.piezasID(id);
		pieza_seleccionada.setNombre(piezas.getNombre());
		
		pieza_actualizada = piezasService.actualizarPieza(pieza_seleccionada);
		System.out.println("Pieza actualizada: " + pieza_actualizada);
		
		return pieza_actualizada;
	}
	
	@DeleteMapping("/piezas/{id}")
	public void eliminarPiezas (@PathVariable (name="id") int id) {
		piezasService.eliminarPiezas(id);
	}
}
