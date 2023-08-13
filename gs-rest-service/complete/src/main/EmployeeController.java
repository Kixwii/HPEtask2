package com.example.restservice;

import java.net.URI;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.restservice.services.Employees;
import com.example.restservice.EmployeeManager;

import java.util.List;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {
    
   private final Employees employeeService;

 @Autowired
 private EmployeeManager employeeManager;


   @GetMapping(path = "/", produces = "application/json")
   public Employees getAllEmployees(){

    return employeeManager.getAllEmployees();
   }


}
