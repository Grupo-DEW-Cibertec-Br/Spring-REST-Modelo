package com.modelo.controller;

import java.util.List;
import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.modelo.entity.Programador;
import com.modelo.service.ProgramadorService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/programador")
public class ProgramadorController {
	@Autowired
	private ProgramadorService servicio;
	
	
	@GetMapping("/lista")
	public List<Programador> lista(){
		return servicio.listarTodos();
	}
	@GetMapping("/consulta/{sueldo}")
	public List<Programador> consulta(@PathVariable("sueldo") double sue){
		return servicio.consultaSueldo(sue);
	}
	@PostMapping("/registrar")
	public void registrar(@RequestBody Programador bean){
		servicio.registrar(bean);
	}
	@GetMapping("/error")
	public Exception error(){
		return new Exception();
	}
	
}
