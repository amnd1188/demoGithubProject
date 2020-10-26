package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeviceService {

	@Autowired
	private DeviceRepository repo;

	public List<Device> listAll() {
		return repo.findAll();
	}

	public void save(Device device) {
		repo.save(device);
	}

	public Device get(Integer id) {
		return repo.findById(id).get();
	}

	public void delete(Integer id) {
		repo.deleteById(id);
	}
}
