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

import com.example.ejercicio2.dto.Proyectos;
import com.example.ejercicio2.service.ProyectosServiceImpl;



@RestController
@RequestMapping("/api")
public class ProyectosController {

	@Autowired
	ProyectosServiceImpl proyectosService;
	
	@GetMapping("/proyectos")
	public List<Proyectos> listarProyectos(){
		return proyectosService.listarProyectos();
	}
	
	@GetMapping("/proyectos/{id}")
	public Proyectos proyectosID(@PathVariable (name="id") String id) {
		return proyectosService.proyectosID(id);
	}
	
	@PostMapping("/proyectos")
	public Proyectos guardarProyecto(@RequestBody Proyectos proyecto) {
		return proyectosService.guardarProyecto(proyecto);
	}
	
	@PutMapping("/proyectos/{id}")
	public Proyectos actualizarProyecto(@PathVariable (name="id") String id, @RequestBody Proyectos proyecto) {
		
		Proyectos proyecto_seleccionada = new Proyectos();
		Proyectos proyecto_actualizada = new Proyectos();
		
		proyecto_seleccionada = proyectosService.proyectosID(id);
		proyecto_seleccionada.setNombre(proyecto.getNombre());
		proyecto_seleccionada.setHoras(proyecto.getHoras());
		
		proyecto_actualizada = proyectosService.actualizarProyecto(proyecto_seleccionada);
		System.out.println("Proyecto actualizada: " + proyecto_actualizada);
		
		return proyecto_actualizada;
	}
	
	@DeleteMapping("/proyectos/{id}")
	public void eliminarProyecto (@PathVariable (name="id") String id) {
		proyectosService.eliminarProyecto(id);
	}
}
