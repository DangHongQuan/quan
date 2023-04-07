package com.example.computer.repository;

import java.util.List;

import com.example.computer.model.Device;
import com.example.computer.model.Manufacture;

public interface ConputerRepository {

    List<Manufacture> getAllComputerManager();

    List<Device> getAllDeviceManager(Integer manId);

    

    


  
    
}
