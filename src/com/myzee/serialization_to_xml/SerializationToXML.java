package com.myzee.serialization_to_xml;

import java.beans.ExceptionListener;
import java.beans.XMLEncoder;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;

public class SerializationToXML {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		Worker w = new Worker(1, "nagaraj");
		Worker w = new Worker();
		w.setId(1);
		w.setName("nagaraj");
		
		FileOutputStream fos = new FileOutputStream("ser.xml");
		XMLEncoder encoder = new XMLEncoder(fos);
		
		// Setting exception listener to be thrown
		encoder.setExceptionListener(new ExceptionListener() {
			
			@Override
			public void exceptionThrown(Exception e) {
				// TODO Auto-generated method stub
				System.out.println("Exception thrown is - " + e.toString());
			}
		});
		
		// writing the object 
		encoder.writeObject(w);
		encoder.close();
		fos.close();
		System.out.println("worker object serilized");
	}
}

// Worker class should be public to serialize it.
// unless its public, we will get exception as
// java.lang.IllegalAccessException: Class sun.reflect.misc.Trampoline can not access a member of class ""
// So commenting the below Worker class and creating it in separate file as Worker.java as public class

/*
class Worker implements Serializable {
	
	//private static final long serialVersionUID = -4574626925754330853L;
	private int id;
	private String name;
	
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

}
*/