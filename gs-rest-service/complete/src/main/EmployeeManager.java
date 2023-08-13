package com.example.restservice;

import org.springframework.sterotype.Repository;

import com.example.restservices.models.Employees;
import java.util.list;


@Repository
public class EmployeeManager {
    

    private static Employees list = new Employees();

    static{
        list.getAllEmployees().add(new Employee(
        1,
        "Munene",
        "Mwenda",
        "kinuthia@gmail.com",
        "Mr"
        ));


        list.getAllEmployees().add(new Employee(
        2,
        "Ian",
        "Mugambi",
        "alsatian@gmail.com",
        "Dr."
        ));

        list.getAllEmployees().add(new Employee(
         3,
        "Cate", 
         "Mumbua",
         "catemumbua@gmail.com",
         "Mrs."
        ));
    }

    public Employees getAllEmployees(){
        return list;
    }

    public void addEmployee(Employee employee){
        list.getEmployeeList().add(employee);
    }
}
