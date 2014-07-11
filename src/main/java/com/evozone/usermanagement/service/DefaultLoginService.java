package com.evozone.usermanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evozone.usermanagement.persistence.IloginPersistence;

@Service
public class DefaultLoginService implements IloginService {
	
	@Autowired
	private IloginPersistence iloginPersistence;
	
	public DefaultLoginService(){
		
	}

	@Override
	public Person findUser(Person person) {
		for (Person dest :  iloginPersistence.getUser()) {			
			if(person.getUsername().equals(dest.getUsername())){
				return person;
			}	            
		}
		return null;	
	}
}
