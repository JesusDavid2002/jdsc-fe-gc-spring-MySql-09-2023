package com.example.ejercicio4.service;

import java.util.List;

import com.example.ejercicio4.dto.Equipos;


public interface IEquiposService {
	
	// Lista a todos los equipos
	public List<Equipos> listarEquipos();
	
	// Muestra al equipo con esa id
	public Equipos equiposID(String id);
	
	// Guarda el equipo
	public Equipos guardarEquipo(Equipos equipos);

	// Actualiza el equipo
	public Equipos actualizarEquipo(Equipos equipos);
	
	// Elimina al equipo
	public void eliminarEquipo(String id);
		
}
