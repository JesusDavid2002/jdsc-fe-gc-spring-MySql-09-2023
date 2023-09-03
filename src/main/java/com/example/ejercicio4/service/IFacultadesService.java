package com.example.ejercicio4.service;

import java.util.List;

import com.example.ejercicio4.dto.Facultades;


public interface IFacultadesService {
	
	// Lista a todas las facultades
	public List<Facultades> listarFacultades();
	
	// Muestra la facultad con esa id
	public Facultades facultadesID(int id);
	
	// Guarda la facultad
	public Facultades guardarFacultad(Facultades facultades);

	// Actualiza la facultad
	public Facultades actualizarFacultad(Facultades facultades);
	
	// Elimina la facultad
	public void eliminarFacultad(int id);
		
}
