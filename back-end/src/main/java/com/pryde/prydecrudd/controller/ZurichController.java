package com.pryde.prydecrudd.controller;

import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.pryde.prydecrudd.entity.Zurich;


import com.pryde.prydecrudd.serviceimpl.ZurichServiceImplements;

@CrossOrigin(origins = "*")
@RestController
public class ZurichController {

	@Autowired
	private ZurichServiceImplements zurichService;

	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Cadastro Realizado com Sucesso"),
			@ApiResponse(code = 400, message = "Erro ao Cadastrar"),
			@ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
			@ApiResponse(code = 500, message = "Foi gerada uma exceção"),
	})
	@PostMapping(value = "/salvarZurichCadastro")
	public @ResponseBody
	ResponseEntity<Zurich> salvarZurich(@RequestBody Zurich zurich) {
		return zurichService.salvarZurich(zurich);
		
	}

}
