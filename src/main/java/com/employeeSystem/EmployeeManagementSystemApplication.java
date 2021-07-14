package com.employeeSystem;

import com.employeeSystem.entity.Employee;
import com.employeeSystem.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeManagementSystemApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(EmployeeManagementSystemApplication.class, args);
    }
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void run(String... args) throws Exception {
//        Employee employee=new Employee(1L,"Doston","Azimov","900061316");
//        Employee employee1=new Employee(2L,"Umid","Meliboyev","996625252");
//        Employee employee2=new Employee(3L,"Saidali","Makhkamov","938214727");
//        Employee employee3=new Employee(4L,"Jamshid","Khayitov","904900096");
//        employeeRepository.save(employee);
//        employeeRepository.save(employee1);
//        employeeRepository.save(employee2);
//        employeeRepository.save(employee3);
    }
}
