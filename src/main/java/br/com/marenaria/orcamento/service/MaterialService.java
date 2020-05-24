package br.com.marenaria.orcamento.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import br.com.marenaria.orcamento.modelDB.Material;
import br.com.marenaria.orcamento.repository.MaterialRepository;
import br.com.marenaria.orcamento.utils.MyException;

@Service
public class MaterialService {
	
	public static final Logger log = LoggerFactory.getLogger(MaterialService.class);

	@Autowired
	MaterialRepository materialRepo;
	
	
	public List<Material> materiais(){
		try {
			return materialRepo.todosMaterias();
		}
		catch(Exception e) {
			log.info(e.getMessage());
			throw new MyException("Ops, Ocorreu um erro");
		}
	}
	
	public String inserirMaterial(Material material) {
		try {
			if(validandoMaterial(material)) {
				return "Material já existente";
			}else {
				materialRepo.inserirMaterial(material);
				return "Salvo Com Sucesso";
			}			
		}
		catch(Exception e ) {
			log.info(e.getMessage());
			throw new MyException("Erro: " + e.getMessage());
		}
	}
	
	public Optional<Material> materialPorId(int id){
		Material materialJaRegistrado = new Material();
		
		try {
			materialJaRegistrado = materialRepo.materialPorId(id);
		}
		catch(EmptyResultDataAccessException e) {
			throw new MyException("Material não existe no sistema");
		}
		catch(Exception e) {
			throw new MyException("Erro" + e.getMessage());
		}
		
		return Optional.ofNullable(materialJaRegistrado);
	}
	
	
	public boolean validandoMaterial(Material material) {
		Material materialRegistrado = null;
		try {
			materialRegistrado = materialRepo.materialPorNome(material);
			log.info("*********Material: " + materialRegistrado);
			log.info("*********Material: " + materialRegistrado.getNome());
			if(materialRegistrado.getNome() != null) {
				return true;
			}
		}
		catch(EmptyResultDataAccessException e) {
			return false;
		}
		
		return false;
	}
	
}
