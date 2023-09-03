package com.example.ejercicio1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ejercicio1.dao.IProveedoresDAO;
import com.example.ejercicio1.dto.Proveedores;

@Service
public class ProveedoresServiceImpl implements IProveedoresService{

	@Autowired
	IProveedoresDAO iProveedoresDAO;
	
	@Override
	public List<Proveedores> listarProveedores() {
		// TODO Auto-generated method stub
		return iProveedoresDAO.findAll();
	}

	@Override
	public Proveedores proveedoresID(String id) {
		// TODO Auto-generated method stub
		return iProveedoresDAO.findById(id).get();
	}

	@Override
	public Proveedores guardarProveedores(Proveedores proveedores) {
		// TODO Auto-generated method stub
		return iProveedoresDAO.save(proveedores);
	}

	@Override
	public Proveedores actualizarProveedores(Proveedores proveedores) {
		// TODO Auto-generated method stub
		return iProveedoresDAO.save(proveedores);
	}

	@Override
	public void eliminarProveedores(String id) {
		// TODO Auto-generated method stub
		iProveedoresDAO.deleteById(id);
	}

}
