package parkinglot;

public class Vehicle {
	private Type vehicleSize;
	private String vehicleNumber;
	private String ownerName;
	
	public Type getVehicleSize() {
		return vehicleSize;
	}
	public void setVehicleSize(Type vehicleSize) {
		this.vehicleSize = vehicleSize;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	
}
