package com.modelo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.modelo.entity.Programador;

public interface ProgramadorRepository extends JpaRepository<Programador, Integer>{

	@Query("select p from Programador p where p.sueldo>?1")
	public List<Programador> findBySueldo(double sue);
}
