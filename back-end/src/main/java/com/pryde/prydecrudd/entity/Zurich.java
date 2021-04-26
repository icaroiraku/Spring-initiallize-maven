package com.pryde.prydecrudd.entity;


import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "zurich")

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
	private Date dataNascimento;
	
	@Column(name = "tb_capital")
	private Double capital;

	@Column(name = "tb_premio")
	private Double premio;
	
	@Column(name = "tb_salario")
	private Double salario;
	

	@Column(name = "tb_plano")
	private String plano;
	
	@Column(name = "tb_endereco")
	private String endereco;
	
	@Column(name = "tb_numero")
	private int numero;
	
	@Column(name = "tb_complemento")
	private String complemento;
	
	@Column(name = "tb_bairro")
	private String bairro;
	
	@Column(name = "tb_cidade")
	private String cidade;
	
	@Column(name = "tb_uf")
	private char uf;
	
	@Column(name = "tb_cep")
	private String cep;
	
	@Column(name = "tb_forma_pagamento")
	private String formaPagamento;
	
	@Column(name = "tb_data_venc")
	private Date dataVencimento;
	
	@Column(name = "tb_banco")
	private Double banco;
	
	@Column(name = "tb_agencia")
	private Double agencia;
	
	@Column(name = "tb_num_ccorr_ccred")
	private Double numeroContaCorrenteContaCredito;
	
	@Column(name = "tb_vigencia")
	private String vigencia;
	
	@Column(name = "tb_ddd_telefone")
	private String dddTelefone;
	
	@Column(name = "tb_ramal")
	private int ramal;
	
	@Column(name = "tb_ddd_celular")
	private String dddCelular;
	
	@Column(name = "tb_email")
	private String email;
}
