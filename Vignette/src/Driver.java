import java.time.LocalDate;
import java.util.ArrayList;

public class Driver {

	private String name;
	private double cash;
	private ArrayList<Vehicle> vehicles;
	private GasStation prefferedGasStation;
	
	
	public void buyVignette(){
		//TODO
	}
	public void buyVignette(Vehicle vhc, VignettePeriod period){
		//TODO
	}
	public void buyVignette(int vehicleNumber, VignettePeriod period){
		//TODO
	}
	
	
	public void listVehicles(){
		//TODO prilt a list of all vehicles
	}
	
	public void listExpiredVignettes(){
		//TODO 
	}
	
	public void listExpiredVignettes(LocalDate date){
		//TODO
	}
	
	
	public void addVehicle(Vehicle vhc){
		//TODO add vhc to vehicles. Make sure it isn't already owned;
	}
	
	public int getVehicleNumber(Vehicle vhc){
		//TODO return number(index + 1) of vehicle passed. -1 if not present; 
		return 0;
	}
	
	
	
	
	
}
