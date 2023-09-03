package com.example.ejercicio4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ejercicio4.dao.IReservasDAO;
import com.example.ejercicio4.dto.Reservas;

@Service
public class ReservasServiceImpl implements IReservasService{

	@Autowired
	IReservasDAO iReservasDAO;
	
	@Override
	public List<Reservas> listarReservas() {
		// TODO Auto-generated method stub
		return iReservasDAO.findAll();
	}

	@Override
	public Reservas reservasID(int id) {
		// TODO Auto-generated method stub
		return iReservasDAO.findById(id).get();
	}

	@Override
	public Reservas guardarReserva(Reservas reservas) {
		// TODO Auto-generated method stub
		return iReservasDAO.save(reservas);
	}

	@Override
	public Reservas actualizarReserva(Reservas reservas) {
		// TODO Auto-generated method stub
		return iReservasDAO.save(reservas);
	}

	@Override
	public void eliminarReserva(int id) {
		// TODO Auto-generated method stub
		iReservasDAO.deleteById(id);
	}

}
