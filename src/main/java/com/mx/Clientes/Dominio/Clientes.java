package com.mx.Clientes.Dominio;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table
@Data
public class Clientes {

	@Id
	private int idCliente;
	private String nombre;
	private String apellido;
	private int edad;
	private String domicilio;
	private int tiendaId;
}
