package com.myhanoli.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.myhanoli.apirest.models.entity.Empleado;

public interface IEmpleadoDao extends CrudRepository<Empleado, Long> {

}
