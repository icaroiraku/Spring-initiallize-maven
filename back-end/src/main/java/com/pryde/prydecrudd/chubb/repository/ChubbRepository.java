package com.pryde.prydecrudd.chubb.repository;

import com.pryde.prydecrudd.chubb.entity.Chubb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChubbRepository extends JpaRepository<Chubb,Long> {

}
