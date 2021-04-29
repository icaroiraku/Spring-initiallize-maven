package com.pryde.prydecrudd.caixa.repository;

import com.pryde.prydecrudd.caixa.entity.Caixa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CaixaRepository extends JpaRepository<Caixa,Long>{

}
