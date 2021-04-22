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
	private String idFunc;
	
	@Column(name = "tb_nome_func")
	private String nomeFunc;
	
	@Column(name = "tb_cpf_func")
	private String cpfFunc;
	
	@Column(name = "tb_setor_func")
	private String setorFunc;
	
	@Column(name = "tb_nasc_func")
	private String nascFunc;
	
	@Column(name = "tb_perm_func")
	private String permFunc;
	
	@Column(name = "tb_login_func")
	private String loginFunc;
	
	@Column(name = "tb_senha_func")
	private String senhaFunc;
	
	@Column(name = "tb_data_cad")
	private String dataCad;
	
	@Column(name = "tb_ult_acesso")
	private String ultAcesso;

	@Column(name = "tb_situ_func")
	private String situFunc;
	
	
	@Column(name = "tb_super_func")
	private String superFunc;
}
