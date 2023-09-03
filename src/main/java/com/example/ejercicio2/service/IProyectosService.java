package com.example.ejercicio2.service;

import java.util.List;

import com.example.ejercicio2.dto.Proyectos;

public interface IProyectosService {

	// Lista a todos los cientifico
	public List<Proyectos> listarProyectos();
	
	// Muestra el proyecto con esa id
	public Proyectos proyectosID(String id);
	
	// Guarda el proyecto
	public Proyectos guardarProyecto(Proyectos proyecto);

	// Actualiza el proyecto
	public Proyectos actualizarProyecto(Proyectos proyecto);
	
	// Elimina un proyecto
	public void eliminarProyecto(String id);
	
}
