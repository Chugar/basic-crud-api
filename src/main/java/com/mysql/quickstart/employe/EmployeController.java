package com.mysql.quickstart.employe;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeController {
	
	@Autowired
	EmployeService service;
	
	@RequestMapping("/employes")
	public List<Employe> getAllEmployes() {
		return service.findAll();
	}

}
