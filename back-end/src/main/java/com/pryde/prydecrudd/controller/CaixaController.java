package com.pryde.prydecrudd.controller;

import com.pryde.prydecrudd.entity.Caixa;
import com.pryde.prydecrudd.serviceimpl.CaixaServiceImplements;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController(value = "/api/caixa")
public class CaixaController {

    @Autowired
    private CaixaServiceImplements caixaService;

    @ApiOperation(value = "Salvar Cadastro Caixa")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Cadastro Realizado com Sucesso"),
            @ApiResponse(code = 400, message = "Erro ao Cadastrar"),
            @ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
            @ApiResponse(code = 500, message = "Foi gerada uma exceção"),
    })
    @PostMapping(value = "/salvarCaixaCadastro")
    public @ResponseBody
    ResponseEntity<Caixa> salvarCaixa(@RequestBody Caixa caixa) {
        return this.caixaService.salvarCaixa(caixa);

    }

    @ApiOperation(value = "Atualizar Cadastro Caixa")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Cadastro Atualizado com Sucesso"),
            @ApiResponse(code = 400, message = "Erro ao Atualizar"),
            @ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
            @ApiResponse(code = 500, message = "Foi gerada uma exceção"),
    })
    @PutMapping(value = "/atualizarCaixa")
    public @ResponseBody
    ResponseEntity<Caixa> atualizaCaixa(@RequestBody Caixa caixa) {
        return this.caixaService.atulizarCaixa(caixa);
    }

    @ApiOperation(value = "Deletar Por Id Cadastro Caixa")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Cadastro Excluido com Sucesso"),
            @ApiResponse(code = 400, message = "Erro ao Excluir"),
            @ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
            @ApiResponse(code = 500, message = "Foi gerada uma exceção"),
    })
    @DeleteMapping(value = "/deletarCaixa/{id}")
    public @ResponseBody
    ResponseEntity<Void> deletarPorIdCaixa(@RequestParam Long id) {
        return this.caixaService.deletarPorIdCaixa(id);
    }

    @ApiOperation(value = "Deletar Cadastro Caixa")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Cadastro Deletado com Sucesso"),
            @ApiResponse(code = 400, message = "Erro ao Deletar"),
            @ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
            @ApiResponse(code = 500, message = "Foi gerada uma exceção"),
    })
    @DeleteMapping(value = "/deletarCadastroCaixa")
    public @ResponseBody
    ResponseEntity<Caixa> deletarCadastroCaixa(@RequestBody Caixa caixa) {
        return this.caixaService.deletarCaixa(caixa);
    }

    @ApiOperation(value = "Buscar Cadastro Caixa")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Busca Realizada com Sucesso"),
            @ApiResponse(code = 400, message = "Erro ao Buscar"),
            @ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
            @ApiResponse(code = 500, message = "Foi gerada uma exceção"),
    })
    @GetMapping(value = "/buscarCadastroCaixa")
    public List<Caixa> buscarCaixas() {
        return this.caixaService.getAllCaixa();
    }

    @ApiOperation(value = "Buscar Por Id Cadastro Caixa")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Busca Realizada com Sucesso"),
            @ApiResponse(code = 400, message = "Erro ao Buscar"),
            @ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
            @ApiResponse(code = 500, message = "Foi gerada uma exceção"),
    })
    @GetMapping(value = "/buscarCaixasPorId/{id}")
    public Optional<Caixa> buscarChubbPorId(Long id) {
        return this.caixaService.buscarCaixaPorId(id);
    }

}
