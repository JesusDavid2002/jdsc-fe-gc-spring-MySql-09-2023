package com.example.ejercicio4.controller;

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

import com.example.ejercicio4.dto.Equipos;
import com.example.ejercicio4.service.EquiposServiceImpl;


@RestController
@RequestMapping("/api")
public class EquiposController {
	
	@Autowired
	EquiposServiceImpl equiposService;
	
	@GetMapping("/equipo")
	public List<Equipos> listarEquipos(){
		return equiposService.listarEquipos();
	}
	
	@GetMapping("/equipo/{id}")
	public Equipos equiposID(@PathVariable (name="id") String id) {
		return equiposService.equiposID(id);
	}
	
	@PostMapping("/equipo")
	public Equipos guardarEquipo(@RequestBody Equipos equipo) {
		return equiposService.guardarEquipo(equipo);
	}
	
	@PutMapping("/equipo/{id}")
	public Equipos actualizarEquipo(@PathVariable (name="id") String id, @RequestBody Equipos equipo) {
		
		Equipos equipo_seleccionada = new Equipos();
		Equipos equipo_actualizada = new Equipos();
		
		equipo_seleccionada = equiposService.equiposID(id);
		equipo_seleccionada.setNombre(equipo.getNombre());
		equipo_seleccionada.setFacultades(equipo.getFacultades());
		
		equipo_actualizada = equiposService.actualizarEquipo(equipo_seleccionada);
		System.out.println("Equipo actualizada: " + equipo_actualizada);
		
		return equipo_actualizada;
	}
	
	@DeleteMapping("/equipo/{id}")
	public void eliminarEquipo (@PathVariable (name="id") String id) {
		equiposService.eliminarEquipo(id);
	}

}
