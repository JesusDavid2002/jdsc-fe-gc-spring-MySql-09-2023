package com.example.ejercicio3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ejercicio3.dao.IProductosDAO;
import com.example.ejercicio3.dto.Productos;

@Service
public class ProductosServiceImpl implements IProductosService{
	
	@Autowired
	IProductosDAO iProductosDAO;

	@Override
	public List<Productos> listarProductos() {
		// TODO Auto-generated method stub
		return iProductosDAO.findAll();
	}

	@Override
	public Productos productosID(int id) {
		// TODO Auto-generated method stub
		return iProductosDAO.findById(id).get();
	}

	@Override
	public Productos guardarProducto(Productos producto) {
		// TODO Auto-generated method stub
		return iProductosDAO.save(producto);
	}

	@Override
	public Productos actualizarProducto(Productos producto) {
		// TODO Auto-generated method stub
		return iProductosDAO.save(producto);
	}

	@Override
	public void eliminarProducto(int id) {
		// TODO Auto-generated method stub
		iProductosDAO.deleteById(id);
	}
}
