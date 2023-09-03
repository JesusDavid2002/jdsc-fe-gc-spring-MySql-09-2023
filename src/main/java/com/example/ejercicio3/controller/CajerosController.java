package com.example.ejercicio3.controller;

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

import com.example.ejercicio3.dto.Cajeros;
import com.example.ejercicio3.service.CajerosServiceImpl;


@RestController
@RequestMapping("/api")
public class CajerosController {
	
	@Autowired
	CajerosServiceImpl cajerosService;
	
	@GetMapping("/cajero")
	public List<Cajeros> listarCajeros(){
		return cajerosService.listarCajeros();
	}
	
	@GetMapping("/cajero/{id}")
	public Cajeros cajerosID(@PathVariable (name="id") int id) {
		return cajerosService.cajerosID(id);
	}
	
	@PostMapping("/cajero")
	public Cajeros guardarCajero(@RequestBody Cajeros cajero) {
		return cajerosService.guardarCajero(cajero);
	}
	
	@PutMapping("/cajero/{id}")
	public Cajeros actualizarCajero(@PathVariable (name="id") int id, @RequestBody Cajeros cajero) {
		
		Cajeros cajero_seleccionada = new Cajeros();
		Cajeros cajero_actualizada = new Cajeros();
		
		cajero_seleccionada = cajerosService.cajerosID(id);
		cajero_seleccionada.setNomApels(cajero.getNomApels());
		
		cajero_actualizada = cajerosService.actualizarCajero(cajero_seleccionada);
		System.out.println("Cajero actualizada: " + cajero_actualizada);
		
		return cajero_actualizada;
	}
	
	@DeleteMapping("/cajero/{id}")
	public void eliminarCajero (@PathVariable (name="id") int id) {
		cajerosService.eliminarCajero(id);
	}

}
