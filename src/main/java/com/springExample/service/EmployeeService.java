package com.springExample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springExample.entities.Employee;
import com.springExample.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	
	
    @Autowired
    private EmployeeRepository repository;

    public Employee save(Employee emp)
    {
        repository.save(emp);
        return emp;
    }
    
    

    public Employee getById(int id) 
    {
        return repository.findById(id);
    }

    public List<Employee> getAll() 
    {
        return repository.findAll();
    }

    public Employee update(Employee emp) 
    {
        repository.update(emp);
        
        
        return emp;
    }

    public void delete(int id) 
    {
    	
        repository.delete(id);
    }
}
