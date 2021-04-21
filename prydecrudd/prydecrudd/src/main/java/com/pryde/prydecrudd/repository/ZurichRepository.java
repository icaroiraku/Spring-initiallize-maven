package com.pryde.prydecrudd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pryde.prydecrudd.entity.Zurich;

@Repository
public interface ZurichRepository extends JpaRepository<Zurich,Long> {

}
