package com.pryde.prydecrudd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.pryde.prydecrudd.entity.Chubb;
import com.pryde.prydecrudd.serviceimpl.ChubbServiceImplements;

@RestController
public class ChubbController {
	
	@Autowired
	private ChubbServiceImplements chubbService;
	
	
	@GetMapping(name = "/salvarChubbCadastro")
	public Chubb salvarChubb(@RequestBody Chubb chubb) {
		return chubbService.salvarChubb(chubb);
		
	}
}
