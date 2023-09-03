package com.example.ejercicio3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ejercicio3.dao.IVentasDAO;
import com.example.ejercicio3.dto.Ventas;

@Service
public class VentasServiceImpl implements IVentasService{
	
	@Autowired
	IVentasDAO iVentasDAO;

	@Override
	public List<Ventas> listarVentas() {
		// TODO Auto-generated method stub
		return iVentasDAO.findAll();
	}

	@Override
	public Ventas ventasID(int id) {
		// TODO Auto-generated method stub
		return iVentasDAO.findById(id).get();
	}

	@Override
	public Ventas guardarVenta(Ventas venta) {
		// TODO Auto-generated method stub
		return iVentasDAO.save(venta);
	}

	@Override
	public Ventas actualizarVenta(Ventas venta) {
		// TODO Auto-generated method stub
		return iVentasDAO.save(venta);
	}

	@Override
	public void eliminarVenta(int id) {
		// TODO Auto-generated method stub
		iVentasDAO.deleteById(id);
	}
}
