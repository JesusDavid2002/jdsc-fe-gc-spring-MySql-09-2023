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

import com.example.ejercicio1.dto.Proveedores;
import com.example.ejercicio1.service.ProveedoresServiceImpl;

@RestController
@RequestMapping("/api")
public class ProveedoresController {

	@Autowired
	ProveedoresServiceImpl proveedoresService;
	
	@GetMapping("/proveedores")
	public List<Proveedores> listarProveedores(){
		return proveedoresService.listarProveedores();
	}
	
	@GetMapping("/proveedores/{id}")
	public Proveedores proveedoresID(@PathVariable (name="id") String id) {
		return proveedoresService.proveedoresID(id);
	}
	
	@PostMapping("/proveedores")
	public Proveedores guardarPiezas(@RequestBody Proveedores proveedores) {
		return proveedoresService.guardarProveedores(proveedores);
	}
	
	@PutMapping("/proveedores/{id}")
	public Proveedores actualizarPiezas(@PathVariable (name="id") String id, @RequestBody Proveedores proveedor) {
		
		Proveedores proveedor_seleccionado = new Proveedores();
		Proveedores proveedor_actualizado = new Proveedores();
		
		proveedor_seleccionado = proveedoresService.proveedoresID(id);
		proveedor_seleccionado.setNombre(proveedor.getNombre());
		
		proveedor_actualizado = proveedoresService.actualizarProveedores(proveedor_seleccionado);
		System.out.println("Proveedores actualizado: " + proveedor_actualizado);
		
		return proveedor_actualizado;
	}
	
	@DeleteMapping("/proveedores/{id}")
	public void eliminarPiezas (@PathVariable (name="id") String id) {
		proveedoresService.eliminarProveedores(id);
	}
}
