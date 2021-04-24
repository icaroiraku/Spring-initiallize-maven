package com.pryde.prydecrudd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.pryde.prydecrudd.entity.Funcionario;
import com.pryde.prydecrudd.repository.FuncionarioRepository;
import com.pryde.prydecrudd.serviceimpl.FuncionarioServiceImplements;

import java.util.List;
import java.util.Optional;

@Service
public class FuncionarioService implements FuncionarioServiceImplements {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    @Override
    public ResponseEntity<Funcionario> salvarFuncionario(Funcionario funcionario) {
        try {
            this.funcionarioRepository.save(funcionario);
            return new ResponseEntity<>(funcionario, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @Override
    public ResponseEntity<Funcionario> atulizarFuncionario(Funcionario funcionario) {
        try {
            this.funcionarioRepository.save(funcionario);
            return new ResponseEntity<>(funcionario, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @Override
    public ResponseEntity<Funcionario> deletarFuncionario(Funcionario funcionario) {
        try {
            this.funcionarioRepository.delete(funcionario);
            return new ResponseEntity<>(funcionario, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @Override
    public ResponseEntity<Void> deletarPorIdFuncionario(Long id) {
        try {
            this.funcionarioRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @Override
    public Optional<Funcionario> buscarFuncionarioPorId(Long id) {
        return this.funcionarioRepository.findById(id);
    }

    @Override
    public List<Funcionario> getAllFuncionarios() {
        return this.funcionarioRepository.findAll();
    }
}
