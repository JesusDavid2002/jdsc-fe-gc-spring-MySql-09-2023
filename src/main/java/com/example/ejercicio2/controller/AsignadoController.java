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

import com.example.ejercicio2.dto.AsignadoA;
import com.example.ejercicio2.service.AsignadoServiceImpl;

@RestController
@RequestMapping("/api")
public class AsignadoController {

	@Autowired
	AsignadoServiceImpl asginadoService;
	
	@GetMapping("/asignado")
	public List<AsignadoA> listarAsignado(){
		return asginadoService.listarAsignado();
	}
	
	@GetMapping("/asignado/{id}")
	public AsignadoA asignadosID(@PathVariable (name="id") int id) {
		return asginadoService.asignadosID(id);
	}
	
	@PostMapping("/asignado")
	public AsignadoA guardarAsignado(@RequestBody AsignadoA asignado) {
		return asginadoService.guardarAsignado(asignado);
	}
	
	@PutMapping("/asignado/{id}")
	public AsignadoA actualizarAsignado(@PathVariable (name="id") int id, @RequestBody AsignadoA asignado) {
		
		AsignadoA asignado_seleccionada = new AsignadoA();
		AsignadoA asignado_actualizada = new AsignadoA();
		
		asignado_seleccionada = asginadoService.asignadosID(id);
		asignado_seleccionada.setDniCientifico(asignado.getDniCientifico());
		asignado_seleccionada.setIdProyecto(asignado.getIdProyecto());
		
		asignado_actualizada = asginadoService.actualizarAsignado(asignado_seleccionada);
		System.out.println("Pieza actualizada: " + asignado_actualizada);
		
		return asignado_actualizada;
	}
	
	@DeleteMapping("/asignado/{id}")
	public void eliminarAsignado (@PathVariable (name="id") int id) {
		asginadoService.eliminarAsignado(id);
	}
}
