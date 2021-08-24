package main.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import main.dto.Trabajador;

public interface ITrabajadorDAO extends JpaRepository<Trabajador, Integer>{
	public List<Trabajador> findByNombre(String nombre);
}
