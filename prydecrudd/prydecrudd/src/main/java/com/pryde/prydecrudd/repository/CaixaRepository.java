package com.pryde.prydecrudd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pryde.prydecrudd.entity.Caixa;

@Repository
public interface CaixaRepository extends JpaRepository<Caixa,Long>{

}
