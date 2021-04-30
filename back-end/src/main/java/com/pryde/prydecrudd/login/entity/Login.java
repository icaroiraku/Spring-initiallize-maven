package com.pryde.prydecrudd.login.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Table(name = "tb_login")
@Entity
public class Login implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "num_id")
    private Long id;

    @Column(name = "tb_idFunc")
    private String idFunc;

    @Column(name = "tx_usuario")
    private String username;

    @Column(name = "tx_senha")
    private String password;
}
