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
@Table(name = "Funcionario")
public class Funcionario implements Serializable{


private static final long serialVersionUID = 460515535873457428L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "tb_id")
	private Long id;
	
	
	
	
}
