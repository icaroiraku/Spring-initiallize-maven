package com.pryde.prydecrudd.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pryde.prydecrudd.entity.Zurich;


import com.pryde.prydecrudd.serviceimpl.ZurichServiceImplements;



@RestController
public class ZurichController {
	
	
	@Autowired
	private ZurichServiceImplements zurichService;
	
	
	@GetMapping(name = "/salvarZurichCadastro")
	public Zurich salvarZurich(@RequestBody Zurich zurich) {
		return zurichService.salvarZurich(zurich);
		
	}

	
}
