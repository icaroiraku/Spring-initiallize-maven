package com.pryde.prydecrudd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pryde.prydecrudd.entity.Zurich;
import com.pryde.prydecrudd.repository.ZurichRepository;
import com.pryde.prydecrudd.serviceimpl.ZurichServiceImplements;


@Service
public class ZurichService implements ZurichServiceImplements {

	 @Autowired
	  private ZurichRepository zurichRepository;
	  
	  @Override
	  public Zurich salvarZurich(Zurich zurich) {
		  return zurichRepository.save(zurich);
	  }

}



