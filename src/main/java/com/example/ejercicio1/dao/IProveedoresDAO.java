package com.example.ejercicio1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ejercicio1.dto.Proveedores;

public interface IProveedoresDAO extends JpaRepository<Proveedores, String> {

}
