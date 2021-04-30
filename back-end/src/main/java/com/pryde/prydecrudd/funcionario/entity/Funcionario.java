package com.pryde.prydecrudd.funcionario.entity;


import com.pryde.prydecrudd.login.entity.Login;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

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

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id")
	private Login login;
	
	@Column(name = "tb_data_cad")
	private String dataCad;
	
	@Column(name = "tb_ult_acesso")
	private String ultAcesso;

	@Column(name = "tb_situ_func")
	private String situFunc;
	
	
	@Column(name = "tb_super_func")
	private String superFunc;
}
