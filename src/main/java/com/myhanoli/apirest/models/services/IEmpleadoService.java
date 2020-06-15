package com.myhanoli.apirest.models.services;

import java.util.List;

import com.myhanoli.apirest.models.entity.Empleado;

public interface IEmpleadoService {
	
	public List<Empleado> findAll();

}
