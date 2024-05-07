package MachineCoding.Rental.models;

import java.util.List;

public class Vehicle {

	String name;
	
	int freq;
	
	int price;
	
	List<Slot> allBookedSlots;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFreq() {
		return freq;
	}

	public void setFreq(int freq) {
		this.freq = freq;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public List<Slot> getAllBookedSlots() {
		return allBookedSlots;
	}

	public void setAllBookedSlots(List<Slot> allBookedSlots) {
		this.allBookedSlots = allBookedSlots;
	}

	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", freq=" + freq + ", price=" + price + ", allBookedSlots=" + allBookedSlots
				+ "]";
	}

	public Vehicle(String name, int freq, int price, List<Slot> allBookedSlots) {
		super();
		this.name = name;
		this.freq = freq;
		this.price = price;
		this.allBookedSlots = allBookedSlots;
	}

	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
