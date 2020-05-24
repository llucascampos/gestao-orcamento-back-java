package br.com.marenaria.orcamento.repository;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import br.com.marenaria.orcamento.modelDB.Material;

@Repository
public class MaterialRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	private Date dataAtual = new Date();
	
	private RowMapper<Material> map(){
		RowMapper<Material> map = (rs, row) ->{
			Material material = new Material();
			material.setId(rs.getInt("id"));
			material.setNome(rs.getString("nome"));
			material.setMarca(rs.getString("marca"));
			material.setPreco(rs.getDouble("preco"));
			material.setDesc(rs.getString("descricao"));
			material.setStatus(rs.getInt("acao"));
			
			return material;
		};
		
		return map;
	}
	
	
	static final String TODOS_MATERIAIS = "select * from material";
	public List<Material> todosMaterias(){
		return jdbcTemplate.query(TODOS_MATERIAIS, map());
	}
	
	static final String MATERIAL_POR_ID = "select * from material where id = ?";
	public Material materialPorId(int id) {
		return jdbcTemplate.queryForObject(MATERIAL_POR_ID, map(), id);
	}
	
	static final String MATERIAL_POR_NOME = "select * from material where nome = ?";
	public Material materialPorNome(Material material) {
		return jdbcTemplate.queryForObject(MATERIAL_POR_NOME, map(), material.getNome());
	}
	
	static final String INSERIR_MATERIAL = " insert into material (nome, marca, preco, descricao, acao) values(?, ?, ?, ?, ?)";
	public int inserirMaterial(Material material) {
		return jdbcTemplate.update(INSERIR_MATERIAL, new Object[] {material.getNome(), material.getMarca(), material.getPreco(), material.getDesc(), 1});
	}
	
}
