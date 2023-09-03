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

import com.example.ejercicio3.dto.Productos;
import com.example.ejercicio3.service.ProductosServiceImpl;

@RestController
@RequestMapping("/api")
public class ProductosController {

	@Autowired
	ProductosServiceImpl productosService;
	
	@GetMapping("/producto")
	public List<Productos> listarProductos(){
		return productosService.listarProductos();
	}
	
	@GetMapping("/producto/{id}")
	public Productos productosID(@PathVariable (name="id") int id) {
		return productosService.productosID(id);
	}
	
	@PostMapping("/producto")
	public Productos guardarProducto(@RequestBody Productos producto) {
		return productosService.guardarProducto(producto);
	}
	
	@PutMapping("/producto/{id}")
	public Productos actualizarProducto(@PathVariable (name="id") int id, @RequestBody Productos producto) {
		
		Productos producto_seleccionada = new Productos();
		Productos producto_actualizada = new Productos();
		
		producto_seleccionada = productosService.productosID(id);
		producto_seleccionada.setNombre(producto.getNombre());
		producto_seleccionada.setPrecio(producto.getPrecio());
		
		producto_actualizada = productosService.actualizarProducto(producto_seleccionada);
		System.out.println("Producto actualizada: " + producto_actualizada);
		
		return producto_actualizada;
	}
	
	@DeleteMapping("/producto/{id}")
	public void eliminarProducto (@PathVariable (name="id") int id) {
		productosService.eliminarProducto(id);
	}

}
