package com.example.ejercicio4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ejercicio4.dao.IEquiposDAO;
import com.example.ejercicio4.dto.Equipos;

@Service
public class EquiposServiceImpl implements IEquiposService{

	@Autowired
	IEquiposDAO iEquiposDAO;
	
	@Override
	public List<Equipos> listarEquipos() {
		// TODO Auto-generated method stub
		return iEquiposDAO.findAll();
	}

	@Override
	public Equipos equiposID(String id) {
		// TODO Auto-generated method stub
		return iEquiposDAO.findById(id).get();
	}

	@Override
	public Equipos guardarEquipo(Equipos equipos) {
		// TODO Auto-generated method stub
		return iEquiposDAO.save(equipos);
	}

	@Override
	public Equipos actualizarEquipo(Equipos equipos) {
		// TODO Auto-generated method stub
		return iEquiposDAO.save(equipos);
	}

	@Override
	public void eliminarEquipo(String id) {
		// TODO Auto-generated method stub
		iEquiposDAO.deleteById(id);
	}

}
