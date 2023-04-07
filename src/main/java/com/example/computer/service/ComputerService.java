package com.example.computer.service;

import java.util.List;

import com.example.computer.model.Device;
import com.example.computer.model.Manufacture;

public interface ComputerService {

   

    List<Manufacture> getAllComputerManager();

    List<Device> getAllDeviceManager(Integer manId);

 

   

    // List<Device> getAllDeviceManager();
    
}
