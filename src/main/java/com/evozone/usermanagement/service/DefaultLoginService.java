package com.evozone.usermanagement.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
	public boolean findUser(Person person) {
		List<Person> list = new ArrayList<Person>();
		list= iloginPersistence.dataFromFile();
		
		Iterator<Person> it = list.iterator();
		while (it.hasNext()) {
			Person p = (Person) it.next();
			if(person.getUsername().equals(p.getUsername())==true && person.getPassword().equals(p.getPassword())== true){
				return true;
			}
			            
		}
		return false;	
		
	}
}
