package com.example.ejercicio3.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ejercicio3.dto.Productos;

public interface IProductosDAO extends JpaRepository<Productos, Integer>{

}
