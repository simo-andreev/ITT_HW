import java.util.HashMap;

public class GasStation {

	
	double daylyTurnover;
	HashMap<VehicleType,HashMap<VignettePeriod, Vignette>> inventory;
	
	
	private void populateInventory(){
		//TODO add 10k random vignettes in inventory
	}
	
	private Vignette generateRandomVignette(){
		//TODO generate a new random vignette
		return null;
	}
	
	
	public Vignette sellVignette(Driver buyer, VehicleType vhcType, VignettePeriod period){
		/*TODO 
		 * 
		 * if(hasVignette){
		 * 		vgn = firstAppropriateVgn;
		 * 		if(buyer.paysUp){
		 * 			this.cash += price;
		 * 			return vgn;
		 * 		}
		 * }
		 * return null;
		 */
		
		return null;
	}
	
	
}
