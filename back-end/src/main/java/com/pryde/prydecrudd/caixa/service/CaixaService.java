package com.pryde.prydecrudd.caixa.service;

import com.pryde.prydecrudd.caixa.entity.Caixa;
import com.pryde.prydecrudd.caixa.repository.CaixaRepository;
import com.pryde.prydecrudd.caixa.serviceimpl.CaixaServiceImplements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CaixaService implements CaixaServiceImplements {

    @Autowired
    private CaixaRepository caixaRepository;

    @Override
    public ResponseEntity<Caixa> salvarCaixa(Caixa caixa) {
        try {
            this.caixaRepository.save(caixa);
            return new ResponseEntity<>(caixa, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @Override
    public ResponseEntity<Caixa> atulizarCaixa(Caixa caixa) {
        try {
            this.caixaRepository.save(caixa);
            return new ResponseEntity<>(caixa, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @Override
    public ResponseEntity<Caixa> deletarCaixa(Caixa caixa) {
        try {
            this.caixaRepository.delete(caixa);
            return new ResponseEntity<>(caixa, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @Override
    public ResponseEntity<Void> deletarPorIdCaixa(Long id) {
        try {
            this.caixaRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @Override
    public Optional<Caixa> buscarCaixaPorId(Long id) {
        return this.caixaRepository.findById(id);
    }

    @Override
    public List<Caixa> getAllCaixa() {
        return this.caixaRepository.findAll();
    }
}