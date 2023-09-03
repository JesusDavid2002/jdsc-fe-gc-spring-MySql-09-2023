package com.example.ejercicio1.service;

import java.util.List;

import com.example.ejercicio1.dto.Piezas;

public interface IPiezasService {

	// Lista todos las piezas
	public List<Piezas> listarPiezas();
	
	// Muestra la pieza con esa id
	public Piezas piezasID(int codigo);
	
	// Guarda la pieza
	public Piezas guardarPiezas(Piezas piezas);

	// Actualiza la pieza
	public Piezas actualizarPieza(Piezas piezas);
	
	// Elimina la pieza
	public void eliminarPiezas(int codigo);
	
}
