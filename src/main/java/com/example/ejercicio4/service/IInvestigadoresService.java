package com.example.ejercicio4.service;

import java.util.List;

import com.example.ejercicio4.dto.Investigadores;


public interface IInvestigadoresService {
	
	// Lista a todos los investigadores
	public List<Investigadores> listarInvestigadores();
	
	// Muestra al investigador con esa id
	public Investigadores investigadoresID(String id);
	
	// Guarda al investigador
	public Investigadores guardarInvestigador(Investigadores investigadores);

	// Actualiza al investigador
	public Investigadores actualizarInvestigador(Investigadores investigadores);
	
	// Elimina al investigador
	public void eliminarInvestigador(String id);
		
}
