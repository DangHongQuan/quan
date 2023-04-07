package com.example.computer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Device {
    private int id;
    private String code;
    private String name;
    private String type;
    private int quantity;
    private double price;
    private Manufacture manufacture;
   
    
}
