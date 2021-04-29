package com.pryde.prydecrudd.login.serviceimplements;

import com.pryde.prydecrudd.login.entity.Login;
import org.springframework.http.ResponseEntity;

public interface LoginServiceImplements {

    ResponseEntity<Login> getByUsuarioESenha(String usuario, String senha);
}
