package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Employee;
import jakarta.transaction.Transactional;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Transactional
@Repository
public interface EmployeeDao extends CrudRepository<Employee, Integer > {

    @Query
    List<Employee> searchEmployeeByLastName(@Param("SEARCHKEY") String searchKey);

    @Query
    List<Employee> employeeQuery(@Param("LASTNAME") String lastName);
}

