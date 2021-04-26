package com.pryde.prydecrudd.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.w3c.dom.Text;

import lombok.Data;

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
	private String numProposta ;
	
	@Column(name = "tb_nome")
	private String nome;
	
	@Column(name = "tb_data_nasc")
	private Date dataNascimento;
	
	@Column(name = "tb_num_benef")
	private Integer numBeneficio;
	
	@Column(name = "tb_plano")
	private Integer plano;
	
	@Column(name = "tb_valor_prem")
	private Double valorPrem;
	
	@Column(name = "tb_banco")
	private Double banco;
	
	@Column(name = "tb_agencia")
	private Double agencia;

	@Column(name = "tb_num_ccorr_ccred")
	private Double numContaCorrenteContaCredito;
	
	@Column(name = "tb_data_entr")
	private Date dataEntrada;
	
	@Column(name = "tb_canal_vend")
	private char canalVenda;
	
	@Column(name = "tb_corretora")
	private String corretora;
	
	@Column(name = "tb_status_atual")
	private String statusAtual;
	
	@Column(name = "tb_moti_cancel")
	private Text motivoCancel;
	
}
