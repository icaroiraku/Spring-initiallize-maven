package com.pryde.prydecrudd.serviceimpl;
import com.pryde.prydecrudd.entity.Zurich;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface ZurichServiceImplements {

	ResponseEntity<Zurich> salvarZurich(Zurich zurich);

	ResponseEntity<Zurich> atulizarZurich(Zurich zurich);

	ResponseEntity<Zurich> deletarZurch(Zurich zurich);

	ResponseEntity<Void> deletarPorIdZurch(Long id);

	Optional<Zurich> buscar(Long id);

	List<Zurich> getAllZurich();
}
