package com.exam.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import java.util.Optional;
import com.exam.entity.Employee;
import com.exam.repository.EmpRepo;
@Service
public class EmpService {
	@Autowired
	private EmpRepo repo;

	public void addEmp(Employee e)
	{
 repo.save(e);
}
	public List<Employee> getALLEmp(){
		return repo.findAll();
	}

public Employee getEMpById (int id) {
	Optional<Employee> e=repo.findById(id);
	if (e.isPresent())
	{
		return e.get();
	}
	return null ;
}}
