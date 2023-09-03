package com.example.ejercicio4.service;

import java.util.List;

import com.example.ejercicio4.dto.Reservas;


public interface IReservasService {
	
	// Lista a todas las reservas
	public List<Reservas> listarReservas();
	
	// Muestra la reserva con esa id
	public Reservas reservasID(int id);
	
	// Guarda la reserva
	public Reservas guardarReserva(Reservas reservas);

	// Actualiza la reserva
	public Reservas actualizarReserva(Reservas reservas);
	
	// Elimina la reserva
	public void eliminarReserva(int id);
		
}
