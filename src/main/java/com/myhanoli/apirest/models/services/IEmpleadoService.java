package com.myhanoli.apirest.models.services;

import java.util.List;

import com.myhanoli.apirest.models.entity.Empleado;

public interface IEmpleadoService {
	
	public List<Empleado> getEmpleados();

	public Empleado getEmpleado(Long id);
	
	public Empleado guardar(Empleado empleado);
	
	public void eliminarbyId(Long id);
	
}
