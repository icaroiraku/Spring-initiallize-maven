package com.pryde.prydecrudd.chubb.serviceimpl;

import com.pryde.prydecrudd.chubb.entity.Chubb;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface ChubbServiceImplements {

	ResponseEntity<Chubb> salvarChubb(Chubb chubb);

	ResponseEntity<Chubb> atulizarCubb(Chubb chubb);

	ResponseEntity<Chubb> deletarChubb(Chubb chubb);

	ResponseEntity<Void> deletarPorIdChubb(Long id);

	Optional<Chubb> buscarChubbPorId(Long id);

	List<Chubb> getAllChubb();

}
