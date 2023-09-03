package com.example.ejercicio3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ejercicio3.dao.IMaquinasDAO;
import com.example.ejercicio3.dto.MaquinasRegistradas;

@Service
public class MaquinasServiceImpl implements IMaquinasService{
	
	@Autowired
	IMaquinasDAO iMaquinasDAO;

	@Override
	public List<MaquinasRegistradas> listarMaquinas() {
		// TODO Auto-generated method stub
		return iMaquinasDAO.findAll();
	}

	@Override
	public MaquinasRegistradas maquinasID(int id) {
		// TODO Auto-generated method stub
		return iMaquinasDAO.findById(id).get();
	}

	@Override
	public MaquinasRegistradas guardarMaquina(MaquinasRegistradas maquina) {
		// TODO Auto-generated method stub
		return iMaquinasDAO.save(maquina);
	}

	@Override
	public MaquinasRegistradas actualizarMaquina(MaquinasRegistradas maquina) {
		// TODO Auto-generated method stub
		return iMaquinasDAO.save(maquina);
	}

	@Override
	public void eliminarMaquina(int id) {
		// TODO Auto-generated method stub
		iMaquinasDAO.deleteById(id);
	}
}
