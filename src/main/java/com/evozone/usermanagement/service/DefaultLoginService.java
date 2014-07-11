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
		boolean b = false;
		
		Iterator<Person> it = list.iterator();
		while (it.hasNext()) {
			Person p = it.next();
			if(person.equals(p)){
				b = true;
			}	            
		}
		return b;	
	}
}
