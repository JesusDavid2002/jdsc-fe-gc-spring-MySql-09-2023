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

import com.example.ejercicio3.dto.MaquinasRegistradas;
import com.example.ejercicio3.service.MaquinasServiceImpl;


@RestController
@RequestMapping("/api")
public class MaquinasController {

	@Autowired
	MaquinasServiceImpl maquinasService;
	
	@GetMapping("/maquina")
	public List<MaquinasRegistradas> listarMaquinas(){
		return maquinasService.listarMaquinas();
	}
	
	@GetMapping("/maquina/{id}")
	public MaquinasRegistradas maquinasID(@PathVariable (name="id") int id) {
		return maquinasService.maquinasID(id);
	}
	
	@PostMapping("/maquina")
	public MaquinasRegistradas guardarMaquina(@RequestBody MaquinasRegistradas maquina) {
		return maquinasService.guardarMaquina(maquina);
	}
	
	@PutMapping("/maquina/{id}")
	public MaquinasRegistradas actualizarMaquina(@PathVariable (name="id") int id, @RequestBody MaquinasRegistradas maquina) {
		
		MaquinasRegistradas maquina_seleccionada = new MaquinasRegistradas();
		MaquinasRegistradas maquina_actualizada = new MaquinasRegistradas();
		
		maquina_seleccionada = maquinasService.maquinasID(id);
		maquina_seleccionada.setPiso(maquina.getPiso());
		
		maquina_actualizada = maquinasService.actualizarMaquina(maquina_seleccionada);
		System.out.println("Maquina registrada actualizada: " + maquina_actualizada);
		
		return maquina_actualizada;
	}
	
	@DeleteMapping("/maquina/{id}")
	public void eliminarMaquina (@PathVariable (name="id") int id) {
		maquinasService.eliminarMaquina(id);
	}

}
