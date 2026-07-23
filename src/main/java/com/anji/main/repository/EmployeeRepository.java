package com.anji.main.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anji.main.entities.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}