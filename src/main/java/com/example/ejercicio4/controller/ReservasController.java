package com.example.ejercicio4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ejercicio4.dto.Reservas;
import com.example.ejercicio4.service.ReservasServiceImpl;



@RestController
@RequestMapping("/api")
public class ReservasController {
	
	@Autowired
	ReservasServiceImpl ReservasService;
	
	@GetMapping("/reserva")
	public List<Reservas> listarReservas(){
		return ReservasService.listarReservas();
	}
	
	@GetMapping("/reserva/{id}")
	public Reservas reservasID(@PathVariable (name="id") int id) {
		return ReservasService.reservasID(id);
	}
	
	@PostMapping("/reserva")
	public Reservas guardarReserva(@RequestBody Reservas reserva) {
		return ReservasService.guardarReserva(reserva);
	}
	
	@PutMapping("/reserva/{id}")
	public Reservas actualizarReserva(@PathVariable (name="id") int id, @RequestBody Reservas reserva) {
		
		Reservas reserva_seleccionada = new Reservas();
		Reservas reserva_actualizada = new Reservas();
		
		reserva_seleccionada = ReservasService.reservasID(id);
		reserva_seleccionada.setComienzo(reserva.getComienzo());
		reserva_seleccionada.setFin(reserva.getFin());
		reserva_seleccionada.setInvestigadores(reserva.getInvestigadores());
		reserva_seleccionada.setEquipos(reserva.getEquipos());
		
		reserva_actualizada = ReservasService.actualizarReserva(reserva_seleccionada);
		System.out.println("reserva actualizada: " + reserva_actualizada);
		
		return reserva_actualizada;
	}
	
	@DeleteMapping("/reserva/{id}")
	public void eliminarReserva (@PathVariable (name="id") int id) {
		ReservasService.eliminarReserva(id);
	}

}
