package br.com.marenaria.orcamento.controller;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.marenaria.orcamento.controller.retorno.RetornoString;
import br.com.marenaria.orcamento.modelDB.Cliente;
import br.com.marenaria.orcamento.service.ClienteService;

@Controller
@RequestMapping(value="/cliente")
@CrossOrigin("*")
public class ClienteController {

	public static final Logger log = LoggerFactory.getLogger(ClienteController.class);
	
	@Autowired
	ClienteService clienteService;
	
	@GetMapping
	public ResponseEntity<?> todosClientes(){
		return ResponseEntity.ok().body(clienteService.todosClientes());
	}
	
	@PostMapping(value="/salvar")
	public ResponseEntity<?> salvarCliente(@RequestBody Cliente cliente){
		RetornoString retorno = new RetornoString(clienteService.inserirCliente(cliente));
		return ResponseEntity.ok().body(retorno);	
	}
		
	
	
	@GetMapping(value="/{documento}")
	public ResponseEntity<?> clientePorDocumento(@PathVariable String documento){
	
		Optional<Cliente> cliente = clienteService.clientePorDocumento(documento);
			return ResponseEntity.ok().body(cliente);
	}
	
}
