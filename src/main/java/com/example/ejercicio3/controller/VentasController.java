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

import com.example.ejercicio3.dto.Ventas;
import com.example.ejercicio3.service.VentasServiceImpl;

@RestController
@RequestMapping("/api")
public class VentasController {
	
	@Autowired
	VentasServiceImpl ventasService;
	
	@GetMapping("/venta")
	public List<Ventas> listarVentas(){
		return ventasService.listarVentas();
	}
	
	@GetMapping("/venta/{id}")
	public Ventas ventasID(@PathVariable (name="id") int id) {
		return ventasService.ventasID(id);
	}
	
	@PostMapping("/venta")
	public Ventas guardarVenta(@RequestBody Ventas venta) {
		return ventasService.guardarVenta(venta);
	}
	
	@PutMapping("/venta/{id}")
	public Ventas actualizarVenta(@PathVariable (name="id") int id, @RequestBody Ventas venta) {
		
		Ventas venta_seleccionada = new Ventas();
		Ventas venta_actualizada = new Ventas();
		
		venta_seleccionada = ventasService.ventasID(id);
		venta_seleccionada.setCajeros(venta.getCajeros());
		venta_seleccionada.setProductos(venta.getProductos());
		venta_seleccionada.setMaquinas(venta.getMaquinas());
		
		venta_actualizada = ventasService.actualizarVenta(venta_seleccionada);
		System.out.println("Venta actualizada: " + venta_actualizada);
		
		return venta_actualizada;
	}
	
	@DeleteMapping("/venta/{id}")
	public void eliminarVenta (@PathVariable (name="id") int id) {
		ventasService.eliminarVenta(id);
	}


}
