package com.example.ejercicio2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ejercicio2.dto.Proyectos;

public interface IProyectosDAO extends JpaRepository<Proyectos, String>{

}
