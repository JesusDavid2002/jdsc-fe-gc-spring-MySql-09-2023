package com.example.ejercicio1.service;

import java.util.List;

import com.example.ejercicio1.dto.Suministra;

public interface ISuministraService {

	// Lista todos los suministros
	public List<Suministra> listarSuministros();
	
	// Muestra el suministro con esa id
	public Suministra suministroID(int id);
	
	// Guarda el suministro
	public Suministra guardarSuministro(Suministra suministra);

	// Actualiza el suministro
	public Suministra actualizarSuministro(Suministra suministra);
	
	// Elimina al suministro
	public void eliminarSuministro(int id);
}
