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

import com.example.ejercicio4.dto.Facultades;
import com.example.ejercicio4.service.FacultadesServiceImpl;


@RestController
@RequestMapping("/api")
public class FacultadesController {
	
	@Autowired
	FacultadesServiceImpl facultadesService;
	
	@GetMapping("/facultad")
	public List<Facultades> listarFacultades(){
		return facultadesService.listarFacultades();
	}
	
	@GetMapping("/facultad/{id}")
	public Facultades facultadesID(@PathVariable (name="id") int id) {
		return facultadesService.facultadesID(id);
	}
	
	@PostMapping("/facultad")
	public Facultades guardarFacultad(@RequestBody Facultades facultad) {
		return facultadesService.guardarFacultad(facultad);
	}
	
	@PutMapping("/facultad/{id}")
	public Facultades actualizarFacultad(@PathVariable (name="id") int id, @RequestBody Facultades facultad) {
		
		Facultades facultad_seleccionada = new Facultades();
		Facultades facultad_actualizada = new Facultades();
		
		facultad_seleccionada = facultadesService.facultadesID(id);
		facultad_seleccionada.setNombre(facultad.getNombre());
		
		facultad_actualizada = facultadesService.actualizarFacultad(facultad_seleccionada);
		System.out.println("Facultad actualizada: " + facultad_actualizada);
		
		return facultad_actualizada;
	}
	
	@DeleteMapping("/facultad/{id}")
	public void eliminarFacultad (@PathVariable (name="id") int id) {
		facultadesService.eliminarFacultad(id);
	}

}
