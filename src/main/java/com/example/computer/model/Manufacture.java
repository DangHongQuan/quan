package com.example.computer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Manufacture {
    private int id;
    private String code;
    private String name;
    private String address;
}
