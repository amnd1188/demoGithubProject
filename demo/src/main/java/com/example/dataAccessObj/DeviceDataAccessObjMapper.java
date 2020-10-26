package com.example.dataAccessObj;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import com.example.device.Device;

public class DeviceDataAccessObjMapper implements RowMapper<Device>{
	
	public Device mapRow(ResultSet rs, int rowNum) throws SQLException {
        Device device = new Device();
        device.setId(rs.getInt("Id"));
        device.setDevice_name(rs.getString("Device_name"));
        device.setDevice_status(rs.getString("Device_status"));
        device.setDevice_model(rs.getString("Device_model"));
        device.setEnrolled_time(rs.getString("Enrolled_time"));
        return device;
    }     

}
