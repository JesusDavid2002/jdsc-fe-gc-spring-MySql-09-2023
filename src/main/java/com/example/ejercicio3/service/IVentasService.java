package com.example.ejercicio3.service;

import java.util.List;

import com.example.ejercicio3.dto.Ventas;

public interface IVentasService {
	// Lista a todas las ventas
		public List<Ventas> listarVentas();
		
		// Muestra la venta con esa id
		public Ventas ventasID(int id);
		
		// Guarda la venta
		public Ventas guardarVenta(Ventas venta);

		// Actualiza la venta
		public Ventas actualizarVenta(Ventas venta);
		
		// Elimina la venta
		public void eliminarVenta(int id);
			
}
