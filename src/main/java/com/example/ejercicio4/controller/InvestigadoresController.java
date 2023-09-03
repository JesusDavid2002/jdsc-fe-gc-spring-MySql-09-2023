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

import com.example.ejercicio4.dto.Investigadores;
import com.example.ejercicio4.service.InvestigadoresServiceImpl;



@RestController
@RequestMapping("/api")
public class InvestigadoresController {
	
	@Autowired
	InvestigadoresServiceImpl InvestigadoresService;
	
	@GetMapping("/investigador")
	public List<Investigadores> listarInvestigadores(){
		return InvestigadoresService.listarInvestigadores();
	}
	
	@GetMapping("/investigador/{id}")
	public Investigadores investigadoresID(@PathVariable (name="id") String id) {
		return InvestigadoresService.investigadoresID(id);
	}
	
	@PostMapping("/investigador")
	public Investigadores guardarInvestigador(@RequestBody Investigadores cajero) {
		return InvestigadoresService.guardarInvestigador(cajero);
	}
	
	@PutMapping("/investigador/{id}")
	public Investigadores actualizarInvestigador(@PathVariable (name="id") String id, @RequestBody Investigadores investigadores) {
		
		Investigadores investigador_seleccionada = new Investigadores();
		Investigadores investigador_actualizada = new Investigadores();
		
		investigador_seleccionada = InvestigadoresService.investigadoresID(id);
		investigador_seleccionada.setNomApels(investigadores.getNomApels());
		investigador_seleccionada.setFacultades(investigadores.getFacultades());
		
		investigador_actualizada = InvestigadoresService.actualizarInvestigador(investigador_seleccionada);
		System.out.println("Investigador actualizado: " + investigador_actualizada);
		
		return investigador_actualizada;
	}
	
	@DeleteMapping("/investigador/{id}")
	public void eliminarInvestigador (@PathVariable (name="id") String id) {
		InvestigadoresService.eliminarInvestigador(id);
	}

}
