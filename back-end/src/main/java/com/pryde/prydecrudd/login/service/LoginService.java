package com.pryde.prydecrudd.login.service;

import com.pryde.prydecrudd.login.entity.Login;
import com.pryde.prydecrudd.login.repository.LoginRepository;
import com.pryde.prydecrudd.login.serviceimplements.LoginServiceImplements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class LoginService implements LoginServiceImplements {

    @Autowired
    private LoginRepository loginRepository;

    @Override
    public ResponseEntity<Login> getByUsuarioESenha(String usuario, String senha) {
        try {
            this.loginRepository.getByUsernameAndPassword(usuario, senha);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
