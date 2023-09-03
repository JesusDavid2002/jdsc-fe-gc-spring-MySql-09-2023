package com.example.ejercicio2.service;

import java.util.List;

import com.example.ejercicio2.dto.Cientificos;

public interface ICientificosService {

	// Lista a todos los cientifico
	public List<Cientificos> listarCientificos();
	
	// Muestra al cientifico con ese dni
	public Cientificos cientificosID(String dni);
	
	// Guarda el cientifico
	public Cientificos guardarCientifico(Cientificos cientifico);

	// Actualiza el cientifico
	public Cientificos actualizarCientifico(Cientificos cientifico);
	
	// Elimina al cientifico
	public void eliminarCientifico(String dni);
	
}
