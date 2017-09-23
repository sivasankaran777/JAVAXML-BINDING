package com.DAO;
import javax.xml.bind.annotation.*;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement (name="Employee")
public class Employee {
	
	@XmlElement(name="Id")
	public int id;
	@XmlElement(name="Name")
	public String name;
	@XmlElement(name="Address")
	public String address;
	@XmlElement(name="City")
	public String city;
	@XmlElement(name="State")
	public String State;
	@XmlElement(name="Contact")
	public int contact;
	
	public Employee(int i, String string, String string2, String string3, String string4, int j) {
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", city=" + city + ", State=" + State
				+ ", contact=" + contact + "]";
	}
	
	public Employee()
	{
		super();
	}

}

