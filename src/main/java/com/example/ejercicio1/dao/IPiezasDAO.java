package com.example.ejercicio1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ejercicio1.dto.Piezas;

public interface IPiezasDAO extends JpaRepository<Piezas, Integer> {

}
