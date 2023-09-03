package com.example.ejercicio4.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ejercicio4.dto.Reservas;

public interface IReservasDAO extends JpaRepository<Reservas, Integer>{

}
