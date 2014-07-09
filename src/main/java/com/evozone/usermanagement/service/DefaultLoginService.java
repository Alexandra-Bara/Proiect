package com.evozone.usermanagement.service;

import org.springframework.stereotype.Service;

@Service
public class DefaultLoginService implements IloginService {
	
	public static final String username = "Ale";
	public static final String password = "ale";
	
	public DefaultLoginService(){
		
	}

	@Override
	public boolean findUser(Person person) {
		if(username.equals(person.getUsername()) == true && password.equals(person.getPassword()) == true )
		    {
				return true;
			}
		return false;
	}
}
