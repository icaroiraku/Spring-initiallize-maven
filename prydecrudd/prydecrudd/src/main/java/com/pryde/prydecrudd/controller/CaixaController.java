package com.pryde.prydecrudd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pryde.prydecrudd.entity.Caixa;
import com.pryde.prydecrudd.serviceimpl.CaixaServiceImplements;

@RestController
public class CaixaController {
	
	@Autowired
	private CaixaServiceImplements caixaService;
	
	
	@GetMapping(name = "/salvarCaixaCadastro")
	public Caixa salvarCaixa(@RequestBody Caixa caixa) {
		return caixaService.salvarCaixa(caixa);
		
	}
}
