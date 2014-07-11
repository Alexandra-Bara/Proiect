/**
 * 
 */
package com.evozone.usermanagement.persistence;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.stereotype.Component;

import com.evozone.usermanagement.service.Person;

/**
 * @author alexandrabara
 *
 */

@Component
public class DefaultLoginPersistence implements IloginPersistence {
	
	public DefaultLoginPersistence(){
		
	}
	
	
	public List<Person> dataFromFile() {
		 List<Person> pList = new ArrayList<Person>();
		 
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(
			        "C:\\AlexandraBara\\environment\\workspace\\UserManagement\\fisier.csv"));
			
			String line = null;
			while((line = reader.readLine()) != null){
				Person p = new Person();
				String[] data = line.split(",");
				String u = data[0];
				String pass = data[1];
				p.setUsername(u);
				p.setPassword(pass);
				pList.add(p);
			}
			
			 reader.close();
	       } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return pList;
	}
	
	
	public void main(String args[]){
		 List<Person> pList = new ArrayList<Person>();
		 
			BufferedReader reader;
			try {
				reader = new BufferedReader(new FileReader(
				        "fisier.csv"));
				
				String line = null;
				while((line = reader.readLine()) != null){
					Person pers = new Person();
					String[] data = line.split(",");
					String u = data[0];
					String pass = data[1];
					System.out.println(data[0]+" "+ data[1]);
					pers.setUsername(u);
					pers.setPassword(pass);
					pList.add(pers);
				}
				
				 reader.close();
		       } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
