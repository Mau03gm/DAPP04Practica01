
package com.example.employeeCrud.controller;

/**
 *
 * @author gatoj
 */

import com.example.employeeCrud.DTO.employeeDTO;
import com.example.employeeCrud.entity.employeeForm;
import com.example.employeeCrud.service.employeeService;
import jakarta.validation.Valid;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping(path = "/crud/empleados/")
@RequiredArgsConstructor

public class EmployeeContoller {
    private final employeeService employeeService;
    
    @PostMapping
    public ResponseEntity saveDoctor(@RequestBody @Valid employeeForm form) {
        return ResponseEntity.status(HttpStatus.CREATED).body(employeeService.createEmployee(form));
    }
    
     @GetMapping
    public List<employeeDTO> getAllEmployees() {
        List <employeeDTO>  employees =  employeeService.findAllEmployees();
        return employees;
    }

    @PatchMapping("{employeeId}")
    public ResponseEntity<employeeDTO> updateEmployee(
            @RequestBody @Valid employeeForm form,
            @PathVariable("employeeId") final int employeeId)
            throws Exception {
        employeeService.updateEmployee(form, employeeId);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("{employeeId}")
    public  ResponseEntity<employeeDTO> delete(@PathVariable("employeeId") final int employeeId)
            throws Exception{
        employeeService.deleteEmployee(employeeId);
        return  ResponseEntity.ok().build();
    }
    
}

