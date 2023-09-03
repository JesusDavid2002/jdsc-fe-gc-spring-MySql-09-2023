package com.example.ejercicio1.service;

import java.util.List;

import com.example.ejercicio1.dto.Proveedores;

public interface IProveedoresService {

	// Lista todos los proveedores
	public List<Proveedores> listarProveedores();
	
	// Muestra el proveedores con esa id
	public Proveedores proveedoresID(String id);
	
	// Guarda el proveedor
	public Proveedores guardarProveedores(Proveedores proveedores);

	// Actualiza el proveedor
	public Proveedores actualizarProveedores(Proveedores proveedores);
	
	// Elimina al proveedor
	public void eliminarProveedores(String id);

}
