package chapter01;

import java.io.Serializable;

public class Person implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1338046095830859334L;
	
	public final String name;
	
	public Person() {
		name = "婚事魔王";
	}
	
	public String getName() {
		return name;
	}
	
	
	
}
