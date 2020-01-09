package groups_and_collections_pt_2;

public class Vehicle {
	
	String make;
	String model;
	int price;
	boolean fourWlDrive;
	
	
	
	public Vehicle(String make, String model, int price, boolean fourWlDrive) {
		super();
		this.make = make;
		this.model = model;
		this.price = price;
		this.fourWlDrive = fourWlDrive;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "Vehicle [make=" + make + ", model=" + model + ", price=" + price + ", fourWlDrive=" + fourWlDrive + "]";
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isFourWlDrive() {
		return fourWlDrive;
	}
	public void setFourWlDrive(boolean fourWlDrive) {
		this.fourWlDrive = fourWlDrive;
	}
	
	

}
