package com.example.device;

public class Device {

	 int Id;
	 String Device_name;
	 String Device_status;
	 String Device_model;
	 String Enrolled_time;
	
	public Device() {
		
	}
	
	public Device(int id, String device_name, String device_status, String device_model, String enrolled_time) {
		super();
		Id = id;
		Device_name = device_name;
		Device_status = device_status;
		Device_model = device_model;
		Enrolled_time = enrolled_time;
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getDevice_name() {
		return Device_name;
	}
	public void setDevice_name(String device_name) {
		Device_name = device_name;
	}
	public String getDevice_status() {
		return Device_status;
	}
	public void setDevice_status(String device_status) {
		Device_status = device_status;
	}
	public String getDevice_model() {
		return Device_model;
	}
	public void setDevice_model(String device_model) {
		Device_model = device_model;
	}
	public String getEnrolled_time() {
		return Enrolled_time;
	}
	public void setEnrolled_time(String enrolled_time) {
		Enrolled_time = enrolled_time;
	}


	@Override
	public String toString() {
		return "Device [id=" + Id + ", device_name=" + Device_name + ", device_status=" + Device_status + ", device_model=" + Device_model + ", enrolled_time=" + Enrolled_time + "]";
	}

	
	
}
