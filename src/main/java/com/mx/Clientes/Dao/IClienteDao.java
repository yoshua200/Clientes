package com.mx.Clientes.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.Clientes.Dominio.Clientes;

public interface IClienteDao extends  JpaRepository<Clientes, Integer>{
	List<Clientes> findByIdCliente(int idCliente);
}
