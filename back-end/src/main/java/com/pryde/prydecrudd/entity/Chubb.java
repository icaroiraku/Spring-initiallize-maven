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
@Table(name = "chubb")

public class Chubb  implements Serializable  {
	
	
	
	private static final long serialVersionUID = 460515535873457428L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "tb_id")
	private Long id;
	
	@Column(name = "tb_origem")
	private String origem;
	
	@Column(name = "tb_nome")
	private String nome;
	
	@Column(name = "tb_cpf_cnpj")
	private String cpfCnpj;
	
	@Column(name = "tb_data_nasc")
	private Date dataNascimento;
	
	@Column(name = "tb_banco")
	private String banco;

	@Column(name = "tb_sexo")
	private char sexo;
	
	@Column(name = "tb_agencia")
	private Double agencia;
	
	@Column(name = "tb_num_ccorr_ccred")
	private Double numeroContaCorrenteContaCredito;
	
	@Column(name = "tb_endereco")
	private String endereco;
	
	@Column(name = "tb_cidade")
	private String cidade;
	
	@Column(name = "tb_uf")
	private char uf;
	
	@Column(name = "tb_celular")
	private String celular;
	
	@Column(name = "tb_data_trans")
	private Date dataTransicao;
	

	@Column(name = "tb_num_prop")
	private Double numeroProposta;
	
}
