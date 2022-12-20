package com.modelo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.modelo.dao.ProgramadorRepository;
import com.modelo.entity.Programador;

@Service
public class ProgramadorService {
	@Autowired
	private ProgramadorRepository repo;
	
	public void registrar(Programador bean) {
		repo.save(bean);
	}
	public List<Programador> listarTodos(){
		return repo.findAll();
	}
	public List<Programador> consultaSueldo(double sue){
		return repo.findBySueldo(sue);
	}
	
}
