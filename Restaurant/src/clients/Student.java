package clients;

import java.util.ArrayList;

import menuItems.AbstractMenuItem;

public class Student extends AbstractClient{

	public Student(String name) {
		super(name, 10);
	}

	@Override
	ArrayList<AbstractMenuItem> makeOrder() {
		ArrayList<AbstractMenuItem> order;
		
		//TODO
		
	}

}
