package com.example.ejercicio2.service;

import java.util.List;

import com.example.ejercicio2.dto.AsignadoA;

public interface IAsignadoService {

	// Lista a todos los asignados
	public List<AsignadoA> listarAsignado();
	
	// Muestra al asignado con esa id
	public AsignadoA asignadosID(int id);
	
	// Guarda el asignado
	public AsignadoA guardarAsignado(AsignadoA asignado);

	// Actualiza el asignado
	public AsignadoA actualizarAsignado(AsignadoA asignado);
	
	// Elimina al asignado
	public void eliminarAsignado(int id);
	
}
