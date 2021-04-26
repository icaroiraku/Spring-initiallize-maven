package com.pryde.prydecrudd.repository;

import com.pryde.prydecrudd.entity.Chubb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChubbRepository extends JpaRepository<Chubb,Long> {

}
