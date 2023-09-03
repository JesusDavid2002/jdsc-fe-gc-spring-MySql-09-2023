package com.example.ejercicio4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ejercicio4.dao.IFacultadesDAO;
import com.example.ejercicio4.dto.Facultades;

@Service
public class FacultadesServiceImpl implements IFacultadesService{

	@Autowired
	IFacultadesDAO iFacultadesDAO;
	
	@Override
	public List<Facultades> listarFacultades() {
		// TODO Auto-generated method stub
		return iFacultadesDAO.findAll();
	}

	@Override
	public Facultades facultadesID(int id) {
		// TODO Auto-generated method stub
		return iFacultadesDAO.findById(id).get();
	}

	@Override
	public Facultades guardarFacultad(Facultades facultades) {
		// TODO Auto-generated method stub
		return iFacultadesDAO.save(facultades);
	}

	@Override
	public Facultades actualizarFacultad(Facultades facultades) {
		// TODO Auto-generated method stub
		return iFacultadesDAO.save(facultades);
	}

	@Override
	public void eliminarFacultad(int id) {
		// TODO Auto-generated method stub
		iFacultadesDAO.deleteById(id);
	}

}
