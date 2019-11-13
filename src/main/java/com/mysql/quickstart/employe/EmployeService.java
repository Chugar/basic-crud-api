package com.mysql.quickstart.employe;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeService {

	@Autowired
	EmployeRepository repository;

	public List<Employe> findAll() {
		List<Employe> employesList = new ArrayList<Employe>();
		repository.findAll().forEach(employesList::add);
		return employesList;
	}

}
