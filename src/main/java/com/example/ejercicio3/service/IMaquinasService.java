package com.example.ejercicio3.service;

import java.util.List;

import com.example.ejercicio3.dto.MaquinasRegistradas;


public interface IMaquinasService {
	
	// Lista a todas las maquinas
	public List<MaquinasRegistradas> listarMaquinas();
	
	// Muestra al maquina con esa id
	public MaquinasRegistradas maquinasID(int id);
	
	// Guarda la maquina
	public MaquinasRegistradas guardarMaquina(MaquinasRegistradas maquina);

	// Actualiza la maquina
	public MaquinasRegistradas actualizarMaquina(MaquinasRegistradas maquina);
	
	// Elimina la maquina
	public void eliminarMaquina(int id);
		
}
