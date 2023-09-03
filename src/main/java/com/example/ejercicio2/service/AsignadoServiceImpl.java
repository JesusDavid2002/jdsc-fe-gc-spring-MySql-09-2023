package com.example.ejercicio2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ejercicio2.dao.IAsignadoDAO;
import com.example.ejercicio2.dto.AsignadoA;

@Service
public class AsignadoServiceImpl implements IAsignadoService{

	@Autowired
	IAsignadoDAO iAsigandoDAO;
	
	@Override
	public List<AsignadoA> listarAsignado() {
		// TODO Auto-generated method stub
		return iAsigandoDAO.findAll();
	}

	@Override
	public AsignadoA asignadosID(int id) {
		// TODO Auto-generated method stub
		return iAsigandoDAO.findById(id).get();
	}

	@Override
	public AsignadoA guardarAsignado(AsignadoA asignado) {
		// TODO Auto-generated method stub
		return iAsigandoDAO.save(asignado);
	}

	@Override
	public AsignadoA actualizarAsignado(AsignadoA asignado) {
		// TODO Auto-generated method stub
		return iAsigandoDAO.save(asignado);
	}

	@Override
	public void eliminarAsignado(int id) {
		// TODO Auto-generated method stub
		iAsigandoDAO.deleteById(id);
	}

}
