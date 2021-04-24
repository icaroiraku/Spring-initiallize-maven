package com.pryde.prydecrudd.zurich.service;

import com.pryde.prydecrudd.zurich.entity.Zurich;
import com.pryde.prydecrudd.zurich.repository.ZurichRepository;
import com.pryde.prydecrudd.zurich.serviceimpl.ZurichServiceImplements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ZurichService implements ZurichServiceImplements {

    @Autowired
    private ZurichRepository zurichRepository;

    /**
     * Salvar Dados Zurch
     *
     * @param zurich
     * @return http.status
     **/

    @Override
    public ResponseEntity<Zurich> salvarZurich(Zurich zurich) {
        try {
            this.zurichRepository.save(zurich);
            return new ResponseEntity<>(zurich, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    /**
     * Metodo Atuliza Dados Zurich
     *
     * @param zurich
     * @return http.status
     **/
    @Override
    public ResponseEntity<Zurich> atulizarZurich(Zurich zurich) {

        try {
            this.zurichRepository.save(zurich);
            return new ResponseEntity<>(zurich, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    /**
     * Metodo Deletar Dados Zurich
     *
     * @param zurich
     * @return http.status
     **/
    @Override
    public ResponseEntity<Zurich> deletarZurch(Zurich zurich) {
        try {
            this.zurichRepository.delete(zurich);
            return new ResponseEntity<>(zurich, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    /**
     * Metodo Deleta Dados Zurich por id
     *
     * @param id
     * @return http.status
     **/

    @Override
    public ResponseEntity<Void> deletarPorIdZurch(Long id) {
        try {
            this.zurichRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    /**
     * Metodo Busca Dados Zurich pelo id
     *
     * @param codigo
     * @return http.status
     **/
    @Override
    public Optional<Zurich> buscar(Long codigo) {
        return this.zurichRepository.findById(codigo);
    }

    /**
     * Metodo Busca Todos os Dados Zurich
     *
     * @return List
     **/

    @Override
    public List<Zurich> getAllZurich() {
        return this.zurichRepository.findAll();
    }
}