package com.bolsaideas.springboot.backend.apirest.model.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bolsaideas.springboot.backend.apirest.model.entity.Cliente;

@Repository
public interface IClienteDao extends CrudRepository<Cliente, Long> {

}
