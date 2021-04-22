package com.pryde.prydecrudd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pryde.prydecrudd.entity.Funcionario;
import com.pryde.prydecrudd.repository.FuncionarioRepository;
import com.pryde.prydecrudd.serviceimpl.FuncionarioServiceImplements;

@Service
public class FuncionarioService implements FuncionarioServiceImplements {
	
	@Autowired
	private FuncionarioRepository funcionarioRepository;
	
	@Override
	public Funcionario salvarFuncionario(Funcionario funcionario) {
		 return funcionarioRepository.save(funcionario);
	}
	

}
