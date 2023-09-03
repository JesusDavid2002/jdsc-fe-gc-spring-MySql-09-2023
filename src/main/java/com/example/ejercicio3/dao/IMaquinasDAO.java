package com.example.ejercicio3.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ejercicio3.dto.MaquinasRegistradas;

public interface IMaquinasDAO extends JpaRepository<MaquinasRegistradas, Integer>{

}
