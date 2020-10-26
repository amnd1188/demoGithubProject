package com.example;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeviceController {

	@Autowired
	private DeviceService service;

	@GetMapping("/devices")
	public List<Device> list() {
		return service.listAll();
	}

	@GetMapping("/devices/{id}")
	public ResponseEntity<Device> get(@PathVariable Integer id) {
		try {
			Device device = service.get(id);
			return new ResponseEntity<Device>( device, HttpStatus.OK);
		
		}catch(NoSuchElementException e){
			return new ResponseEntity<Device>(HttpStatus.NOT_FOUND);
		}
		
	}
	
	@PostMapping("/devices")
	public void add(@RequestBody Device device) {
		service.save(device);
	}
	
	@PutMapping("/devices/{id}")
	public ResponseEntity<?> update(@RequestBody Device device, @PathVariable Integer id) {
		try {
			Device existDevice = service.get(id);
			service.save(device);
			return new ResponseEntity<>(HttpStatus.OK);
		
		} catch(NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/devices/{id}")
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}
	
	
}
