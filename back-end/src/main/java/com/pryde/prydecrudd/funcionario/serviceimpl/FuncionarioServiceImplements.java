package com.pryde.prydecrudd.funcionario.serviceimpl;

import com.pryde.prydecrudd.funcionario.entity.Funcionario;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface FuncionarioServiceImplements {

	ResponseEntity<Funcionario> salvarFuncionario(Funcionario funcionario);

	ResponseEntity<Funcionario> atulizarFuncionario(Funcionario funcionario);

	ResponseEntity<Funcionario> deletarFuncionario(Funcionario funcionario);

	ResponseEntity<Void> deletarPorIdFuncionario(Long id);

	Optional<Funcionario> buscarFuncionarioPorId(Long id);

	List<Funcionario> getAllFuncionarios();
}
