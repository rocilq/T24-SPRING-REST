package main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import main.dao.ITrabajadorDAO;
import main.dto.Trabajador;

public class TrabajadorServiceImpl implements ITrabajadorService{
	
	@Autowired
	ITrabajadorDAO iTrabajadorDAO;
	
	@Override
	public List<Trabajador> listarTrabajadores() {
		// TODO Auto-generated method stub
		return iTrabajadorDAO.findAll();
	}

	@Override
	public Trabajador guardarTrabajador(Trabajador trabajador) {
		// TODO Auto-generated method stub
		return iTrabajadorDAO.save(trabajador);
	}

	@Override
	public Trabajador trabajadorXID(int id) {
		// TODO Auto-generated method stub
		return iTrabajadorDAO.findById(id).get();
	}

	@Override
	public List<Trabajador> listarTrabajadorNombre(String nombre) {
		// TODO Auto-generated method stub
		return iTrabajadorDAO.findByNombre(nombre);
	}

	@Override
	public Trabajador actualizarTrabajador(Trabajador trabajador) {
		// TODO Auto-generated method stub
		return iTrabajadorDAO.save(trabajador);
	}

	@Override
	public void eliminarTrabajador(int id) {
		// TODO Auto-generated method stub
		iTrabajadorDAO.deleteById(id);
	}

}
