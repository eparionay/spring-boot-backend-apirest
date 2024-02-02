package com.bolsaideas.springboot.backend.apirest.model.services;

import java.util.*;
import com.bolsaideas.springboot.backend.apirest.model.entity.*;

public interface IClienteService {
	
	public List<Cliente> findAll();
	
	public Cliente save(Cliente cliente);
	
	public void delete(Long id);
	
	public Cliente findById(Long id);
	
	
	

}
