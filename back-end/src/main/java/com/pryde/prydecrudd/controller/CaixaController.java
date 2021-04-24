package com.pryde.prydecrudd.controller;

import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.pryde.prydecrudd.entity.Caixa;
import com.pryde.prydecrudd.serviceimpl.CaixaServiceImplements;

@CrossOrigin(origins = "*")
@RestController(value = "/api/caixa")
public class CaixaController {
	
	@Autowired
	private CaixaServiceImplements caixaService;

	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Cadastro Realizado com Sucesso"),
			@ApiResponse(code = 400, message = "Erro ao Cadastrar"),
			@ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
			@ApiResponse(code = 500, message = "Foi gerada uma exceção"),
	})
	@PostMapping(value = "/salvarCaixaCadastro")
	public @ResponseBody Caixa salvarCaixa(@RequestBody Caixa caixa) {
		return caixaService.salvarCaixa(caixa);
		
	}
}
