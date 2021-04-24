package com.pryde.prydecrudd.login.controller;

import com.pryde.prydecrudd.login.entity.Login;
import com.pryde.prydecrudd.login.serviceimplements.LoginServiceImplements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins ="*" )
@RestController
public class LoginController {

    @Autowired
    private LoginServiceImplements loginService;

    public @ResponseBody
    ResponseEntity<Login> getLogin(@RequestParam("usuario")String usuario, @RequestParam("senha") String senha){
        return this.loginService.getByUsuarioESenha(usuario,senha);
    }
}
