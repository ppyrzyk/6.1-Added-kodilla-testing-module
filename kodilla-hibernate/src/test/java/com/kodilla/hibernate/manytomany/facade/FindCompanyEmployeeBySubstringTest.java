package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static junit.framework.TestCase.assertEquals;

@SpringBootTest
public class FindCompanyEmployeeBySubstringTest {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private CompanyEmployeeFacade companyEmployeeFacade;

    @Test
    public void testSearchingCompany() {
//        Given
        Company apple = new Company("apple");
        Company google = new Company("google");
        Company microsoft = new Company("microsoft");

        companyDao.save(apple);
        companyDao.save(google);
        companyDao.save(microsoft);

//        When
        List<Company> companies = companyEmployeeFacade.searchCompaniesBySubstring("oog");

//        Then
        assertEquals( 1, companies.size());
    }
}
