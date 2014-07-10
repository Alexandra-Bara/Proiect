/**
 * 
 */
package com.evozone.usermanagement.persistence;

import java.util.List;

import com.evozone.usermanagement.service.Person;

/**
 * @author alexandrabara
 *
 */
public interface IloginPersistence {

	public List<Person> dataFromFile();
}
