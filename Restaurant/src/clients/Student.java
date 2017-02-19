package clients;

import java.util.ArrayList;

import menuItems.AbstractMenuItem;

public class Student extends AbstractClient{

	protected Student(String name) {
		super(name, 10);
	}

	@Override
	ArrayList<AbstractMenuItem> makeOrder() {
		// TODO Auto-generated method stub
		return null;
	}

}
