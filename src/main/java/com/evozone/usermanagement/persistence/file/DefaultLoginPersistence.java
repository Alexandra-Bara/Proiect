/**
 * 
 */
package com.evozone.usermanagement.persistence.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.stereotype.Component;

import com.evozone.usermanagement.persistence.IloginPersistence;
import com.evozone.usermanagement.persistence.PersistenceException;
import com.evozone.usermanagement.service.Person;

/**
 * @author alexandrabara
 *
 */

@Component
public class DefaultLoginPersistence implements IloginPersistence {

	public DefaultLoginPersistence(){

	}


	public List<Person> getUser() {
		List<Person> pList = new ArrayList<Person>();

		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(
					"C:\\AlexandraBara\\environment\\workspace\\UserManagement\\fisier.csv"));

			String line = null;
			while((line = reader.readLine()) != null){
				Person person = new Person();
				String[] data = line.split(",");
				String username = data[0];
				String password = data[1];
				person.setUsername(username);
				person.setPassword(password);
				pList.add(person);
			}

			reader.close();
		} catch (Exception e) {
			throw new FilePersistenceException("Wrong!",e);
		}finally{
			
		}
		
		return pList;
	}
}
