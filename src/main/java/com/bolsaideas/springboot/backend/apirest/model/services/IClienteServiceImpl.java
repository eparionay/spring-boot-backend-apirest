package com.bolsaideas.springboot.backend.apirest.model.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bolsaideas.springboot.backend.apirest.model.dao.IClienteDao;
import com.bolsaideas.springboot.backend.apirest.model.entity.Cliente;

@Service
public class IClienteServiceImpl implements IClienteService {

	@Autowired
	private IClienteDao clienteDao;
	
	//readOnly porque es un select
	@Override
	@Transactional(readOnly = true)
	public List<Cliente> findAll() {
		return (List<Cliente>) clienteDao.findAll();
	}

	@Override
	@Transactional
	public Cliente save(Cliente cliente) {
		return clienteDao.save(cliente);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		clienteDao.deleteById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public Cliente findById(Long id) {
		return clienteDao.findById(id).orElse(null);
	}

	
	
	
	
}
