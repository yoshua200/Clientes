package com.mx.Clientes.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mx.Clientes.Dominio.Clientes;
import com.mx.Clientes.Service.ClienteService;

@RestController
@RequestMapping(path="/Clientes")
@CrossOrigin
public class ClienteWS {
	@Autowired 
	private ClienteService service;
	//endpoint: http//localhost8004/Clientes
	//listar
	@GetMapping
	public ResponseEntity<List<Clientes>> listarC(){
		return ResponseEntity.ok(service.listarC());
	}
	
	@PostMapping ("/guardarC")
	public ResponseEntity<?> guardarC (@RequestBody Clientes clientes){
		service.guardarC(clientes);
		return ResponseEntity.ok("{\"Mensaje\":\"Se guardo el cliente con exito.\"}");
	}
	@PostMapping ("/editarC")
	public ResponseEntity<?> editarC (@RequestBody Clientes clientes){
		service.guardarC(clientes);
		return ResponseEntity.ok("{\"Mensaje\":\"Se edito el cliente con exito.\"}");
	}
	@PostMapping ("/eliminarC")
	public ResponseEntity<?> eliminarC (@RequestBody Clientes clientes){
		service.eliminarC(clientes);
		return ResponseEntity.ok("{\"Mensaje\":\"Se elimino el cliente con exito.\"}");
	}
	@PostMapping ("busvarC")
	public ResponseEntity<?> buscarC (@RequestBody Clientes clientes){
		Clientes ClienAux = service.buscarC(clientes);
		return	ResponseEntity.ok(ClienAux);
	}
	
	
}
