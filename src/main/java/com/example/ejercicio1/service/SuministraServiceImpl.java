package com.example.ejercicio1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ejercicio1.dao.ISuministraDAO;
import com.example.ejercicio1.dto.Suministra;

@Service
public class SuministraServiceImpl implements ISuministraService{

	@Autowired
	ISuministraDAO iSuministraDAO;
	
	@Override
	public List<Suministra> listarSuministros() {
		// TODO Auto-generated method stub
		return iSuministraDAO.findAll();
	}

	@Override
	public Suministra suministroID(int id) {
		// TODO Auto-generated method stub
		return iSuministraDAO.findById(id).get();
	}

	@Override
	public Suministra guardarSuministro(Suministra suministra) {
		// TODO Auto-generated method stub
		return iSuministraDAO.save(suministra);
	}

	@Override
	public Suministra actualizarSuministro(Suministra suministra) {
		// TODO Auto-generated method stub
		return iSuministraDAO.save(suministra);
	}

	@Override
	public void eliminarSuministro(int id) {
		// TODO Auto-generated method stub
		iSuministraDAO.deleteById(id);
	}

}
