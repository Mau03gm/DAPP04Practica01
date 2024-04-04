/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.employeeCrud.service;

import com.example.employeeCrud.DTO.employeeDTO;
import com.example.employeeCrud.entity.employee;
import com.example.employeeCrud.entity.employeeForm;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.function.Function;
import java.util.stream.Collectors;
/**
 *
 * @author gatoj
 */
@Service
@RequiredArgsConstructor
public class employeeService {
    private final employeeRepository er;
    
    public employeeDTO createEmployee(final employeeForm form) {
        final employee e  = new employee(form);
        er.save(e);
        return employeeDTO.build(e);
    }
    public List<employeeDTO> findAllEmployees() {
        final List<employee> ePage= er.findAll();
        return ePage.stream().map(employeeDTO::build).toList();
    }

    public employeeDTO updateEmployee(final employeeForm form, final int id) throws Exception {
        validateIfEmployeeExists(id);
        final employee e = er.findById(id).orElseThrow();
        e.updateEmployee(form);
        er.save(e);
        return employeeDTO.build(e);
    }

    public void deleteEmployee( final int id) throws Exception{
        validateIfEmployeeExists(id);
        er.deleteById(id);

    }

    public void validateIfEmployeeExists(final int Id) throws Exception {
        if (!er.existsById(Id)) {
            throw new Exception();
        }
    }
}

