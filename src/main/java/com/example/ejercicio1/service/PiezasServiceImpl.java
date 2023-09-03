package com.example.ejercicio1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ejercicio1.dao.IPiezasDAO;
import com.example.ejercicio1.dto.Piezas;

@Service
public class PiezasServiceImpl implements IPiezasService{

	@Autowired
	IPiezasDAO iPiezasDAO;
	
	@Override
	public List<Piezas> listarPiezas() {
		// TODO Auto-generated method stub
		return iPiezasDAO.findAll();
	}

	@Override
	public Piezas piezasID(int codigo) {
		// TODO Auto-generated method stub
		return iPiezasDAO.findById(codigo).get();
	}

	@Override
	public Piezas guardarPiezas(Piezas piezas) {
		// TODO Auto-generated method stub
		return iPiezasDAO.save(piezas);
	}

	@Override
	public Piezas actualizarPieza(Piezas piezas) {
		// TODO Auto-generated method stub
		return iPiezasDAO.save(piezas);
	}

	@Override
	public void eliminarPiezas(int codigo) {
		// TODO Auto-generated method stub
		iPiezasDAO.deleteById(codigo);
	}

}
