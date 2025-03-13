package com.springExample.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springExample.Mapper.EmployeeRowMapper;
import com.springExample.entities.Employee;

@Repository
public class EmployeeRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int save(Employee emp) 
    {
        return jdbcTemplate.update("INSERT INTO spring_api_employee (id, FIRST_NAME, SECOND_NAME, email, password) VALUES (?, ?, ?, ?, ?)",
                emp.getId(), emp.getFirstName(), emp.getSecondName(), emp.getEmail(), emp.getPassword());
    }
    
    
    

    public Employee findById(int id) 
    {
        return jdbcTemplate.queryForObject("SELECT * FROM spring_api_employee WHERE id = ?", new EmployeeRowMapper(), id);
    }
    
    

    public List<Employee> findAll() 
    {
        return jdbcTemplate.query("SELECT * FROM spring_api_employee", new EmployeeRowMapper());
    }
    
    

    public int update(Employee emp) 
    {
        return jdbcTemplate.update("UPDATE spring_api_employee SET  FIRST_NAME=?,SECOND_NAME=?, email=?, password=? WHERE id=?",
                emp.getFirstName(), emp.getSecondName(), emp.getEmail(), emp.getPassword(), emp.getId());
    }
    
    

    public int delete(int id) 
    {
        return jdbcTemplate.update("DELETE FROM spring_api_employee WHERE id = ?", id);
    }
    
    
}