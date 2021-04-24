package com.pryde.prydecrudd.caixa.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "caixa")
public class Caixa implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 460515535873457428L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "tb_id")
	private Long id;
	
	@Column(name = "tb_cpf_cnpj")
	private String cpfCnpj;
	
	@Column(name = "tb_num_prop")
	private String numProp ;
	
	@Column(name = "tb_endereco")
	private String endereco;
	
	@Column(name = "tb_nome")
	private String nome;
	
	@Column(name = "tb_data_nasc")
	private String dataNasc;
	
	@Column(name = "tb_num_benef")
	private String numBenef;
	
	@Column(name = "tb_plano")
	private String plano;
	
	@Column(name = "tb_valor_prem")
	private String valorPrem;
	
	@Column(name = "tb_banco")
	private String banco;
	
	@Column(name = "tb_agencia")
	private String agencia;

	@Column(name = "tb_num_ccorr_ccred")
	private String numCcorrCCred;
	
	@Column(name = "tb_data_entr")
	private String dataEntr;
	
	@Column(name = "tb_canal_vend")
	private String canalVend;
	
	@Column(name = "tb_corretora")
	private String corretora;
	
	
	@Column(name = "tb_status_atual")
	private String statusAtual;
	
	@Column(name = "tb_moti_cancel")
	private String motiCancel;
	
}
