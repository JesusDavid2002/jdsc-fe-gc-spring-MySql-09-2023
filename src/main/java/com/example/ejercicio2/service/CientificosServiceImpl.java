package com.example.ejercicio2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ejercicio2.dao.ICientificosDAO;
import com.example.ejercicio2.dto.Cientificos;

@Service
public class CientificosServiceImpl implements ICientificosService{

	@Autowired
	ICientificosDAO iCientificosDAO;
	
	@Override
	public List<Cientificos> listarCientificos() {
		// TODO Auto-generated method stub
		return iCientificosDAO.findAll();
	}

	@Override
	public Cientificos cientificosID(String dni) {
		// TODO Auto-generated method stub
		return iCientificosDAO.findById(dni).get();
	}

	@Override
	public Cientificos guardarCientifico(Cientificos cientifico) {
		// TODO Auto-generated method stub
		return iCientificosDAO.save(cientifico);
	}

	@Override
	public Cientificos actualizarCientifico(Cientificos cientifico) {
		// TODO Auto-generated method stub
		return iCientificosDAO.save(cientifico);
	}

	@Override
	public void eliminarCientifico(String dni) {
		// TODO Auto-generated method stub
		iCientificosDAO.deleteById(dni);
	}

}
