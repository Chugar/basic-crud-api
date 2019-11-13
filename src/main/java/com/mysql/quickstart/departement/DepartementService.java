package com.mysql.quickstart.departement;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DepartementService {

	
	@Autowired
	DepartementRepository repository;
	
	
	
	public List<Departement> findAll() {
		 
		List<Departement> departementsList = new ArrayList<Departement>();
		repository.findAll().forEach(departementsList::add);
		return departementsList;
	}
}
