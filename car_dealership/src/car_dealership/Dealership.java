package car_dealership;

public class Dealership {

	public static void main(String[] args) {
		
		Customer cust1 = new Customer();
		
		cust1.setName("Tom");
		cust1.setAddress("123 Anything Street");
		cust1.setCashOnHand(25000);
		
		//set by constructor
		Vehicle vehicle = new Vehicle("Honda", "Accord", 1000);
		
		//set by getters and setters
//		Vehicle vehicle = new Vehicle();
//		vehicle.setMake("Honda");
//		vehicle.setModel("Accord");
//		vehicle.setPrice(10000);
		
		
		Employee employee = new Employee();
		
		cust1.purchaseCar(vehicle, employee, false);
		
		Vehicle car = new Vehicle("BMW", "M3", 20000);
		
		boolean value = car.equals(vehicle);
		System.out.println(value);
		
		
	}
	
	/**
	 * Employee Class
	 * handleCustomer(Customer cust, boolean finance, Vehicle vehicle);
	 * If finance is true 
	 * runCreditHistory(Customer cust, double loanAmount)
	 * else if (vehicle.getPrice()) <= cust.cashOnHand)
	 * processTransaction(Customer cust, Vehicle vehicle)
	 * else
	 * tell customer to bring more money
	 */

}
