package com.myhanoli.apirest.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.myhanoli.apirest.models.entity.Empleado;
import com.myhanoli.apirest.models.services.IEmpleadoService;


@RestController
@RequestMapping("/api")
public class EmpleadoRestController {

	
	@Autowired
	private IEmpleadoService empleadoService;
	
	@GetMapping("/empleados")
	public List<Empleado> getEmpleados(){
		
		return empleadoService.findAll();
		
	}
	
	
	
}
