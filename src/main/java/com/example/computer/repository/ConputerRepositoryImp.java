package com.example.computer.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.computer.model.Device;
import com.example.computer.model.DeviceRowMapper;
import com.example.computer.model.Manufacture;
import com.example.computer.model.ManufactureRowMapper;


@Repository
public class ConputerRepositoryImp implements ConputerRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    
    @Override
    public List<Manufacture> getAllComputerManager() {
        String query =  "select id, code, name, address from manufactures";
        List<Manufacture> list = jdbcTemplate.query(query,new ManufactureRowMapper());
        return list;
    }


 


    @Override
    public List<Device> getAllDeviceManager(Integer id) {
            String sql = "SELECT id, code, name, type, quantity, price , man_id FROM device WHERE man_id = ?";
           List<Device> device = jdbcTemplate.query(sql, new DeviceRowMapper(), id);
            return device;
        }
        // jdbcTemplate.queryForObject(sql, new DeviceRowMapper(), id);



    // @Override
    // public List<Device> getAllDeviceManager() {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'getAllDeviceManager'");
    // }


   

  
    

    

    
}
