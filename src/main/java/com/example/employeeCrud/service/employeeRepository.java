/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.employeeCrud.service;

import com.example.employeeCrud.entity.employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 *
 * @author gatoj
 */
@Repository
public interface employeeRepository extends JpaRepository<employee, Integer>, JpaSpecificationExecutor<employee> {

   
    
}

