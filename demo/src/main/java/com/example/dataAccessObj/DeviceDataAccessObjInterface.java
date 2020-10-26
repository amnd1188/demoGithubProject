package com.example.dataAccessObj;

import java.util.List;

import com.example.device.Device;

public interface DeviceDataAccessObjInterface {
	
	Device addDevice(Device device);
	Device getDevice(int deviceId);
    int updateDevice(int id, Device device);
	int deleteDevice(int deviceId);
	List<Device> getAllDevices();
}
