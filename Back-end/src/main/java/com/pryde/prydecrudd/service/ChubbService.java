package com.pryde.prydecrudd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pryde.prydecrudd.entity.Chubb;
import com.pryde.prydecrudd.repository.ChubbRepository;
import com.pryde.prydecrudd.serviceimpl.ChubbServiceImplements;

@Service
public class ChubbService implements ChubbServiceImplements{
	
  @Autowired
  private ChubbRepository chubbRepository;
  
  @Override
  public Chubb salvarChubb(Chubb chubb) {
	  return chubbRepository.save(chubb);
  }

}
