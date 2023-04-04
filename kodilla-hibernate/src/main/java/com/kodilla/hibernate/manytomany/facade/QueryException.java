package com.kodilla.hibernate.manytomany.facade;

public class QueryException extends Exception{

    public static final String COMPANY_NOT_FOUND = "Company not found";
    public static final String EMPLOYEE_NOT_FOUND = "Employee not found";

    public QueryException(String message) {
        super(message);
    }
 }
