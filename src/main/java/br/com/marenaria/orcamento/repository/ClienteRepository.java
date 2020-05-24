package br.com.marenaria.orcamento.repository;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import br.com.marenaria.orcamento.modelDB.Cliente;

@Repository
public class ClienteRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	private Date dataAtual = new Date();
	
	private RowMapper<Cliente> map(){ 
		RowMapper<Cliente> map = (rs, row) -> {
			Cliente cliente = new Cliente();
			 
	        cliente.setId(rs.getInt("id"));
	        cliente.setNome(rs.getString("nome"));
	        cliente.setEmail(rs.getString("email"));
	        cliente.setTelefone(rs.getString("telefone"));
	        cliente.setData_nascimento(rs.getDate("data_nascimento"));
	        cliente.setDocumento(rs.getString("documento"));
	        cliente.setSexo(rs.getString("sexo"));
	        cliente.setStatus(rs.getInt("acao"));
	        
			return cliente;
			
		};
		return map;
	}
	
	public static final String CLIENTE_POR_ID = "select * from cliente where id = ?";
	public Cliente clientePorId(int id) {
		return jdbcTemplate.queryForObject(CLIENTE_POR_ID, map(), id);
	}
	   
	public static final String CLIENTE_POR_DOCUMENTO = "select * from cliente where documento = ?";
	public Cliente clientePorDocumento(String documento) {
		return jdbcTemplate.queryForObject(CLIENTE_POR_DOCUMENTO, map(), documento);
	}
	  
	
	public static final String INSERIR_CLIENTE = "insert into cliente(nome, email, telefone, documento, data_nascimento, sexo, acao) values(?, ?, ?, ?, ?, ?, ?)";
	public int salvarCliente(Cliente novoCliente) {
		return this.jdbcTemplate.update(INSERIR_CLIENTE, new Object[] {novoCliente.getNome(), novoCliente.getEmail(), novoCliente.getTelefone(), novoCliente.getDocumento(), novoCliente.getData_nascimento(), novoCliente.getSexo(), 1 });
	}
	
	public static final String TODOSCLIENTES = "select * from cliente";
	public List<Cliente> todosClientes(){
		return jdbcTemplate.query(TODOSCLIENTES, map());
	}
	
}
