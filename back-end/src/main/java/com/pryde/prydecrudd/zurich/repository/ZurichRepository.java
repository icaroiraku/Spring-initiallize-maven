package com.pryde.prydecrudd.zurich.repository;

import com.pryde.prydecrudd.zurich.entity.Zurich;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZurichRepository extends JpaRepository<Zurich,Long> {

}
