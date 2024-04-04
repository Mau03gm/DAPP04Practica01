/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.employeeCrud.entity;

import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Email;
import java.io.Serializable;
import lombok.Data;
import org.jsondoc.core.annotation.ApiObjectField;

/**
 *
 * @author gatoj
 */
@Data
public class employeeForm implements Serializable  {
    
     @ApiObjectField(name = "name", description = "Doctor's name")
    @Size(max = 100, message = "{name.right.length}")
    private String name;

    @ApiObjectField(name = "address", description = "Doctor's address")
    @Size(max = 500, message = "{address.right.length}")
    private String address;

    @ApiObjectField(name = "phoneNumber", description = "Doctor's phone number")
    @Size(max = 13, message = "{phoneNumber.right.length}")
    private String phoneNumber;


}