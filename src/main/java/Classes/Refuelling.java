package Classes;

public class Refuelling extends EventProperties {

	private String amountOfFuel;
	
	/**
	 * Konstruktor obiektu Refuelling
	 */
	public Refuelling(String course, String price, String amountOfFuel, java.util.Date date, int vehicleId) {
			this.course = course;
			this.price = price;
			this.amountOfFuel = amountOfFuel;
			this.dateOfEvent = date;
			this.vehicleId = vehicleId;
	}
	

	public String getAmountOfFuel() {
		return amountOfFuel;
	};
	
	
}
