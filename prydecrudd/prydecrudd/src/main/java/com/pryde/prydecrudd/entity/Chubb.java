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
@Table(name = "Chubb")

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
	private String dataNasc;
	
	@Column(name = "tb_banco")
	private String banco;
	
	@Column(name = "tb_agencia")
	private String agencia;
	
	@Column(name = "tb_num_ccorr_ccred")
	private String numCcorrCCred;
	
	@Column(name = "tb_endereco")
	private String endereco;
	
	@Column(name = "tb_cidade")
	private String cidade;
	
	@Column(name = "tb_uf")
	private String uf;
	
	@Column(name = "tb_celular")
	private String celular;
	
	@Column(name = "tb_data_trans")
	private String dataTrans;
	

	@Column(name = "tb_num_prop")
	private String numProp;
	
}
