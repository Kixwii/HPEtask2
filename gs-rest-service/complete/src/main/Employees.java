package com.example.restservice;

import org.springframework.sterotype.Service;

import java.util.ArrayList;
import java.util.List;
import com.example.resteservices.models.Employee;

@Service
public class Employees{
    
    public List<Employee> employeeList;

    public List<Employee> getAllEmployees(){

        if(employeeList == null){
            employeeList = new ArrayList<>();
        }
      
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList){

        this.employeeList = employeeList;
    }


    //method that gets an employee by id
    public Employee getEmployeeById(Long id){
        int i = 0;
        int j = employeeList.size()-1;

        while(i < j){

            if(employeeList.getAtIndex(i).getEmployeeId == id){

                return employeeList.getAtIndex(i);

            }else{
             
                i++;
            }

        }
        return null;
    }
}

