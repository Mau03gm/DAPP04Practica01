/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.employeeCrud.DTO;

/**
 *
 * @author gatoj
 */
import com.example.employeeCrud.entity.employee;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import org.jsondoc.core.annotation.ApiObjectField;

/**
 *
 * @author gatoj
 */
@Data
@Builder
@Getter
public class employeeDTO {
    @ApiObjectField(name = "id", description = "Doctor's id")
    private int id;

    @ApiObjectField(name = "name", description = "Doctor's name")
    private String name;

    @ApiObjectField(name = "address", description = "Doctor's address")
    private String address;

    @ApiObjectField(name = "phoneNumber", description = "Doctor's phone number")
    private String phoneNumber;

    
    public static employeeDTO build(final employee e) {
        return employeeDTO.builder()
                .id(e.getId())
                .name(e.getName())
                .address(e.getAddress())
                .phoneNumber(e.getPhoneNumber())
                .build();
    }
    

}