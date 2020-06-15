package com.myhanoli.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myhanoli.apirest.models.dao.IEmpleadoDao;
import com.myhanoli.apirest.models.entity.Empleado;

@Service
public class IEmpleadoServiceImpl implements IEmpleadoService{

	@Autowired
	public IEmpleadoDao empleadoDao;
		
	@Override
	public List<Empleado> findAll() {
		
		return (List<Empleado>) empleadoDao.findAll();
		
	}

	
	
	
}
