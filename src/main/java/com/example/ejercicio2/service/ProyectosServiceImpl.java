package com.example.ejercicio2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ejercicio2.dao.IProyectosDAO;
import com.example.ejercicio2.dto.Proyectos;

@Service
public class ProyectosServiceImpl implements IProyectosService{

	@Autowired
	IProyectosDAO iProyectosDAO;
	
	@Override
	public List<Proyectos> listarProyectos() {
		// TODO Auto-generated method stub
		return iProyectosDAO.findAll();
	}

	@Override
	public Proyectos proyectosID(String id) {
		// TODO Auto-generated method stub
		return iProyectosDAO.findById(id).get();
	}

	@Override
	public Proyectos guardarProyecto(Proyectos proyecto) {
		// TODO Auto-generated method stub
		return iProyectosDAO.save(proyecto);
	}

	@Override
	public Proyectos actualizarProyecto(Proyectos proyecto) {
		// TODO Auto-generated method stub
		return iProyectosDAO.save(proyecto);
	}

	@Override
	public void eliminarProyecto(String id) {
		// TODO Auto-generated method stub
		iProyectosDAO.deleteById(id);
	}

}
