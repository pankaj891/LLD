package parkinglot;

public class Slot {

	private Integer slotNumber;
	private Vehicle vehicle;
	private Type slotSize;
	
	public Integer getSlotNumber() {
		return slotNumber;
	}
	public void setSlotNumber(Integer slotNumber) {
		this.slotNumber = slotNumber;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public Type getSlotSize() {
		return slotSize;
	}
	public void setSlotSize(Type slotSize) {
		this.slotSize = slotSize;
	}
	
	
}
