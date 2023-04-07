package com.example.computer.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ManufactureRowMapper implements RowMapper<Manufacture> {

    @Override
    public Manufacture mapRow(ResultSet rs, int rowNum) throws SQLException {
        Manufacture manufacture = new Manufacture();
        manufacture.setId(rs.getInt("id"));
        manufacture.setCode(rs.getString("code"));
        manufacture.setName(rs.getString("name"));
        manufacture.setAddress(rs.getString("address"));
        return manufacture;
    }
    
}
