package com.pryde.prydecrudd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pryde.prydecrudd.entity.Chubb;

@Repository
public interface ChubbRepository extends JpaRepository<Chubb,Long> {

}
