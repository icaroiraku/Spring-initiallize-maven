package com.pryde.prydecrudd.funcionario.repository;

import com.pryde.prydecrudd.funcionario.entity.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
 public interface FuncionarioRepository  extends JpaRepository<Funcionario,Long> {

}
