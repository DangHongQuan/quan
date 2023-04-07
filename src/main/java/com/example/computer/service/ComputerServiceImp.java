package com.example.computer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.computer.model.Device;
import com.example.computer.model.Manufacture;
import com.example.computer.repository.ConputerRepository;



@Service
public class ComputerServiceImp implements ComputerService {

    @Autowired
    private ConputerRepository repository;

   
    @Override
    public List<Manufacture> getAllComputerManager() {
        List<Manufacture> list =repository.getAllComputerManager();
        return   list;  
    }


    @Override
    public List<Device> getAllDeviceManager(Integer manId) {
        List<Device> list =repository.getAllDeviceManager(manId);
        return list; 
    }


  




    

    // @Override
    // public List<Device> getAllDeviceManager(Integer id) {
    //     Device device =repository.findOptionsComputer(id);
    //     return device;
    // }




   
}
