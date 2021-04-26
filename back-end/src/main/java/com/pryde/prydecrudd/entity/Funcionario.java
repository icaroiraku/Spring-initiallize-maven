package com.pryde.prydecrudd.entity;



import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name = "funcionario")
public class Funcionario implements Serializable{


private static final long serialVersionUID = 460515535873457428L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "tb_id")
	private Long id;
	
	@Column(name = "tb_idFunc")
	private String idFuncionario;
	
	@Column(name = "tb_nome_func")
	private String nomeFuncionario;
	
	@Column(name = "tb_cpf_func")
	private String cpfFuncionario;
	
	@Column(name = "tb_setor_func")
	private String setorFuncionario;
	
	@Column(name = "tb_nasc_func")
	private String nascimentoFuncionario;
	
	@Column(name = "tb_perm_func")
	private String permanenciaFuncionario;
	
	@Column(name = "tb_login_func")
	private String loginFuncionario;
	
	@Column(name = "tb_senha_func")
	private String senhaFuncionario;
	
	@Column(name = "tb_data_cad")
	private String dataCadastramento;
	
	@Column(name = "tb_ult_acesso")
	private String ultimoAcesso;

	@Column(name = "tb_situ_func")
	private String situacaoFuncionario;
	
	
}
