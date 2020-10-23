package com.everis.person.controllers;

import com.everis.person.services.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
	
	@Autowired
	private IPersonService iPersonService;
	
	@GetMapping("/core/persons/{dni}")
	public Boolean finByDni(@PathVariable Integer dni) {
		return iPersonService.getValueFingerprint(dni);
	} 

}
