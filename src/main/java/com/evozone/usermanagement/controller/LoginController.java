/**
 * 
 */
package com.evozone.usermanagement.controller;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.evozone.usermanagement.service.IloginService;
import com.evozone.usermanagement.service.Person;


/**
 * @author alexandrabara
 *
 */
@Controller
public class LoginController {
	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired //instantiaza clasa o singura data
	private IloginService ilogicService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		Person person = new Person();
		model.addAttribute("p", person);
		
		return "homelogin";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String userLogin(@ModelAttribute Person person,Model model) {
		
		if(ilogicService.findUser(person) == true)
		{
			return "succeslogin";
		}
		else
		{
			return "failedlogin";
	    }  
	}
	
	@RequestMapping(value = "/test/{stringUrl}", method = RequestMethod.GET)
	public String userUrl(@PathVariable String stringUrl,Model model){
		
		model.addAttribute("string",stringUrl);
		return "userurl";
	
	}
}
