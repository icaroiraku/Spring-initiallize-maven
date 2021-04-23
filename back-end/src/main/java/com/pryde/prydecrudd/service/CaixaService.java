package com.pryde.prydecrudd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pryde.prydecrudd.entity.Caixa;
import com.pryde.prydecrudd.repository.CaixaRepository;
import com.pryde.prydecrudd.serviceimpl.CaixaServiceImplements;

@Service
public class CaixaService implements CaixaServiceImplements {
	
	@Autowired
	private CaixaRepository caixaRepository;

	@Override
	public Caixa salvarCaixa(Caixa caixa) {
		return caixaRepository.save(caixa);
	}

}
