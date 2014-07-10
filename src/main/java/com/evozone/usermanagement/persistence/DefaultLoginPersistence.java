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

import com.evozone.usermanagement.service.Person;

/**
 * @author alexandrabara
 *
 */


public class DefaultLoginPersistence implements IloginPersistence {
	
	public DefaultLoginPersistence(){
		
	}
	
	public List<Person> dataFromFile(){
		 List<Person> pList = new ArrayList<Person>();
		 
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(
			        "fisier.csv"));
			String line = null;
	        Scanner scanner = null;
	        int index = 0;
	       
	 
	        while ((line = reader.readLine()) != null) {
	            Person p = new Person();
	            scanner = new Scanner(line);
	            scanner.useDelimiter(",");
	            while (scanner.hasNext()) {
	                String data = scanner.next();
	                if (index == 0)
	                    p.setUsername(data);
	                else if (index == 1)
	                	p.setPassword(data);
	                index++;
	            }
	            index = 0;
	            pList.add(p);
	        }
	         
	        //close reader
	        reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

        return pList;
	}
}
