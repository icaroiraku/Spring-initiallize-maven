package com.pryde.prydecrudd.caixa.serviceimpl;

import com.pryde.prydecrudd.caixa.entity.Caixa;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface CaixaServiceImplements {

	ResponseEntity<Caixa> salvarCaixa(Caixa caixa);

	ResponseEntity<Caixa> atulizarCaixa(Caixa caixa);

	ResponseEntity<Caixa> deletarCaixa(Caixa caixa);

	ResponseEntity<Void> deletarPorIdCaixa(Long id);

	Optional<Caixa> buscarCaixaPorId(Long id);

	List<Caixa> getAllCaixa();

}
