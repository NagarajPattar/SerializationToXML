package com.myzee.serialization_to_xml;

import java.io.Serializable;

public class Worker implements Serializable {
	
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
