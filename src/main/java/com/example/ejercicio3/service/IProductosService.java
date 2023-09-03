package com.example.ejercicio3.service;

import java.util.List;

import com.example.ejercicio3.dto.Productos;

public interface IProductosService {

	// Lista todos los productos
	public List<Productos> listarProductos();
	
	// Muestra el producto con esa id
	public Productos productosID(int id);
	
	// Guarda el producto
	public Productos guardarProducto(Productos producto);

	// Actualiza el producto
	public Productos actualizarProducto(Productos producto);
	
	// Elimina el producto
	public void eliminarProducto(int id);
		
}
