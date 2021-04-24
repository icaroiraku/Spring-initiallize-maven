package com.pryde.prydecrudd.controller;

import com.pryde.prydecrudd.entity.Funcionario;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import com.pryde.prydecrudd.entity.Chubb;
import com.pryde.prydecrudd.serviceimpl.ChubbServiceImplements;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController(value = "/api/chubb")
public class ChubbController {

    @Autowired
    private ChubbServiceImplements chubbService;

    @ApiOperation(value = "Salvar Cadastro Chubb")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Cadastro Realizado com Sucesso"),
            @ApiResponse(code = 400, message = "Erro ao Cadastrar"),
            @ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
            @ApiResponse(code = 500, message = "Foi gerada uma exceção"),
    })
    @PostMapping(value = "/salvarChubbCadastro")
    public @ResponseBody
    ResponseEntity<Chubb> salvarChubb(@RequestBody Chubb chubb) {
        return this.chubbService.salvarChubb(chubb);

    }

    @ApiOperation(value = "Atualizar Cadastro Chubb")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Cadastro Atualizado com Sucesso"),
            @ApiResponse(code = 400, message = "Erro ao Atualizar"),
            @ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
            @ApiResponse(code = 500, message = "Foi gerada uma exceção"),
    })
    @PutMapping(value = "/atualizarChubb")
    public @ResponseBody
    ResponseEntity<Chubb> atualizaChubb(@RequestBody Chubb chubb) {
        return this.chubbService.atulizarCubb(chubb);
    }

    @ApiOperation(value = "Deletar Por Id Cadastro Chubb")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Cadastro Excluido com Sucesso"),
            @ApiResponse(code = 400, message = "Erro ao Excluir"),
            @ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
            @ApiResponse(code = 500, message = "Foi gerada uma exceção"),
    })
    @DeleteMapping(value = "/deletarChubb/{id}")
    public @ResponseBody
    ResponseEntity<Void> deletarPorIdChubb(@RequestParam Long id) {
        return this.chubbService.deletarPorIdChubb(id);
    }

    @ApiOperation(value = "Deletar Cadastro Chubb")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Cadastro Deletado com Sucesso"),
            @ApiResponse(code = 400, message = "Erro ao Deletar"),
            @ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
            @ApiResponse(code = 500, message = "Foi gerada uma exceção"),
    })
    @DeleteMapping(value = "/deletarCadastroChubb")
    public @ResponseBody
    ResponseEntity<Chubb> deletarCadastroChubb(@RequestBody Chubb chubb) {
        return this.chubbService.deletarChubb(chubb);
    }

    @ApiOperation(value = "Buscar Cadastro Chubb")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Busca Realizada com Sucesso"),
            @ApiResponse(code = 400, message = "Erro ao Buscar"),
            @ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
            @ApiResponse(code = 500, message = "Foi gerada uma exceção"),
    })
    @GetMapping(value = "/buscarCadastroChubb")
    public List<Chubb> buscarChubbs() {
        return this.chubbService.getAllChubb();
    }

    @ApiOperation(value = "Buscar Por Id Cadastro Chubb")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Busca Realizada com Sucesso"),
            @ApiResponse(code = 400, message = "Erro ao Buscar"),
            @ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
            @ApiResponse(code = 500, message = "Foi gerada uma exceção"),
    })
    @GetMapping(value = "/buscarChubbPorId/{id}")
    public Optional<Chubb> buscarChubbId(Long id) {
        return this.chubbService.buscarChubbPorId(id);
    }

}
