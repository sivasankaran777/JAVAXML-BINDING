package com.DAO;

import javax.xml.bind.*;
import java.io.*;
public class EmployeeDAO {

	public void marhsaller ()
	{
		
		Employee e = new Employee();
		e.setId(1);
		e.setName("Sivasankaran");
		e.setAddress("Hostel");
		e.setCity("Hyderabad");
		e.setContact(1234546);
		e.setState("Telegana");
		try {
			JAXBContext jc= JAXBContext.newInstance(Employee.class);
			Marshaller marhsall= jc.createMarshaller();
			marhsall.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marhsall.marshal(e, System.out);
			marhsall.marshal(e, new File("src\\Employee.xml"));
		} catch (JAXBException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	
	public void unmarshal ()
	{
		try {
			JAXBContext jc =JAXBContext.newInstance(Employee.class);
			Unmarshaller unms = jc.createUnmarshaller();
			Employee e= (Employee) unms.unmarshal(new File("src\\Employee.xml"));
			System.out.println("Id "+ e.getId());
			System.out.println("Name "+ e.getName());
			System.out.println("Address"+ e.getAddress());
			System.out.println("City "+ e.getCity());
			System.out.println("State "+ e.getState());
			System.out.println("Contact "+ e.getContact());
			
			
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
