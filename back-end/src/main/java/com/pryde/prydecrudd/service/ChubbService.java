package com.pryde.prydecrudd.service;

import com.pryde.prydecrudd.entity.Chubb;
import com.pryde.prydecrudd.repository.ChubbRepository;
import com.pryde.prydecrudd.serviceimpl.ChubbServiceImplements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChubbService implements ChubbServiceImplements {

    @Autowired
    private ChubbRepository chubbRepository;


    @Override
    public ResponseEntity<Chubb> salvarChubb(Chubb chubb) {
        try {
            this.chubbRepository.save(chubb);
            return new ResponseEntity<>(chubb, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @Override
    public ResponseEntity<Chubb> atulizarCubb(Chubb chubb) {
        try {
            this.chubbRepository.save(chubb);
            return new ResponseEntity<>(chubb, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @Override
    public ResponseEntity<Chubb> deletarChubb(Chubb chubb) {
        try {
            this.chubbRepository.delete(chubb);
            return new ResponseEntity<>(chubb, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @Override
    public ResponseEntity<Void> deletarPorIdChubb(Long id) {
        try {
            this.chubbRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @Override
    public Optional<Chubb> buscarChubbPorId(Long id) {
        return this.chubbRepository.findById(id);
    }

    @Override
    public List<Chubb> getAllChubb() {
        return this.chubbRepository.findAll();
    }
}
