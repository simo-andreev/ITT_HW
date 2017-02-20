package restorant;

import java.util.ArrayList;
import java.util.HashMap;

import clients.AbstractClient;
import menuItems.AbstractMenuItem;

public class Waiter {

	String name;
	double tips;
	
	HashMap<AbstractClient, ArrayList<AbstractMenuItem>> orders;
	
	public void reciveTip(double sum){
		if(sum < 0)
			throw new IllegalArgumentException("Negative values are not allowed: " + sum);
		this.tips += sum;
	}
	
	public double bringBill(AbstractClient cli){
		//TODO - get tottal value of client's oprders.
		return 0;		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}
