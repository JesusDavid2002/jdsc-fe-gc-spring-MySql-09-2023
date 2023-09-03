package com.example.ejercicio4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ejercicio4.dao.IInvestigadoresDAO;
import com.example.ejercicio4.dto.Investigadores;

@Service
public class InvestigadoresServiceImpl implements IInvestigadoresService{

	@Autowired
	IInvestigadoresDAO iInvestigadoresDAO;
	
	@Override
	public List<Investigadores> listarInvestigadores() {
		// TODO Auto-generated method stub
		return iInvestigadoresDAO.findAll();
	}

	@Override
	public Investigadores investigadoresID(String id) {
		// TODO Auto-generated method stub
		return iInvestigadoresDAO.findById(id).get();
	}

	@Override
	public Investigadores guardarInvestigador(Investigadores investigadores) {
		// TODO Auto-generated method stub
		return iInvestigadoresDAO.save(investigadores);
	}

	@Override
	public Investigadores actualizarInvestigador(Investigadores investigadores) {
		// TODO Auto-generated method stub
		return iInvestigadoresDAO.save(investigadores);
	}

	@Override
	public void eliminarInvestigador(String id) {
		// TODO Auto-generated method stub
		iInvestigadoresDAO.deleteById(id);
	}

}
