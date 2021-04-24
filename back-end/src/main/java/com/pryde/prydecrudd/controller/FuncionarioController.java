package com.pryde.prydecrudd.controller;

import com.pryde.prydecrudd.entity.Funcionario;
import com.pryde.prydecrudd.serviceimpl.FuncionarioServiceImplements;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController(value = "/api/funcionario")
public class FuncionarioController {

    @Autowired
    private FuncionarioServiceImplements funcionarioService;

	@ApiOperation(value = "Salvar Cadastro Funcionario")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Cadastro Realizado com Sucesso"),
			@ApiResponse(code = 400, message = "Erro ao Cadastrar"),
			@ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
			@ApiResponse(code = 500, message = "Foi gerada uma exceção"),
	})
	@PostMapping(value = "/salvarFuncionarioCadastro")
	public @ResponseBody
	ResponseEntity<Funcionario> salvarFuncionario(@RequestBody Funcionario funcionario) {
		return this.funcionarioService.salvarFuncionario(funcionario);

	}

	@ApiOperation(value = "Atualizar Cadastro Funcionario")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Cadastro Atualizado com Sucesso"),
			@ApiResponse(code = 400, message = "Erro ao Atualizar"),
			@ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
			@ApiResponse(code = 500, message = "Foi gerada uma exceção"),
	})
	@PutMapping(value = "/atualizarFuncionario")
	public @ResponseBody
	ResponseEntity<Funcionario> atualizaFuncionario(@RequestBody Funcionario funcionario) {
		return this.funcionarioService.atulizarFuncionario(funcionario);
	}

	@ApiOperation(value = "Deletar Por Id Cadastro Funcionario")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Cadastro Excluido com Sucesso"),
			@ApiResponse(code = 400, message = "Erro ao Excluir"),
			@ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
			@ApiResponse(code = 500, message = "Foi gerada uma exceção"),
	})
	@DeleteMapping(value = "/deletarFuncionario/{id}")
	public @ResponseBody
	ResponseEntity<Void> deletarPorIdFuncionarioId(@RequestParam Long id) {
		return this.funcionarioService.deletarPorIdFuncionario(id);
	}

	@ApiOperation(value = "Deletar Cadastro Funcionario")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Cadastro Deletado com Sucesso"),
			@ApiResponse(code = 400, message = "Erro ao Deletar"),
			@ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
			@ApiResponse(code = 500, message = "Foi gerada uma exceção"),
	})
	@DeleteMapping(value = "/deletarCadastroFuncionario")
	public @ResponseBody
	ResponseEntity<Funcionario> deletarCadastroFuncionario(@RequestBody Funcionario funcionario) {
		return this.funcionarioService.deletarFuncionario(funcionario);
	}

	@ApiOperation(value = "Buscar Cadastro Funcionario")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Busca Realizada com Sucesso"),
			@ApiResponse(code = 400, message = "Erro ao Buscar"),
			@ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
			@ApiResponse(code = 500, message = "Foi gerada uma exceção"),
	})
	@GetMapping(value = "/buscarCadastroFuncionario")
	public List<Funcionario> buscarZurich() {
		return this.funcionarioService.getAllFuncionarios();
	}

	@ApiOperation(value = "Buscar Por Id Cadastro Funcionario")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Busca Realizada com Sucesso"),
			@ApiResponse(code = 400, message = "Erro ao Buscar"),
			@ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
			@ApiResponse(code = 500, message = "Foi gerada uma exceção"),
	})
	@GetMapping(value = "/buscarFuncionarioPorId/{id}")
	public Optional<Funcionario> buscarFuncionarioId(Long id) {
		return this.funcionarioService.buscarFuncionarioPorId(id);
	}

}
