package com.myhanoli.apirest.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
		
		return empleadoService.getEmpleados();
		
	}
	
	
	@GetMapping("/empleado/{id}")
	public Empleado getEmpleado(@PathVariable Long id) {
		return empleadoService.getEmpleado(id);
	}
	
	
	@PostMapping("/guardar")
	public Empleado guardar(@RequestBody Empleado empleado) {
		
		return empleadoService.guardar(empleado);
	}
	
	
	@PutMapping("/actualizar/{id}")
	public Empleado actualizar(@RequestBody Empleado empleado , @PathVariable Long id ) {
		
		Empleado empleadoActual = empleadoService.getEmpleado(id);
		
		empleadoActual.setNombre(empleado.getNombre());
		empleadoActual.setApellido(empleado.getApellido());
		empleadoActual.setEmail(empleado.getEmail());
		
		return empleadoService.guardar(empleadoActual);
		
	}
	
	
	
	
	
}
