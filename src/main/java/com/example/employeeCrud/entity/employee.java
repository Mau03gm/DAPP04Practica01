/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.employeeCrud.entity;

/**
 *
 * @author gatoj
 */

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import lombok.AccessLevel;

import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 *
 * @author gatoj
 */
@Entity
@Getter
@Table(name="employee")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    
    @Column(name = "name", length = 100, nullable = false)
    private String name;
    
    @Column(name = "address", length = 500, nullable = false)
    private String address;

    @Column(name = "phone_number", length = 13, nullable = false)
    private String phoneNumber;

    public employee(final employeeForm form) {
        this.name = form.getName();
        this.address = form.getAddress();
        this.phoneNumber = form.getPhoneNumber();
    }

    
    public void updateEmployee(final employeeForm form){
        this.name=form.getName();
        this.address=form.getAddress();
        this.phoneNumber=form.getPhoneNumber();    }
}
