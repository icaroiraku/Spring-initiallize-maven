package com.pryde.prydecrudd.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.pryde.prydecrudd.entity.Zurich;


import com.pryde.prydecrudd.serviceimpl.ZurichServiceImplements;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@Api(value = "Api Controller Zurich")
public class ZurichController {

    @Autowired
    private ZurichServiceImplements zurichService;

    @ApiOperation(value = "Salvar Cadastro Zurich")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Cadastro Realizado com Sucesso"),
            @ApiResponse(code = 400, message = "Erro ao Cadastrar"),
            @ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
            @ApiResponse(code = 500, message = "Foi gerada uma exceção"),
    })
    @PostMapping(value = "/salvarZurichCadastro")
    public @ResponseBody
    ResponseEntity<Zurich> salvarZurich(@RequestBody Zurich zurich) {
        return this.zurichService.salvarZurich(zurich);

    }

    @ApiOperation(value = "Atualizar Cadastro Zurich")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Cadastro Atualizado com Sucesso"),
            @ApiResponse(code = 400, message = "Erro ao Atualizar"),
            @ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
            @ApiResponse(code = 500, message = "Foi gerada uma exceção"),
    })
    @PutMapping(value = "/atualizarZurich")
    public @ResponseBody
    ResponseEntity<Zurich> atualizaZurich(@RequestBody Zurich zurich) {
        return this.zurichService.atulizarZurich(zurich);
    }

    @ApiOperation(value = "Deletar Por Id Cadastro Zurich")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Cadastro Excluido com Sucesso"),
            @ApiResponse(code = 400, message = "Erro ao Excluir"),
            @ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
            @ApiResponse(code = 500, message = "Foi gerada uma exceção"),
    })
    @DeleteMapping(value = "/deletarZurich/{id}")
    public @ResponseBody
    ResponseEntity<Void> deletarZurichId(@RequestParam Long id) {
        return this.zurichService.deletarPorIdZurch(id);
    }

    @ApiOperation(value = "Deletar Cadastro Zurich")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Cadastro Deletado com Sucesso"),
            @ApiResponse(code = 400, message = "Erro ao Deletar"),
            @ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
            @ApiResponse(code = 500, message = "Foi gerada uma exceção"),
    })
    @DeleteMapping(value = "/deletarCadastroZurich")
    public @ResponseBody
    ResponseEntity<Zurich> deletarCadastroZurich(@RequestBody Zurich zurich) {
        return this.zurichService.deletarZurch(zurich);
    }

    @ApiOperation(value = "Buscar Cadastro Zurich")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Busca Realizada com Sucesso"),
            @ApiResponse(code = 400, message = "Erro ao Buscar"),
            @ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
            @ApiResponse(code = 500, message = "Foi gerada uma exceção"),
    })
    @GetMapping(value = "/buscarCadastroZurich")
    public List<Zurich> buscarZurich() {
        return this.zurichService.getAllZurich();
    }

    @ApiOperation(value = "Buscar Por Id Cadastro Zurich")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Busca Realizada com Sucesso"),
            @ApiResponse(code = 400, message = "Erro ao Buscar"),
            @ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
            @ApiResponse(code = 500, message = "Foi gerada uma exceção"),
    })
    @GetMapping(value = "/buscarZurichPorId/{id}")
    public Optional<Zurich> buscarZurichId(Long id) {
        return this.zurichService.buscar(id);
    }
}
