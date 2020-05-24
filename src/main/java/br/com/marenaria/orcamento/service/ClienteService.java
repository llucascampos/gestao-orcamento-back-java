package br.com.marenaria.orcamento.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import br.com.marenaria.orcamento.modelDB.Cliente;
import br.com.marenaria.orcamento.repository.ClienteRepository;
import br.com.marenaria.orcamento.utils.MyException;

@Service
public class ClienteService {
	
	public static final Logger log = LoggerFactory.getLogger(ClienteService.class);
	
	@Autowired
	ClienteRepository clienteRepository;
	
	public List<Cliente> todosClientes(){
		List<Cliente> clientes;
		try {
			clientes = clienteRepository.todosClientes();
		}
		catch(Exception e) {
			throw new MyException("Erro ao consultar clientes");
		}
		return clientes;
	}
	
	public String inserirCliente(Cliente cliente) {
		try {
			if(this.validandoDados(cliente)) {
				return "Cliente já existe na base";
			} 
			else {
				clienteRepository.salvarCliente(cliente);
				return "Cliente cadastrado com Sucesso";
			}					
		} 
		catch(Exception e){ 
			throw new MyException("Erro ao salvar documento: " + e.getMessage());
		}
	}
	
	public Optional<Cliente> clientePorDocumento(String documento){
		Cliente	cliente = new Cliente();
		try {
			cliente = clienteRepository.clientePorDocumento(documento);	
		}
		catch(EmptyResultDataAccessException e) {

			throw new MyException("Erro no codigo: " + e.getMessage());
		}
		return Optional.ofNullable(cliente);
	}
	
	public boolean validandoDados(Cliente cliente) {
		Optional<Cliente> clienteDaBase = null;
		try {
			clienteDaBase = clientePorDocumento(cliente.getDocumento());
			if(clienteDaBase.isPresent()) {
				return true;
			}
		}
			catch(Exception e){ 
					log.info("Erro ao salvar cliente: " + e.getMessage() );
					throw new MyException(e.getMessage());
			}
		return false;
			
		}
	
	
	
}
