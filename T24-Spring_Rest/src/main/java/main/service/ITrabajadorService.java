package main.service;

import java.util.List;

import main.dto.Trabajador;

public interface ITrabajadorService {
	
	public List<Trabajador> listarTrabajadores(); 
	
	public Trabajador guardarTrabajador (Trabajador trabajador);
	
	public Trabajador trabajadorXID(int id);
	
	public List<Trabajador> listarTrabajadorNombre(String nombre);
	
	public Trabajador actualizarTrabajador(Trabajador trabajador);
	
	public void eliminarTrabajador(int id);
	
}
