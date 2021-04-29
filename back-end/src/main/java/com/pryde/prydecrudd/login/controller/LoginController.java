package com.pryde.prydecrudd.login.controller;

import com.pryde.prydecrudd.login.entity.Login;
import com.pryde.prydecrudd.login.serviceimplements.LoginServiceImplements;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins ="*" )
@RestController
@RequestMapping(path = "/api/login")
public class LoginController {

    @Autowired
    private LoginServiceImplements loginService;

    @ApiOperation(value = "Buscar Login Por Usuario e Senha")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Login Realizado com Sucesso"),
            @ApiResponse(code = 400, message = "Erro ao Logar"),
            @ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
            @ApiResponse(code = 500, message = "Foi gerada uma exceção"),
    })
    @GetMapping(path = "/login/{usuario}/{senha}")
    public @ResponseBody
    ResponseEntity<Login> getLogin(@RequestParam("usuario")String usuario, @RequestParam("senha") String senha){
        return this.loginService.getByUsuarioESenha(usuario,senha);
    }
}
