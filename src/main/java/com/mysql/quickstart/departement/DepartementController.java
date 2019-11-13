package com.mysql.quickstart.departement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartementController {

	@Autowired DepartementService service;
	
	@RequestMapping("/departements")
	public List<Departement> getAllDepartements() {
		return service.findAll();
	}
}
