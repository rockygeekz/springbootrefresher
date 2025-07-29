package com.rakesh.spring_emp.repository;

import com.rakesh.spring_emp.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
