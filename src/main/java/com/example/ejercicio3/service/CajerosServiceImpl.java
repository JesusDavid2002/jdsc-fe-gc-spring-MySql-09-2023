package com.example.ejercicio3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ejercicio3.dao.ICajerosDAO;
import com.example.ejercicio3.dto.Cajeros;

@Service
public class CajerosServiceImpl implements ICajerosService{
	
	@Autowired
	ICajerosDAO iCajerosDAO;

	@Override
	public List<Cajeros> listarCajeros() {
		// TODO Auto-generated method stub
		return iCajerosDAO.findAll();
	}

	@Override
	public Cajeros cajerosID(int id) {
		// TODO Auto-generated method stub
		return iCajerosDAO.findById(id).get();
	}

	@Override
	public Cajeros guardarCajero(Cajeros cajeros) {
		// TODO Auto-generated method stub
		return iCajerosDAO.save(cajeros);
	}

	@Override
	public Cajeros actualizarCajero(Cajeros cajeros) {
		// TODO Auto-generated method stub
		return iCajerosDAO.save(cajeros);
	}

	@Override
	public void eliminarCajero(int id) {
		// TODO Auto-generated method stub
		iCajerosDAO.deleteById(id);
	}
}
