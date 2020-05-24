package br.com.marenaria.orcamento.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.marenaria.orcamento.controller.retorno.RetornoString;
import br.com.marenaria.orcamento.modelDB.Material;
import br.com.marenaria.orcamento.service.MaterialService;

@Controller
@RequestMapping(value = "/material")
public class MaterialController {

	@Autowired
	MaterialService materialService;
	
	@GetMapping()
	public ResponseEntity<?> listaMateriais(){
		List<Material> materiais = materialService.materiais();
		return ResponseEntity.ok().body(materiais);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<?> materialPorNome(@PathVariable int id){
		Optional<Material> material = materialService.materialPorId(id);
		return ResponseEntity.ok().body(material);	
	}
	
	@PostMapping(value = "/salvar")
	public ResponseEntity<?> salvarMaterial(@RequestBody Material material) {
		RetornoString retorno = new RetornoString(materialService.inserirMaterial(material));
		return ResponseEntity.ok().body(retorno);
	}
	


}

