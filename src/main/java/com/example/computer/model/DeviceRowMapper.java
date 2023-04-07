package com.example.computer.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class DeviceRowMapper implements RowMapper<Device> {

    @Override
    public Device mapRow(ResultSet rs, int rowNum) throws SQLException {
      Device device=new Device();
      Manufacture manufacture= new Manufacture();
        device.setId(rs.getInt("id"));
        device.setCode(rs.getString("code"));
        device.setName(rs.getString("name"));
        device.setType(rs.getString("type"));
        device.setQuantity(rs.getInt("quantity"));
        device.setPrice(rs.getDouble("price"));
    // Lấy giá trị 'manufacture_id' từ ResultSet
    int manufactureId = rs.getInt("man_id");

    // Tạo đối tượng Manufacture chỉ với giá trị 'id'
    manufacture.setId(manufactureId);

    // Ánh xạ đối tượng Manufacture vào thuộc tính 'manufacture' của Device
    device.setManufacture(manufacture);

      return device;
    }
    
}
