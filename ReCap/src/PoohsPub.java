import java.util.ArrayList;

public class PoohsPub {

	private String name;
	
	ArrayList<Animal> guests;
	
	public PoohsPub() {
		this.name = "Pooh's Pub";
		this.guests = new ArrayList<Animal>();
	}
	
	
	// use 2 marker interfaces and instantiate animals through them them
	// admitGuest then takes IHappyAnimal as a param.
	// but then I need to create the objects with the (I) in mind.
	// 
	
	
	public void admitGuest(Animal anm){
		if(anm.isHappy)
			guests.add(anm);
		else
			System.out.println("GET THE F*#K OUT!!!");
	}
	
	
}
