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
@Table(name = "Zurich")

public class Zurich implements Serializable {
	
private static final long serialVersionUID = 460515535873457428L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "tb_id")
	private Long id;
	
	@Column(name = "tb_cpf_cnpj")
	private String cpfCnpj;
	
	@Column(name = "tb_nome")
	private String nome;
	
	@Column(name = "tb_data_nasc")
	private String dataNasc;
	
	@Column(name = "tb_capital")
	private String capital;

	@Column(name = "tb_premio")
	private String premio;
	
	@Column(name = "tb_salario")
	private String salario;
	

	@Column(name = "tb_plano")
	private String plano;
	
	@Column(name = "tb_endereco")
	private String endereco;
	
	@Column(name = "tb_numero")
	private String numero;
	
	@Column(name = "tb_complemento")
	private String complemento;
	
	@Column(name = "tb_bairro")
	private String bairro;
	
	@Column(name = "tb_cidade")
	private String cidade;
	
	@Column(name = "tb_uf")
	private String uf;
	
	@Column(name = "tb_cep")
	private String cep;
	
	@Column(name = "tb_forma_pagamento")
	private String formaPagamento;
	
	@Column(name = "tb_data_venc")
	private String dataVenc;
	
	@Column(name = "tb_banco")
	private String banco;
	
	@Column(name = "tb_agencia")
	private String agencia;
	
	@Column(name = "tb_num_ccorr_ccred")
	private String numCcorrCCred;
	
	@Column(name = "tb_vigencia")
	private String vigencia;
	
	@Column(name = "tb_ddd_telefone")
	private String dddTelefone;
	
	@Column(name = "tb_ramal")
	private String ramal;
	
	@Column(name = "tb_ddd_celular")
	private String dddCelular;
	
	@Column(name = "tb_email")
	private String email;
}
