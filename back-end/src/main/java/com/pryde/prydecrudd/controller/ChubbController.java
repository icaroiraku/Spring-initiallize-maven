package com.pryde.prydecrudd.controller;

import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import com.pryde.prydecrudd.entity.Chubb;
import com.pryde.prydecrudd.serviceimpl.ChubbServiceImplements;

@CrossOrigin(origins = "*")
@RestController
public class ChubbController {
	
	@Autowired
	private ChubbServiceImplements chubbService;

	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Cadastro Realizado com Sucesso"),
			@ApiResponse(code = 400, message = "Erro ao Cadastrar"),
			@ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
			@ApiResponse(code = 500, message = "Foi gerada uma exceção"),
	})
	@PostMapping(value = "/salvarChubbCadastro")
	public @ResponseBody Chubb salvarChubb(@RequestBody Chubb chubb) {
		return chubbService.salvarChubb(chubb);
		
	}
}
