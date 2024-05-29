package com.mx.Clientes.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.mx.Clientes.Dao.IClienteDao;
import com.mx.Clientes.Dominio.Clientes;

@Service
public class ClienteService {
	@Autowired
	private IClienteDao repository;
	
	//para el cliente
	//LISTAR
	public List<Clientes> listarC(){
		return repository.findAll(Sort.by(Sort.Direction.ASC, "idCliente"));
	}
	//guardar Cliente 
	public void guardarC(Clientes clientes) {
	repository.save(clientes);	
	}
	//editar
	public void editarC (Clientes clientes) {
		repository.save(clientes);
	}
	//eliminar 
	public void eliminarC (Clientes clientes) {
		repository.delete(clientes);
	}
	//buscar
	public Clientes buscarC (Clientes clientes) {
		return repository.findById(clientes.getIdCliente()).orElse(null);
	} 
}
