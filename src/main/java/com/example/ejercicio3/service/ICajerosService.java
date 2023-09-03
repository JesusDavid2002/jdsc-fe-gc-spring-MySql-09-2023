package com.example.ejercicio3.service;

import java.util.List;

import com.example.ejercicio3.dto.Cajeros;


public interface ICajerosService {

	// Lista a todos los cajeros
	public List<Cajeros> listarCajeros();
	
	// Muestra al cajero con esa id
	public Cajeros cajerosID(int id);
	
	// Guarda el cajero
	public Cajeros guardarCajero(Cajeros cajeros);

	// Actualiza el cajero
	public Cajeros actualizarCajero(Cajeros cajeros);
	
	// Elimina al cajero
	public void eliminarCajero(int id);
	
}
