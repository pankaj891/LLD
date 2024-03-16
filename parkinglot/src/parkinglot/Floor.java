package parkinglot;

import java.util.List;

public class Floor {
	
	private List<Slot> slotList;
	private String floorName;
	private Integer floorNumber;
	
	public List<Slot> getSlotList() {
		return slotList;
	}
	public void setSlotList(List<Slot> slotList) {
		this.slotList = slotList;
	}
	public String getFloorName() {
		return floorName;
	}
	public void setFloorName(String floorName) {
		this.floorName = floorName;
	}
	public Integer getFloorNumber() {
		return floorNumber;
	}
	public void setFloorNumber(Integer floorNumber) {
		this.floorNumber = floorNumber;
	}
	
	
	
}
