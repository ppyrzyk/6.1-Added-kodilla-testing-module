package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.hibernate.QueryException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyEmployeeFacade {

    private final CompanyDao companyDao;
    private final EmployeeDao employeeDao;
    private static final Logger LOGGER = LoggerFactory.getLogger(CompanyEmployeeFacade.class);

    @Autowired
    public CompanyEmployeeFacade(CompanyDao companyDao, EmployeeDao employeeDao) {
        this.companyDao = companyDao;
        this.employeeDao = employeeDao;
    }
    public List<Company> searchCompaniesBySubstring(String substring) throws QueryException {
        LOGGER.info("Name of a company that includes" + substring);
        List<Company> companies = companyDao.searchCompaniesBySubstring("%" + substring + "%");

        if (companies.size() == 0) {
            LOGGER.error(String.format(com.kodilla.hibernate.manytomany.facade.QueryException.COMPANY_NOT_FOUND, substring));
            throw new QueryException(com.kodilla.hibernate.manytomany.facade.QueryException.COMPANY_NOT_FOUND);
        }
        return companies;
    }
    public List<Employee> searchEmployeeBySubstring(String substring) throws QueryException {
        LOGGER.info("Searching for employee with given phrase: " + substring);
        List<Employee> employees = employeeDao.searchEmployeeBySubstring("%" + substring + "%");

        if (employees.size() == 0) {
            LOGGER.error(String.format(com.kodilla.hibernate.manytomany.facade.QueryException.EMPLOYEE_NOT_FOUND, substring));
            throw new QueryException(com.kodilla.hibernate.manytomany.facade.QueryException.EMPLOYEE_NOT_FOUND);
        }
        return employees;
    }
}
