package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dataAccessObj.DeviceDataAccessObjImple;
import com.example.device.Device;

@Service
public class DService {

	@Autowired
	private DeviceDataAccessObjImple deviceDaoImplement;
	

	public Device add(Device device) {
		return deviceDaoImplement.addDevice(device);
	}
	
	public Device getDevice(int id) {
		return deviceDaoImplement.getDevice(id);
	}

	public int update(int id, Device device) {
		return deviceDaoImplement.updateDevice(id, device);
	}

	public int delete(int id) {
		return deviceDaoImplement.deleteDevice(id);
	}

	public List<Device> getAll() {
		return deviceDaoImplement.getAllDevices();
	}
}