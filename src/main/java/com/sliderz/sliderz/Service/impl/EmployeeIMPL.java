package com.sliderz.sliderz.Service.impl;

import com.sliderz.sliderz.Dto.EmployeeDTO;
import com.sliderz.sliderz.Entity.Employee;
import com.sliderz.sliderz.Service.EmployeeService;

public class EmployeeIMPL implements EmployeeService {
    @Override
    public String addEmployee(EmployeeDTO employeeDTO) {


        Employee employee = new Employee(
                employeeDTO.getEmployeeid(),
                employeeDTO.getEmployeename(),
                employeeDTO.getEmail(),

                this.passwordEncorder.encode(
                        employeeDTO.getPassword()
                )
        );

        employeeRepo.save(employee);

        return employee.getEmployeename();

    }
}
