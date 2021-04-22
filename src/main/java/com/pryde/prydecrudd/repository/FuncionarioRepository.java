package com.pryde.prydecrudd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pryde.prydecrudd.entity.Funcionario;

@Repository
 public interface FuncionarioRepository  extends JpaRepository<Funcionario,Long> {

	
	
}
