package com.example.ejercicio3.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ejercicio3.dto.Ventas;

public interface IVentasDAO extends JpaRepository<Ventas, Integer>{

}
