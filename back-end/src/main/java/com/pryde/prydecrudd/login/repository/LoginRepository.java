package com.pryde.prydecrudd.login.repository;

import com.pryde.prydecrudd.login.entity.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<Login,Long> {

    Login getByUsernameAndPassword(String usuario, String senha);
}
